pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        withCredentials(bindings: [[$class: 'UsernamePasswordMultiBinding', credentialsId: 'pcf-user',
        usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
          sh 'echo uname=$USERNAME pwd=$PASSWORD'
        }

        sh 'echo "done"'
      }
    }
  }
}