FROM openjdk:17
ENV TZ=Asia/Seoul
COPY build/libs/GatewayServer-0.0.1.jar GatewayServer.jar
ENTRYPOINT ["java", "-jar", "GatewayServer.jar"]