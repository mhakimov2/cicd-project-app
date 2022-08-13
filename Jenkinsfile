pipeline {
  
  agent any
  
  tools { 
        maven 'maven3.8.6'
    }
  
  stages {
    
    stage("build") {
      steps {
        echo 'building the app...'
             sh 'mvn clean package -DskipTests'
      }
    }
    
    stage("test") {
      steps {
        echo 'testing the app...'
        sh 'mvn test'
      }
    }
    
    stage("deploy") {
        when {
            expression {
                BRANCH_NAME != 'main'
            }
        }
      steps {
        echo 'deploying the app...'
           script {
            deploy adapters: [tomcat9(credentialsId: 'tomcat_credential', path: '', url: 'http://host.docker.internal:8081')], contextPath: '/pipeline2', onFailure: false, war: 'target/*.war' 
        }
      }
    }
    
  }
  
  post{
    always {
   
                echo 'generating email notification'
                emailext(attachLog: true, 
                body: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS: Check console output at $BUILD_URL to view the results.',
                subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!', 
                to: '40514972@live.napier.ac.uk')
    }
  }
}
