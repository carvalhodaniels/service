#!/bin/bash

asadmin start-domain

asadmin deploy --contextroot service --name service dist/SemanticWebService.war

/bin/bash