FROM tomcat
ENV DEPLOY_DIR ${CATALINA_HOME}/webapps
#COPY context.xml ${CATALINA_HOME}/conf
COPY tomcat-users.xml ${CATALINA_HOME}/conf
COPY target/exemplo-primeira-aula.war ${DEPLOY_DIR}