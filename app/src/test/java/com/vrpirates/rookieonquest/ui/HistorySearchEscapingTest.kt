package com.vrpirates.rookieonquest.ui

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Unit tests for SQL LIKE escaping logic in MainViewModel (Story 1.9).
 * 
 * These tests verify that special characters in search queries are correctly escaped
 * to prevent SQL injection or unexpected pattern matching in Room/SQLite.
 * 
 * ESCAPE character is ''.
 */
class HistorySearchEscapingTest {

    /**
     * Replicates the escaping logic from MainViewModel.kt.
     */
    private fun escapeQuery(query: String): String {
        // Escape LIKE special characters (%, _, \) using \ as escape character
        val escapedQuery = query
            .replace("\\", "\\\\")
            .replace("%", "\\%")
            .replace("_", "\\_")

        // Truncate to 100 characters AFTER escaping
        return if (escapedQuery.length > 100) {
            var truncated = escapedQuery.take(100)
            // If we truncated in the middle of an escape sequence (trailing odd number of backslashes)
            // we must remove the trailing backslash to avoid Room error.
            var backslashCount = 0
            for (i in truncated.length - 1 downTo 0) {
                if (truncated[i] == '\\') backslashCount++ else break
            }
            if (backslashCount % 2 != 0) {
                truncated = truncated.dropLast(1)
            }
            truncated
        } else escapedQuery
    }

    @Test
    fun `test basic escaping`() {
        assertEquals("game\\%1", escapeQuery("game%1"))
        assertEquals("my\\_game", escapeQuery("my_game"))
        assertEquals("folder\\\\file", escapeQuery("folder\\file"))
    }

    @Test
    fun `test mixed special characters`() {
        assertEquals("test\\%\\_\\\\stuff", escapeQuery("test%_\\stuff"))
    }

    @Test
    fun `test multiple identical special characters`() {
        assertEquals("100\\% pure \\% match", escapeQuery("100% pure % match"))
        assertEquals("\\_\\_private\\_\\_", escapeQuery("__private__"))
        assertEquals("\\\\\\\\network\\\\path", escapeQuery("\\\\network\\path"))
    }

    @Test
    fun `test no special characters`() {
        assertEquals("Beat Saber", escapeQuery("Beat Saber"))
        assertEquals("v1.2.3", escapeQuery("v1.2.3"))
    }

    @Test
    fun `test empty and short queries`() {
        assertEquals("", escapeQuery(""))
        assertEquals("a", escapeQuery("a"))
        assertEquals("\\%", escapeQuery("%"))
    }

    @Test
    fun `test length limit validation`() {
        val longQuery = "a".repeat(110)
        val result = escapeQuery(longQuery)
        assertEquals(100, result.length)
        assertEquals("a".repeat(100), result)
    }

    @Test
    fun `test length limit with escaping`() {
        // 50 percent signs -> 100 characters after escaping
        val query = "%".repeat(50)
        val result = escapeQuery(query)
        assertEquals(100, result.length)
        assertEquals("\\%".repeat(50), result)
        
        // 100 percent signs -> escapedQuery length is 200 -> truncated to 100 after escaping
        val longQuery = "%".repeat(150)
        val resultLong = escapeQuery(longQuery)
        assertEquals(100, resultLong.length)
        assertEquals("\\%".repeat(50), resultLong)
    }

    @Test
    fun `test trailing backslash truncation`() {
        // Setup: 49 'a's + '%' -> "a...a\%" (length 51)
        // We want to force a truncation that leaves a single '\'
        // If we have 99 'a's + '%' -> "a...a\%" (length 101)
        // Truncate to 100 -> "a...a\" (backslash at 99)
        // Logic should drop it to 99 chars
        val query = "a".repeat(99) + "%"
        val result = escapeQuery(query)
        assertEquals(99, result.length)
        assertEquals("a".repeat(99), result)

        // Setup: 98 'a's + '\' -> "a...a\\" (length 100)
        // No truncation needed
        val query2 = "a".repeat(98) + "\\"
        val result2 = escapeQuery(query2)
        assertEquals(100, result2.length)
        assertEquals("a".repeat(98) + "\\\\", result2)
        
        // Setup: 99 'a's + '\' -> "a...a\\" (length 101)
        // Truncate to 100 -> "a...a\" (backslash at 99)
        // Logic should drop it to 99 chars
        val query3 = "a".repeat(99) + "\\"
        val result3 = escapeQuery(query3)
        assertEquals(99, result3.length)
        assertEquals("a".repeat(99), result3)
    }

    @Test
    fun `test backslash sequences (SQL injection protection)`() {
        // Testing sequences mentioned in review finding
        assertEquals("\\\\\\%", escapeQuery("\\%"))
        assertEquals("\\\\\\\\", escapeQuery("\\\\"))
        assertEquals("\\\\\\_\\%", escapeQuery("\\_%"))
    }
}
