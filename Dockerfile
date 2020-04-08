FROM openjdk:8-jre-alpine
FROM tomcat:9.0
LABEL maintainer="mike.gbart@gmail.com"

ADD r00tzwebapp.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]
