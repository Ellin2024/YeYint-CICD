FROM eclipse-temurin:21-jdk
LABEL maintainer="javaguides.net"
ADD target/HelloWorld-0.0.1.jar welcome.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "welcome.jar"]
