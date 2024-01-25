pipeline {
    agent any

    environment {
        ANDROID_HOME = '/home/idrbt/Android/Sdk'
        PATH="${ANDROID_HOME}/tools/bin:${ANDROID_HOME}/platform-tools:${PATH}"
        GRADLE_HOME = '/usr/bin/gradle'
        PATH="${GRADLE_HOME}/bin:${PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                script {
                    // Clean previous build
                    sh './gradlew clean'

                    // Build the APK
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Publish') {
            steps {
                // Copy the APK to a location where you can access it
                sh 'cp app/build/outputs/apk/debug/app-debug.apk /your/apk/output/directory'
            }
        }
    }

    post {
        success {
            // You can add post-build steps here, such as deploying the APK to a server or notifying team members
        }
    }
}
