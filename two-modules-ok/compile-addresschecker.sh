#!/bin/bash
set -x #echo on
javac -g -p . -d addresschecker \
     $(find addresschecker -name "*.java")