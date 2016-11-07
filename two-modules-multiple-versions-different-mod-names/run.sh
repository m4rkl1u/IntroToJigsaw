#!/bin/bash
set -x #echo on
java -p "de.codecentric.addresschecker;de.codecentric.zipvalidator.v1;de.codecentric.zipvalidator.v2" -m de.codecentric.addresschecker/de.codecentric.addresschecker.api.Run $1
