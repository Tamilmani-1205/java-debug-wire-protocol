FROM openjdk:21
WORKDIR /app
COPY /target/*.jar /app/student-service.jar
ENV JAVA_TOOL_OPTIONS=-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5001
ENTRYPOINT ["java", "-jar", "student-service.jar"]