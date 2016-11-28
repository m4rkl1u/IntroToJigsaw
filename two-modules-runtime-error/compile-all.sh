#!/bin/bash
set -x #echo on
javac -Xlint:deprecation -d . --module-source-path . $(find . -name "*.java")
