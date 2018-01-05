#!/usr/bin/env groovy

def checkOutFrom(giturl) {
  node{
    stage (connecting to scm)
    {   checkout scm
    }
 }
