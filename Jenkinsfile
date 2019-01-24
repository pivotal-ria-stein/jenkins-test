pipeline {
  agent any
  stages {
    stage('Start') {
      steps {
        withCredentials(bindings: [[$class: 'UsernamePasswordMultiBinding', credentialsId: 'pcf-user',
        usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD']]) {
          sh '''
          if ["$USERNAME" == "george"]
            then
            echo "match username"
           fi
           if ["$PASSWORD" == "michael"]
            then
            echo "match password"
           fi
          '''
        }

        sh 'echo "done"'
      }
    }
  }
}
