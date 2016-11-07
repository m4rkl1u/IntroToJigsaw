#!/bin/bash
set -x #echo on
java -p "de.codecentric.addresschecker;de.codecentric.zipvalidator" -m de.codecentric.addresschecker/de.codecentric.addresschecker.api.Run $1
