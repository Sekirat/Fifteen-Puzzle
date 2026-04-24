plugins { 
    id("com.android.application") 
    id("kotlin-android") 
}

android { 
    compileSdk = 34 
    
    defaultConfig { 
        applicationId = "com.example.fifteenpuzzle" 
        minSdk = 21 
        targetSdk = 34 
        versionCode = 1 
        versionName = "1.0" 
    }
    
    buildTypes { 
        getByName("release") { 
            isMinifyEnabled = false 
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro") 
        } 
    } 
}

dependencies { 
    implementation("androidx.compose.ui:ui:1.3.0") 
    implementation("androidx.activity:activity-compose:1.6.0") 
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0") 
    implementation("androidx.navigation:navigation-compose:2.6.0") 
    implementation("androidx.compose.material:material:1.3.0") 
}