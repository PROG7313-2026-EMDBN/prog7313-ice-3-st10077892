# 🌍 Micro Trips App

## ✨ Tagline

Discover hidden gems across South Africa and plan affordable micro-trips in minutes.

---

# 📱 About the App

**Micro Trips** is a simple travel discovery Android application built with **Kotlin and Jetpack Compose**. The app helps users explore short travel destinations around South Africa, view estimated trip costs, and save their favourite locations for future visits.

The app focuses on **clean UI design, simple navigation, and offline functionality** using locally stored data.

---

# 🚀 Features

### 🔎 Explore Screen

* Browse a list of travel “micro-trip” destinations.
* Each destination is displayed as a card containing:

  * Location name
  * Province
  * Short description

### 📍 Detail Screen

* Displays full information about a selected destination.
* Includes:

  * Description
  * Location information
  * Estimated travel budget breakdown

### ⭐ Saved Screen

* Allows users to view saved destinations.

### ⚙️ Settings Screen

* Basic settings interface for future customization options.

### 🧭 Navigation

The app uses **Jetpack Compose Navigation** with:

* **Top App Bar**
* **Navigation Drawer**
* Navigation between:

  * Explore
  * Saved
  * Settings
  * Details

---

# 🛠 Technologies Used

* **Kotlin**
* **Jetpack Compose**
* **Material 3**
* **Navigation Compose**
* **Android Studio**

---

# 📂 Project Structure

```
MicroTripsApp
│
├── data
│   └── Gem.kt
│
├── navigation
│   └── AppNavGraph.kt
│
├── ui
│   ├── screens
│   │   ├── ExploreScreen.kt
│   │   ├── DetailScreen.kt
│   │   ├── SavedScreen.kt
│   │   └── SettingsScreen.kt
│   │
│   └── theme
│       ├── Color.kt
│       ├── Theme.kt
│       └── Type.kt
│
└── MainActivity.kt
```

---

# ▶️ How to Run the App

1. Clone the repository from GitHub.

```
git clone https://github.com/yourusername/micro-trips-app.git
```

2. Open the project in **Android Studio**.

3. Allow Gradle to **sync dependencies**.

4. Run the project using:

* Android Emulator
  or
* BlueStacks

5. Click **Run ▶** to launch the application.

---

# 📸 Screenshots

*(Add emulator screenshots here when submitting your project)*

Example sections you can include:

* Explore Screen
* Detail Screen
* Navigation Drawer
* Saved Screen
* Settings Screen

---

# ⚠️ Known Limitations

* Data is currently **hardcoded** instead of loaded from a JSON file.
* Images are not yet fully integrated for all destinations.
* Saved destinations are not permanently stored.
* No backend or API integration.

---

# 🔮 Future Improvements

* Add **local JSON data loading**
* Implement **Google Maps integration**
* Add **image cards for each destination**
* Add **persistent saved locations**
* Implement **dark mode toggle**
* Add **budget calculation features**

---



Android Development Project
Micro Trips Travel Discovery App
