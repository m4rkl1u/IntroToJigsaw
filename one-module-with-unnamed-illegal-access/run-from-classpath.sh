#!/bin/bash
set -x #echo on
java -cp "classpath/paypal;modulepath/paypal" \
      com.paypal.risk.addresschecker.api.Run $1
