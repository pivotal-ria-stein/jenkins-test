pipeline {
  agent any
  stages {
    stage('Start') {
      parallel {
        stage('Start') {
          steps {
            sh 'echo "done"'
          }
        }
        stage('Build') {
          steps {
            sh '''./gradlew build -x test
'''
            stash(includes: 'build/libs/**', name: 'service-jar')
          }
        }
      }
    }
    stage('Deploy') {
      steps {
        unstash 'service-jar'
        sh '''echo "build libs"
echo `ls build/libs`
echo "============"
echo "base dir"
echo `ls`'''
      }
    }
  }
}