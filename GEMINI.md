# 🛑 PROJECT CEASED / ARCHIVED - Rookie On Quest

## Project Overview
**Rookie On Quest** was a native Android application designed for Meta Quest headsets. It functioned as a standalone client for the VRPirates "Rookie Sideloader" ecosystem.

**STATUS: DISCONTINUED (March 19, 2026)**
The project is non-functional following the permanent shutdown of VRPirates infrastructure.

## Tech Stack & Architecture (Historical)
*   **Language:** Kotlin
*   **UI Framework:** Jetpack Compose (Material 3)
*   **Architecture:** MVVM (Model-View-ViewModel)
*   **Networking:** Retrofit 2 + Gson
*   **Local Storage:** Room Database
*   **Compression:** Apache Commons Compress + XZ (for 7z archive handling)
*   **Minimum SDK:** 29 (Android 10)
*   **Target SDK:** 34 (Android 14)

## Key Directories
*   `app/src/main/java/com/vrpirates/rookieonquest/`
    *   `data/`: Data layer (Room entities, DAOs, Repositories).
    *   `logic/`: Business logic (e.g., `CatalogParser`).
    *   `network/`: Network services (`GitHubService`, `VrpService`).
    *   `ui/`: Jetpack Compose UI components (`MainActivity`, `MainViewModel`, `GameListItem`).

## Final Build & Development Info
*   **Final Stable Version:** 3.0.0
*   **Repository Status:** Archived. No further development or maintenance will occur.

## Notes (Legacy)
*   **Infrastructure Dependency:** The application relied entirely on VRPirates infrastructure for game catalogs and downloads. This dependency was its single point of failure.
*   **Core Implementation:** Successfully implemented a standalone download and extraction pipeline for large 7z archives on Android Quest devices.

## Agent Instructions (Archival Mode)
*   **Status:** This project is archived. No modifications to functional code should be made.
*   **Context:** Refer to the updated `README.md` for details on the VRPirates DMCA shutdown.
*   **Inquiries:** If asked about the status, confirm that the project is dead because its backend servers were taken offline by Meta.
