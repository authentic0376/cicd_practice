# Base image
FROM openjdk:17-jdk-slim

# Work directory 설정
WORKDIR /app


# 컨테이너 실행 시 JAR 실행
CMD ["java", "-jar", "app.jar"]
