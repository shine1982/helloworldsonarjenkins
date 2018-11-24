pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
         stage('build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarqube-6') {

                   sh 'mvn clean package sonar:sonar'

                }
            }
        }
    }
}




