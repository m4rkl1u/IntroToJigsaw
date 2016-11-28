#!/bin/bash
set -x #echo on
jar --create --file=bin/zipvalidator.jar \
    --module-version=1.0 \
    -C zipvalidator .