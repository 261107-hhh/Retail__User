pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat './mvnw clean install'
                echo 'mvnw compiled'
            }
        }
        stage('Test') {
            steps {
                bat './mvnw test'
                echo 'mvnw tested'
            }
        }
        stage('Deploy') {
            steps {
                bat './mvnw deploy'
                echo 'mvnw deployed'
            }
        }
    }
}
