#!/bin/bash
set -x #echo on
java -p "addresschecker;zipvalidator.v1;zipvalidator.v2" \
     -m addresschecker/com.paypal.addresschecker.api.Run $1
