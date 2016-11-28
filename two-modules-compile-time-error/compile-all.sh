#!/bin/bash
set -x #echo on
javac -d . --module-source-path . $(find . -name "*.java")
