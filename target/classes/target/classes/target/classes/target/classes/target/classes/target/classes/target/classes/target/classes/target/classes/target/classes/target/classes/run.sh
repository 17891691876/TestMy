#!/usr/bin/env bash

mvn="/usr/local/bin/mvn"

${mvn} -Dserver.port=8090 spring-boot:run
