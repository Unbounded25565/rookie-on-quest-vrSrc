# Deployment Guide - Rookie On Quest

**Generated:** 2026-01-09
**CI/CD Platform:** GitHub Actions
**Distribution:** GitHub Releases

## Overview

Rookie On Quest uses **GitHub Actions** for automated builds and **GitHub Releases** for distribution. Release APKs are automatically built, signed, and published when a new version tag is pushed.

---

## CI/CD Pipeline

### GitHub Actions Workflow

**Location:** `.github/workflows/`

**Workflows:**
- **Build & Test** - Runs on every push/PR
- **Release** - Triggers on version tags (`vX.X.X`)

### Build Workflow (`.github/workflows/build.yml`)

**Triggers:**
- Push to `main` or `dev` branches
- Pull requests

**Steps:**
1. Checkout code
2. Set up JDK 17
3. Cache Gradle dependencies
4. Run `./gradlew assembleDebug`
5. Upload debug APK as artifact

### Release Workflow (`.github/workflows/release.yml`)

**Triggers:**
- Tag push matching pattern `v*` (e.g., `v2.4.0`)

**Steps:**
1. Checkout code at tag
2. Set up JDK 17
3. Decode signing key from secrets
4. Run `./gradlew assembleRelease`
5. Create GitHub Release
6. Upload signed APK to release

---

## Release Process

### 1. Update Version

Edit `app/build.gradle.kts`:

```kotlin
android {
    defaultConfig {
        versionCode = 16
        versionName = "2.5.0"
    }
}
```

**Or use Makefile:**
```bash
make set-version V=2.5.0
```

This also updates `CHANGELOG.md` with a new version section.

### 2. Update Changelog

Edit `CHANGELOG.md` to document changes:

```markdown
## [2.5.0] - 2026-01-09

### Added
- Dark mode support
- Offline browsing improvements

### Fixed
- Queue processing memory leak
```

### 3. Commit and Tag

```bash
git add .
git commit -m "chore: release v2.5.0"
git tag v2.5.0
git push origin main
git push origin v2.5.0
```

### 4. Automated Build

GitHub Actions detects the tag and:
- Builds release APK
- Signs with keystore from secrets
- Creates GitHub Release with changelog
- Uploads APK as release asset

### 5. Verify Release

