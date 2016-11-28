#!/bin/bash
set -x #echo on
java --module-path bin \
     -m addresschecker $1
