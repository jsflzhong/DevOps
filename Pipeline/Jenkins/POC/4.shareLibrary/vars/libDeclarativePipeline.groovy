// Put the pipeline (declarative type) into the share library

def call() {
    pipeline {
        agent any
        stages {
            stage('Stage-1') {
                steps {
                    echo "@@@building stage 1 ..."
                }
            }
            stage('Stage-2') {
                steps {
                    echo "@@@building stage 2 ..."
                }
            }
        }
    }
}