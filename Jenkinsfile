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
                bat "mvn clean package"
            }
        }
    }
}