mvn clean install
docker build -t ricardojob/webapp . 
docker run -p 8080:8080 -d ricardojob/webapp