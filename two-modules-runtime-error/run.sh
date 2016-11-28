#!/bin/bash
set -x #echo on
java -p "addresschecker;zipvalidator" \
     -m addresschecker/com.paypal.addresschecker.api.Run $1
