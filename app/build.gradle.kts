plugins {
    id 'com.android.application'
    id 'org.jetbrains.kotlin.android'
    id 'com.google.gms.google-services'
}

android {
    namespace 'com.scammer101.Virya'
    compileSdk 33

    defaultConfig {
        applicationId "com.scammer101.Virya"
        minSdk 23
        targetSdk 33
        versionCode 1
        versionName "1.0.3"

        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures
    {
        viewBinding true
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation 'androidx.appcompat:appcompat:1.5.1'
    implementation 'com.google.android.material:material:1.7.0'
    implementation 'androidx.constraintlayout:constraintlayout:2.1.4'
    testImplementation 'junit:junit:4.13.2'
    androidTestImplementation 'androidx.test.ext:junit:1.1.4'
    androidTestImplementation 'androidx.test.espresso:espresso-core:3.5.0'

    implementation 'de.hdodenhof:circleimageview:3.1.0'
    implementation platform('com.google.firebase:firebase-bom:31.1.1')
    implementation 'com.google.firebase:firebase-auth-ktx'
    implementation 'com.google.firebase:firebase-firestore-ktx'
    implementation 'com.google.android.gms:play-services-safetynet:18.0.1'
    implementation 'com.github.ismaeldivita:chip-navigation-bar:1.4.0'
    implementation 'com.android.volley:volley:1.2.1'
    implementation 'com.github.bumptech.glide:glide:4.14.2'
    annotationProcessor 'com.github.bumptech.glide:compiler:4.14.2'
    implementation 'com.google.android.exoplayer:exoplayer:2.18.2'

    //pose detection sdk
    implementation 'com.google.mlkit:pose-detection-accurate:18.0.0-beta3'
    // androidx camera
    def camerax_version = "1.1.0-beta01"
    implementation "androidx.camera:camera-core:${camerax_version}"
    implementation "androidx.camera:camera-camera2:${camerax_version}"
    implementation "androidx.camera:camera-lifecycle:${camerax_version}"
    implementation "androidx.camera:camera-video:${camerax_version}"

    implementation "androidx.camera:camera-view:${camerax_version}"
    implementation "androidx.camera:camera-extensions:${camerax_version}"

    // dependency for exoplayer
    implementation 'com.google.android.exoplayer:exoplayer:r2.4.0'

// for core support in exoplayer.
    implementation 'com.google.android.exoplayer:exoplayer-core:r2.4.0'

// for adding dash support in our exoplayer.
    implementation 'com.google.android.exoplayer:exoplayer-dash:r2.4.0'

// for adding hls support in exoplayer.
    implementation 'com.google.android.exoplayer:exoplayer-hls:r2.4.0'

// for smooth streaming of video in our exoplayer.
    implementation 'com.google.android.exoplayer:exoplayer-smoothstreaming:r2.4.0'

// for generating default ui of exoplayer
    implementation 'com.google.android.exoplayer:exoplayer-ui:r2.4.0'

}