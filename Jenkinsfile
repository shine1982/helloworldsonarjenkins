pipeline {
    agent any
    stages {

         stage('build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarqube-6') {

                   sh 'mvn clean package sonar:sonar'

                }
            }
        }
    }
}




