#!/bin/bash
set -x #echo on
javac -d de.codecentric.zipvalidator $(find de.codecentric.zipvalidator -name "*.java")