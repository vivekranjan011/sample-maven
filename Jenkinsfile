pipeline {
  agent any
   tools {
        maven 'MAVEN3'
        jdk 'jdk21'
    }
  stages {
    stage('Code Checkout') {
      parallel {
        stage('Code Checkout') {
          steps {
            git(url: 'https://github.com/vivekranjan011/sample-maven.git', branch: 'main')
          }
        }

        stage('Message') {
          steps {
            echo 'Code Pull Block'
          }
        }

      }
    }

    stage('Build Package') {
      steps {
        bat(script: 'Build.bat', returnStatus: true, returnStdout: true)
      }
    }

    stage('Test Application') {
      steps {
        bat(script: 'Test.bat', returnStdout: true, returnStatus: true)
      }
    }

    stage('Deploy Px') {
      steps {
        archiveArtifacts(artifacts: '/target/*.jar', onlyIfSuccessful: true)
      }
    }

    stage('error') {
      steps {
        echo 'Hooray'
      }
    }

  }
}
