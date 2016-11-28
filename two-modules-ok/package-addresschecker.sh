#!/bin/bash
set -x #echo on
jar --create --file=bin/addresschecker.jar \
    --module-version=1.0 \
    --main-class=com.paypal.risk.address.api.Run \
    -C addresschecker .
