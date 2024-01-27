pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'calc-app'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean install'
                }
        }

        stage('Build Docker Image') {
            steps {
                script {
                    docker.build(DOCKER_IMAGE, "--file=Dockerfile .")
                }
            }
        }

        stage('Deploy to Docker') {
            steps {
                script {
                    // Log in to Docker Hub
                    withDockerRegistry([ credentialsId: "797268", url: "" ]) {
                        // Push Docker image to Docker Hub
                        docker.image("${DOCKER_IMAGE}:${TAG}").push()
                    }
                }
            }
        }
    }
}
