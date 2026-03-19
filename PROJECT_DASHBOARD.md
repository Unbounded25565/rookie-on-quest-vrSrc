# 🛑 PROJECT CEASED / END OF LIFE

**Rookie On Quest is officially discontinued.**

Following the recent DMCA takedown by Meta (March 17, 2026) and the subsequent complete cessation of **VR Pirates (VRP)** and the **Rookie Sideloader** ecosystem, this project is no longer functional.

**The project has been archived.**

---

# 🚀 Rookie On Quest - Project Dashboard

Welcome to the **Rookie On Quest** dashboard. This document is now for historical reference only.

---

## 📊 Global Project Status

| Indicator | Current Value | Description |
| :--- | :--- | :--- |
| **Version** | `3.0.0` | Final stable release. |
| **Health** | 🔴 **End of Life** | Backend servers are offline. |
| **Current Focus** | 🛑 **None** | Project development has ceased. |
| **Last Update** | Mar 19, 2026 | Project archived following VRP shutdown. |

---

## 🗺️ Visual Roadmap (Historical)

Here is how the project evolved.

```mermaid
timeline
    title Rookie On Quest Evolution
    2025 - Foundations : App Core
                      : Queue System
                      : Local Database
    Jan 2026 - UX & Comfort : v2.3.0 Cache Cleaning
                            : v2.4.0 Favorites & Advanced Sorting
    Feb 2026 - Final Release : v3.0.0 Maintenance Update
    Mar 2026 - End : 🛑 DMCA Shutdown
                   : 🏁 Project Archived
```

---

## 🏗️ Simplified Architecture (Legacy)

```mermaid
flowchart LR
    subgraph Cloud [Internet / VRPirates - OFFLINE]
        Repo[Game Catalog]
        Files[APK/OBB Files]
    end

    subgraph App [Rookie On Quest]
        UI[User Interface]
        Parser[Catalog Parser]
        DB[(Local Database)]
        DL[Download Manager]
    end

    subgraph Quest [Meta Quest Headset]
        Store[Internal Storage]
        Installer[Android Installer]
    end

    Repo -.-> Parser
    Parser --> UI
    Parser --> DB
    UI -- "Download" --> DL
    DL -.-> Files
    DL -- "Store" --> Store
    Store -- "Extract & Install" --> Installer
```

---

*This document is maintained for historical and educational purposes.*
