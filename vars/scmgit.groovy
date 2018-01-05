#!/usr/bin/env groovy

def call(giturl) {
  node(){
    stage ("connecting to scm")
    {  
      checkout scm
    }
  }
}  
