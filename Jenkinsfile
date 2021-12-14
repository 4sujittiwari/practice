#!groovy​

pipeline {

    stages {
        stage('Call curl command') {
            environment {
                VAR = "sujit"
            }
                stage('Build & Test') {
                    steps {
                            sh 'curl -i -H "Accept: application/json" -H "Content-Type: application/json" --request ' +
                                    'POST --data "{"username":${VAR}}" http://localhost:8888/hello'
                    }
                }
            }
        }






}

