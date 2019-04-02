FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD docker-quick-start.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]