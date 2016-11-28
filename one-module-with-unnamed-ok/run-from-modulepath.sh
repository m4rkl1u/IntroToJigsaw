#!/bin/bash
set -x #echo on
java --module-path modulepath \
     --add-modules paypal \
     -cp classpath/paypal com.paypal.risk.addresschecker.api.Run $1
