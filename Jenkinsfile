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
        stage('Deploy') {
            steps {
                // Run Maven test phase
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://192.168.138.130:8090/')], contextPath: null, war: '**/*.jar'
            }
        }
    }
}
