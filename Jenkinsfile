pipeline {
    agent any

    environment {
        GIT_URL = 'https://github.com/hugodosremedios/meu-backend.git'
        BRANCH = 'main'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: "${BRANCH}", url: "${GIT_URL}"
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar target/*.jar'
            }
        }
    }

    post {
        success {
            echo 'Build e execução concluídos com sucesso!'
        }
        failure {
            echo 'Falha na execução!'
        }
    }
}
