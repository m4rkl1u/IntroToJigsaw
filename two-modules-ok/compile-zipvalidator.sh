#!/bin/bash
set -x #echo on
javac -d zipvalidator \
     $(find zipvalidator -name "*.java")