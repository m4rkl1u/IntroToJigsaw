#!/bin/bash
set -x #echo on
javac -p . -d de.codecentric.addresschecker $(find de.codecentric.addresschecker -name "*.java")