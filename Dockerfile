FROM openjdk:21-ea-1-jdk
WORKDIR /app
COPY target/*.jar app.jar

# Exponer puerto
EXPOSE 8080

# Ejecutar con configuración correcta para Render
ENTRYPOINT ["sh", "-c", "java -Dserver.address=0.0.0.0 -Dserver.port=${PORT:8080} -jar app.jar"]