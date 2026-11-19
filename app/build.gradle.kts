plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.ejemplo.mireproductorpro"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.ejemplo.mireproductorpro"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(platform("androidx.compose:compose-bom:2025.01.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation("com.google.android.material:material:1.12.0")

    // Media3 (ExoPlayer)
    val media3Version = "1.9.4"
    implementation("androidx.media3:media3-exoplayer:$media3Version")
    implementation("androidx.media3:media3-ui:$media3Version")

    // Iconics para FontAwesome en Compose
    implementation("com.mikepenz:iconics-compose:5.4.0")
    implementation("com.mikepenz:fontawesome-typeface:5.13.3.2-kotlin@aar")
    
    // DataStore para guardar las carpetas seleccionadas
    implementation("androidx.datastore:datastore-preferences:1.1.1")
}
