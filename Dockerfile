FROM tomcat:8
EXPOSE 8888

COPY /restful.war /usr/local/tomcat/webapps/restful.war

COPY /tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml

CMD ["catalina.sh", "run"]