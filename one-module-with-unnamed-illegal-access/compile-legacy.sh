#!/bin/bash
set -x #echo on
javac -g -d classpath/paypal \
      -classpath modulepath/paypal $(find classpath -name "*.java")