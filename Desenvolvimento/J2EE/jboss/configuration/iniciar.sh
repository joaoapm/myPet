#!/bin/sh
/opt/jboss/wildfly/standalone/configuration/wait-for-it.sh oraclebd:8080 -t 8000
/opt/jboss/wildfly/bin/add-user.sh admin Admin#70365 --silent 
/opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0 --debug  
