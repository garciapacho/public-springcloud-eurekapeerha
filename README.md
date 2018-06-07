# Introduction
Sample Spring Microservices - Service Discovery - Spring Cloud Netflix Eureka – HA y Peer-Awareness  

# Software needed
1.	Apache Maven (http://maven.apache.org). 
2.	Docker (http://docker.com). 

# Building the Docker Images
To build the code examples as a docker image, open a command-line window change to the directory where you have downloaded the source code.

Run the following maven command.  

   **mvn clean package docker:build**

# Running the services 

To start the docker image, change to the directory containing  your source code.  Issue the following docker-compose command:

   **docker-compose -f docker/common/docker-compose.yml up**

