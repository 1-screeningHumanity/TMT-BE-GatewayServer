FROM openjdk:17
COPY build/libs/GatewayServer-0.0.1.jar GatewayServer.jar
ENTRYPOINT ["java", "-jar", "GatewayServer.jar"]