#!/bin/bash
set -x

javac -d . --module-source-path . $(find . -name "*.java")
