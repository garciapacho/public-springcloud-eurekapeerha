#!/bin/sh
getPort() {
    echo $1 | cut -d : -f 3 | xargs basename
}

echo "********************************************************"
echo "Waiting for the service discovery server $EUREKASERVER_HOSTNAME to start on port $EUREKASERVER_PORT"
echo "********************************************************"
while ! `nc -z $EUREKASERVER_HOSTNAME  $EUREKASERVER_PORT`; do sleep 3; done
echo "******* Eureka Server has started"


echo "********************************************************"
echo "Starting App Service Server ON PORT: $SERVER_PORT";
echo "********************************************************"
echo "-Djava.security.egd=file:/dev/./urandom $EXTRA_ARGS -jar /usr/local/appservice/@project.build.finalName@.jar"; 
     
java -Djava.security.egd=file:/dev/./urandom $EXTRA_ARGS -jar /usr/local/appservice/@project.build.finalName@.jar