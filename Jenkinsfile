pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Use Maven to build the project
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run Maven test phase
                sh 'mvn test'
            }
        }
    }
}
