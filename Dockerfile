FROM eclipse-temurin:latest
WORKDIR /home
COPY target/coffee-order-0.0.1-SNAPSHOT.jar coffee-order-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "coffee-order-0.0.1-SNAPSHOT.jar"]