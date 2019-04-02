FROM fabric8/java-jboss-openjdk8-jdk:1.2.3
VOLUME /tmp
ADD docker-quick-start.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]