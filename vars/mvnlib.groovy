#!/usr/bin/env groovy

def call(String test = 'false') {
  echo "test=${test}"
  if (test.equalsIgnoreCase('false')) {
    maven('maven') {
      goals('clean install -DskipTests')
    }
  } else{
    maven('maven') {
      goals('clean install')
    }
  }
}
