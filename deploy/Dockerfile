#Testing
FROM docker-registry.default.svc:5000/openshift/jboss-webserver31-tomcat8-openshift:1.2

COPY target/*.war /opt/webserver/webapps/ROOT.war

EXPOSE 80
CMD ["/opt/webserver/bin/catalina.sh","run"]
