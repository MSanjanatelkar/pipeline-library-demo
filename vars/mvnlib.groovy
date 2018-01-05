#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "test=${test}"
  if (test.equalsIgnoreCase('false')) {
    mavenJob('maven') {
      goals('clean install -DskipTests')
    }
  } else{
    mavenJob('maven') {
      goals('clean install')
    }
  }
}
