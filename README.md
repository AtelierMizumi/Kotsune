# Kotsune

![Kotlin](https://img.shields.io/badge/Kotlin-Multiplatform-7F52FF)
![Compose](https://img.shields.io/badge/Jetpack%20Compose-UI-4285F4)
![License](https://img.shields.io/badge/license-MIT-blue.svg)

A Kotlin Multiplatform project using Jetpack Compose for UI, capable of running on multiple platforms.

## 📋 Table of Contents

- [Features](#-features)
- [Project Structure](#-project-structure)
- [Getting Started](#-getting-started)
- [Building and Running](#-building-and-running)
- [Contributing](#-contributing)
- [License](#-license)

## ✨ Features

- 🧩 **Kotlin Multiplatform** - Write shared code that runs on multiple platforms
- 🎨 **Jetpack Compose UI** - Modern, declarative UI framework
- 📱 **Cross-Platform** - Target Android, iOS, desktop and web platforms
- 🔄 **Shared Logic** - Share business logic across platforms
- 🎯 **Platform-Specific API** - Implement platform-specific features when needed

## 📂 Project Structure

- `composeApp/src/commonMain` - Shared Kotlin code and Compose UI
- Platform-specific implementations:
    - Android
    - iOS
    - Desktop
    - Web

Key files:
- `App.kt` - Main composable UI component
- `Greeting.kt` - Simple greeting component
- `Platform.kt` - Interface for platform-specific implementations

## 🚀 Getting Started

### Prerequisites

- [Android Studio](https://developer.android.com/studio) (Arctic Fox or newer)
- [Kotlin](https://kotlinlang.org/) 1.8+
- [JDK 11](https://adoptopenjdk.net/) or newer

### Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/AtelierMizumi/Kotsune.git
   cd Kotsune
   ```

2. Open the project in Android Studio

3. Sync Gradle files

## 🏗️ Building and Running

### Android

- Select the Android configuration in Android Studio and click Run

### iOS

- Requires a Mac with Xcode installed
- Run `./gradlew :composeApp:iosDeployIPhone` (for device) or `./gradlew :composeApp:iosDeployIPhoneSimulator` (for simulator)

### Desktop

- Run `./gradlew :composeApp:run`

### Web

- Run `./gradlew :composeApp:jsBrowserDevelopmentRun`

## 🤝 Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -am 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📜 License

This project is licensed under the GNU GENERAL PUBLIC LICENSE - see the [LICENSE](LICENSE) file for details.

---

<div align="center">
  <sub>Built with ❤️ by AtelierMizumi</sub>
</div>