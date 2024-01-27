pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'basic-calc'
        DOCKER_HUB_USERNAME = credentials('797268')
        DOCKER_HUB_PASSWORD = credentials('Dockerhub@405')
        DOCKER_IMAGE_NAME = '797268/basic-calculator'
        TAG = 'latest'
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
                    docker.build(DOCKER_IMAGE_NAME, "--file=Dockerfile .")
                }
            }
        }

        stage('Deploy to Docker') {
            steps {
                script {
                    // Log in to Docker Hub
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
                        // Push Docker image to Docker Hub
                        docker.image("${DOCKER_IMAGE_NAME}:${TAG}").push()
                    }
                }
            }
        }
    }
}
