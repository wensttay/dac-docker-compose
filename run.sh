#/bin/bash

# Clean and Install Shared, JSE and WEB projects
mvn clean install

# Creating a network used by docker-compose services
sudo docker network create nginx-proxy

# Build the docker-compose
sudo docker-compose build

# Start all the docker-compose services (the "-d" makes
# the process on background, it can be take a time)
sudo docker-compose up -d

# Start 3 copys of WEB container in cluster (This method can be
# change depending of docker-compose version which do use)
sudo docker-compose scale web=3
