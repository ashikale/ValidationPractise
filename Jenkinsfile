 pipeline {
    agent any
    environment{
        CI= true
        JROG_CREDENTIALS= credentials('jfrog-credentials')
    }
 
 tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages{
        stage('pull code from git scm'){
         steps{
             echo '=======pull the code from gir scm========'
             git branch: 'main',
             url: 'https://github.com/ashikale/ValidationPractise.git'
             echo '=======source code pulled========'
         }
    }
     stage('Build the source code'){
         steps{
             echo '=======code building is starting========'
             bat 'cd weshopify-platform-app '
             bat 'cd weshopify-platform-app && mvn clean package'
             echo '=======JAR file generated========'
         }
    }
    stage('deploy to frog'){
         steps{
             echo '=======jrog building is starting========'

             bat 'cd weshopify-platform-app && mvn deploy'
             echo '=======JAR file transfer to JFROG========'
         }
    }

    }
    stage('copy jfrog.sh file to docker machine'){
         steps{
             echo '=======jrog.sh file copy started========'

             bat 'cd weshopify-platform-app && copy Jfrog.sh'
             echo '=======Jfrog filed copied========'
         }
    }

    }

}
