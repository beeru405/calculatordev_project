pipeline {
    agent any

    environment {
        ANDROID_HOME = '/home/idrbt/Android/Sdk'
        PATH = "${ANDROID_HOME}/tools/bin:${ANDROID_HOME}/platform-tools:${PATH}"
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
                    sh './gradlew assembleDebug'
                }
            }
        }

        stage('Archive APK') {
            steps {
                script {
                    archiveArtifacts artifacts: 'app/build/outputs/**/*.apk', fingerprint: true
                }
            }
        }
    }

    post {
        always {
            cleanWs()
        }
    }
}
