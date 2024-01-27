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
               // Copy the JAR file to Tomcat webapps directory
               // sh 'sudo cp target/Calculator-1.0-SNAPSHOT.jar /opt/apache-tomcat-9.0.85/webapps/'
                sh "echo $idrbt | sudo -S cp target/Calculator-1.0-SNAPSHOT.jar /opt/apache-tomcat-9.0.85/webapps/"

                // Restart Tomcat (replace with your Tomcat restart command)
                sh '/opt/apache-tomcat-9.0.85/bin/shutdown.sh'
                sh '/opt/apache-tomcat-9.0.85/startup.sh'
            }
        }
    }
}
