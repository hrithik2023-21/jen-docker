pipeline {
    agent any

    stages {

        stage("Checkout") {
            steps {
                git "https://github.com/hrithik2023-21/jen-docker.git"
            }
        }

        stage("Build") {
            steps {
                sh "mvn clean package -DskipTests"
            }
        }
    }
}