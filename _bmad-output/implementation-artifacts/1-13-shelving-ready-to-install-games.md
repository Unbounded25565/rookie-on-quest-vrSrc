# Story 1.13: Shelving Ready-to-Install Games & Local Installs Tab

**As a** user,
**I want** games that are extracted but not yet installed to move out of the active queue,
**So that** they don't block subsequent downloads and I can install them later from a dedicated "Local Installs" view.

## Acceptance Criteria

### 1. Queue Non-Blocking Behavior
- [ ] **Given** a game has reached the `READY_TO_INSTALL` state (extracted, OBBs moved).
- [ ] **When** the user does not immediately complete the installation (e.g., closes the dialog or app).
- [ ] **Then** the `QueueProcessor` must transition the item out of the active processing loop.
- [ ] **And** the next item in the queue must start downloading/extracting automatically.

### 2. "Local Installs" Data Persistence
- [ ] **Given** a game is in the `staged_apks` directory.
- [ ] **When** the app scans for local ready-to-install games.
- [ ] **Then** it should match the staged folder name with a catalog entry.
- [ ] **And** display these games in a dedicated "Local" or "Ready" tab/section.

### 3. One-Click Local Installation
- [ ] **Given** a game listed in the "Local Installs" section.
- [ ] **When** the user clicks "Install".
- [ ] **Then** the app must trigger the `FileProvider` installation directly using the existing APK in `staged_apks`.
- [ ] **And** skip the download and extraction phases entirely.

### 4. Cleanup on Completion
- [ ] **Given** a local installation is successful.
- [ ] **When** the installation is verified.
- [ ] **Then** the temporary files in `staged_apks` for that specific game must be deleted.
- [ ] **And** the game must be removed from the "Local Installs" view.

## Technical Notes
- **Storage:** Use the `staged_apks` directory established in Story 1.11.
- **State Management:** Items should probably have a new status `SHELVED` or `LOCAL_READY` in the `install_queue` table to distinguish them from active queue items.
- **UI:** Add a new tab in the `MainScreen` or a dedicated filter in the Game List to show these local ready-to-install games.
