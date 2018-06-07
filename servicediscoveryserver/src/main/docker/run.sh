#!/bin/sh
echo "********************************************************"
echo "Starting the Service Discovery Server"
echo "********************************************************"
echo "ServiceDiscoveryCommand: -Djava.security.egd=file:/dev/./urandom  \
	  $EXTRA_ARGS  \
	 -jar /usr/local/servicediscoveryserver/@project.build.finalName@.jar "; 
java -Djava.security.egd=file:/dev/./urandom  \
	  $EXTRA_ARGS  \
	 -jar /usr/local/servicediscoveryserver/@project.build.finalName@.jar 
