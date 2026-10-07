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
        stage("Building the docker image") {
            steps {
                sh "docker build -t new-one ."
            }
        }
        stage("ECR Login") {
            steps {
                sh "aws ecr get-login-password --region ap-south-1 | docker login --username AWS --password-stdin 445416043666.dkr.ecr.ap-south-1.amazonaws.com"
            }
        }
        stage("docker tag") {
            steps {
                sh "docker tag new-one:latest 445416043666.dkr.ecr.ap-south-1.amazonaws.com/docker-repo:latest"
            }
        }
        stage("docker push") {
            steps {
                sh "docker push 445416043666.dkr.ecr.ap-south-1.amazonaws.com/docker-repo:latest"
            }
        }
    }
}