pipeline {
    agent any

    environment {
        ANDROID_HOME = '/home/idrbt/Android/Sdk'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build APK') {
            steps {
                script {
                    def androidHome = tool 'Android_SDK'
                    sh "${androidHome}/bin/./gradlew assembleDebug"
                }
            }
        }

        stage('Publish APK') {
            steps {
                archiveArtifacts '**/*.apk'
            }
        }
    }
}


