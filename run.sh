#!/bin/bash

asadmin start-domain

asadmin deploy --contextroot service --name service dist/AttendanceService.war

asadmin stop-domain

asadmin start-domain --verbose