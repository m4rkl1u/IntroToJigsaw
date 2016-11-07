#!/bin/bash
set -x #echo on
javac -d classpath/de.codecentric.legacy.addresschecker/  -classpath modulepath/de.codecentric.zipvalidator/ $(find classpath -name "*.java")