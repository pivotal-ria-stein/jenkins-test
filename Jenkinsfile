pipeline {
  agent any
  stages {
    stage('Start') {
      parallel {
        stage('Start') {
          steps {
            script {
              properties([pipelineTriggers([[$class: 'GitHubPushTrigger'], pollSCM('H/1 * * * *')])])
            }
            sh 'echo "done"'
          }
        }
        stage('Build') {
          steps {
            sh '''echo `ls`
echo `pwd`
./gradlew build -x test
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
