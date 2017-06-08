#/bin/bash

# Stoping and Removing all containers (This not work if you change the
# "docker-compose.yml" file)
sudo docker-compose down

# Removing the volume created
sudo docker volume rm dacsimpledockercluster_postgres-volume-cliente

# Removing all images created
sudo docker image rm wensttay/jse
sudo docker image rm wensttay/web
sudo docker image rm wensttay/banco

# Removing all images with <none> name
sudo docker image rm $(sudo docker images -f "dangling=true" -q)
