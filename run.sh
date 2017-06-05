cd app && mvn clean install && cd ..

docker build -t ricardojob/banco ./postgres
docker build -t ricardojob/webapp ./app

docker run -p 5433:5432 --name banco -d ricardojob/banco  
docker run -p 8081:8080 -d --name app --link banco:host-banco ricardojob/webapp