Visit [Releases Page](https://github.com/LeGeRyChEeSe/rookie-on-quest/releases) to confirm:
- ✅ Release created with correct tag
- ✅ APK attached (`RookieOnQuest-vX.X.X.apk`)
- ✅ Changelog displayed in release notes

---

## Netlify Update Gateway Deployment

**Story:** 9.4 - Automated APK Deployment to Netlify

Since the repository moved to private status, APK distribution migrated to a custom Netlify-hosted gateway (Sunshine-AIO-web) for secure updates.

### Deployment Flow

The release workflow now automatically deploys to both GitHub Releases AND Netlify:

```
GitHub Actions Release Workflow
    │
    ├── Build Release APK
    ├── Create GitHub Release ← Standard distribution
    │
    └── Deploy to Netlify (NEW in Story 9.4)
          │
          ├── Download APK artifact
          ├── Calculate SHA-256 checksum
          ├── Clone Sunshine-AIO-web
          ├── Copy APK to public/updates/rookie/
          ├── Update version.json
          └── Push → Netlify Auto-Deploy
```

### Netlify Gateway Structure

**Repository:** `LeGeRyChEeSe/Sunshine-AIO-web`

| Path | Description |
|------|-------------|
| `public/updates/rookie/RookieOnQuest_{version}.apk` | APK file |
| `public/updates/rookie/version.json` | Version metadata |

### version.json Format

```json
{
    "version": "2.5.0",
    "changelog": "Release 2.5.0 - See GitHub release for details",
    "downloadUrl": "/updates/rookie/RookieOnQuest_2.5.0.apk",
    "checksum": "sha256-hash-of-apk",
    "timestamp": "2026-02-16T12:00:00Z"
}
```

### Required GitHub Secrets

| Secret Name | Description | Required For |
|-------------|-------------|--------------|
| `GH_PAT_SUNSHINE_AIO` | Personal Access Token with `repo` scope for Sunshine-AIO-web | Netlify deployment |
| `ROOKIE_UPDATE_SECRET` | HMAC signing key for update requests | Release builds |

### Creating GH_PAT_SUNSHINE_AIO Secret

To enable automatic deployment to Sunshine-AIO-web, create a Personal Access Token (PAT):

1. **Go to GitHub Settings:**
   - Visit https://github.com/settings/tokens
   - Click "Generate new token (classic)"

2. **Configure Token:**
   - **Note:** `RookieOnQuest Netlify Deployment`
   - **Expiration:** Select appropriate expiration (recommend 90 days or 1 year)
   - **Scopes:** Select `repo` (full control of private repositories)

3. **Copy the Token:**
   - Copy the generated token immediately (it won't be shown again)

4. **Add to Repository Secrets:**
   - Go to: https://github.com/LeGeRyChEeSe/rookie-on-quest/settings/secrets/actions
   - Click "New repository secret"
   - Name: `GH_PAT_SUNSHINE_AIO`
   - Value: Paste your token
   - Click "Add secret"

**Note:** The token needs write access to the Sunshine-AIO-web repository. Make sure the token's account has appropriate permissions.

### Manual Netlify Deployment

If CI/CD fails, deploy manually:

```bash
# 1. Clone Sunshine-AIO-web
git clone https://github.com/LeGeRyChEeSe/Sunshine-AIO-web.git
cd Sunshine-AIO-web

# 2. Copy APK
cp path/to/RookieOnQuest-v2.5.0.apk public/updates/rookie/RookieOnQuest_2.5.0.apk

# 3. Calculate checksum
sha256sum public/updates/rookie/RookieOnQuest_2.5.0.apk

# 4. Update version.json
# Edit public/updates/rookie/version.json with new version, checksum, timestamp

# 5. Commit and push
git add public/updates/rookie/
git commit -m "Deploy RookieOnQuest v2.5.0"
git push origin main

# Netlify auto-deploys after push
```

### Verify Netlify Deployment

1. Check Sunshine-AIO-web GitHub commit pushed successfully
2. Visit Netlify dashboard → Deploys → Verify "Deploy started" triggered
3. Wait for "Deploy published" status
4. Test update check from Quest app

### Netlify URL

The update gateway is accessible at: **https://sunshine-aio.com** (or configured custom domain)

---

## GitHub Secrets Configuration

**Required Secrets (Repository Settings > Secrets and Variables > Actions):**

| Secret Name | Description | Example |
|-------------|-------------|---------|
| `KEYSTORE_FILE` | Base64-encoded keystore file | `base64 keystore.jks` |
| `KEYSTORE_PASSWORD` | Keystore password | `myStorePass123` |
| `KEY_ALIAS` | Signing key alias | `rookie_release_key` |
| `KEY_PASSWORD` | Key password | `myKeyPass456` |

### Encoding Keystore

```bash
# Encode keystore to base64
base64 -w 0 keystore.jks > keystore_base64.txt

# Copy contents and add to GitHub Secrets as KEYSTORE_FILE
```

---

## Manual Release (Fallback)

If CI/CD fails, create a release manually:

### 1. Build Release APK

```bash
./gradlew assembleRelease
```

Output: `app/build/outputs/apk/release/RookieOnQuest-vX.X.X.apk`

### 2. Create GitHub Release

```bash
# Install GitHub CLI (gh)
gh release create v2.5.0 \
  --title "v2.5.0 - Feature Update" \
  --notes "See CHANGELOG.md for details" \
  app/build/outputs/apk/release/RookieOnQuest-v2.5.0.apk
```

**Or manually via GitHub Web UI:**
1. Go to Releases > Draft a new release
2. Choose tag `v2.5.0`
3. Upload APK
4. Paste changelog
5. Publish release

---

## Signing Configuration

### Release Signing

**File:** `app/build.gradle.kts`

```kotlin
android {
    signingConfigs {
        create("release") {
            storeFile = file(keystoreProperties["storeFile"] as String)
            storePassword = keystoreProperties["storePassword"] as String
            keyAlias = keystoreProperties["keyAlias"] as String
            keyPassword = keystoreProperties["keyPassword"] as String
        }
    }

    buildTypes {
        release {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = true
            proguardFiles(...)
        }
    }
}
```

### Generating a New Keystore

```bash
keytool -genkeypair -v \
  -keystore rookie_keystore.jks \
  -keyalg RSA \
  -keysize 2048 \
  -validity 10000 \
  -alias rookie_release_key
```

**⚠️ Important:** Store keystore securely! Loss = inability to update app on users' devices.

---

## APK Optimization

### ProGuard/R8

**Enabled in Release:** Yes
**Configuration:** `proguard-rules.pro`

**Features:**
- Code shrinking (removes unused code)
- Obfuscation (renames classes/methods)
- Optimization (bytecode improvements)

**Keep Rules:**
```proguard
# Keep Retrofit interfaces
-keep interface com.vrpirates.rookieonquest.network.** { *; }

# Keep Room entities
-keep class com.vrpirates.rookieonquest.data.GameEntity { *; }
```

### APK Size Reduction

**Current Size:** ~8 MB (release APK)

**Strategies:**
- R8 shrinking enabled
- No unused resources included
- Vector drawables preferred over PNGs
- Dynamic asset downloading (icons, thumbnails)

---

## Distribution Channels

### Primary: GitHub Releases

**URL:** https://github.com/LeGeRyChEeSe/rookie-on-quest/releases

**Advantages:**
- Free hosting
- Version history
- Direct APK downloads
- Changelog integration

### Alternative: SideQuest (Future)

**Status:** Not yet listed

**Requirements for SideQuest listing:**
- Privacy policy URL
- Age rating
- Screenshot set (6 images)
- Application submission

---

## Update Mechanism

### In-App Update Check

**Trigger:** On app launch
**API:** GitHub API `/repos/LeGeRyChEeSe/rookie-on-quest/releases/latest`

**Flow:**
1. Fetch latest release tag from GitHub API
2. Compare with `BuildConfig.VERSION_NAME`
3. If newer version available:
   - Display update dialog
   - Offer to download APK
   - Install via `FileProvider`

**Code:** See `MainViewModel.kt` → `checkForUpdates()`

### Update Installation

APK downloaded to:
`/sdcard/Download/RookieOnQuest/updates/RookieOnQuest-vX.X.X.apk`

Installation triggered via Android's `PackageInstaller`.

---

## Rollback Strategy

### If Release Has Critical Bug

1. **Unpublish Release** (GitHub > Releases > Edit > Delete)
2. **Revert Tag:**
   ```bash
   git tag -d v2.5.0
   git push origin :refs/tags/v2.5.0
   ```
3. **Fix Bug and Re-release as Patch:**
   ```bash
   make set-version V=2.5.1
   git commit -m "fix: critical bug from v2.5.0"
   git tag v2.5.1
   git push origin main --tags
   ```

---

## Monitoring & Analytics

**Current Status:** No analytics integrated

**Potential Tools:**
- Google Analytics for Firebase (privacy concerns)
- Self-hosted Plausible Analytics
- GitHub download counts (public metric)

---

## Infrastructure Dependencies

### External Services

| Service | Purpose | Criticality | Owner |
|---------|---------|-------------|-------|
| GitHub Actions | CI/CD | High | GitHub |
| GitHub Releases | APK hosting | High | GitHub |
| Netlify (Sunshine-AIO) | Secure update gateway | **Critical** | VRPirates Team |
| VRPirates Servers | Game catalog/downloads | **Critical** | VRPirates Team |
| GitHub API | Update checks | Medium | GitHub |

**⚠️ App Non-Functional Without:** VRPirates server infrastructure

---

## Security Considerations

### APK Signing

- **Algorithm:** RSA 2048-bit
- **Validity:** 10,000 days
- **Storage:** GitHub Secrets (encrypted)

### Keystore Backup

**Recommendation:**
- Store keystore in secure location (encrypted cloud backup)
- Document recovery procedure
- Share with trusted team members

### Secrets Management

- Never commit `keystore.properties` to git
- Rotate secrets if compromised
- Use environment-specific secrets for staging vs. production

---

## Post-Release Checklist

- [ ] Verify release published on GitHub
- [ ] Test APK download from release page
- [ ] Install APK on Quest device and verify functionality
- [ ] Monitor GitHub Issues for user reports
- [ ] Update README.md badge if version format changed
- [ ] Announce release in community channels (optional)

---

## Resources

- **GitHub Actions Docs:** https://docs.github.com/en/actions
- **Android App Signing:** https://developer.android.com/studio/publish/app-signing
- **ProGuard Manual:** https://www.guardsquare.com/manual/home
