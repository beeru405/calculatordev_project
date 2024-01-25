pipeline {
    agent any

    environment {
        GRADLE_HOME = '/home/idrbt/Android/Sdk/bin/'
    }

    stages {
        stage('Build') {
            steps {
                script {
                    // Use Gradle Wrapper to assemble the debug APK
                    sh '${GRADLE_HOME}/gradlew assembleDebug'
                }
            }
        }
    }
}
