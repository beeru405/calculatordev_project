pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Check out the code from your version control system (e.g., Git)
                git 'https://github.com/beeru405/calculatordev_project.git'
            }
        }

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
