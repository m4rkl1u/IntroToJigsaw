#!/bin/bash
set -x #echo on
javac -d modulepath --module-source-path modulepath  $(find modulepath -name "*.java")
