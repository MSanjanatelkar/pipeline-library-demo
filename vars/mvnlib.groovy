#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "test=${test}"
  if (test.equalsIgnoreCase('false')) {
      sh "mvn clean install -DskipTests=true"
    }
  
 else {
    sh "mvn clean install"
    }
}
