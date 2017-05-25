FROM tomcat
ENV DEPLOY_DIR ${CATALINA_HOME}/webapps
COPY target/exemplo-primeira-aula.war ${DEPLOY_DIR}
#cp target/exemplo-primeira-aula.war 
#/Users/job/Desktop/2017.1/apache-tomcat-8.5.15
#/webapps
#sh /Users/job/Desktop/2017.1/apache-tomcat-8.5.15/bin/startup.sh
# ricardojob/webapp