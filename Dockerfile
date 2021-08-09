FROM java:11
LABEL maintainer="pakjkwan@gmail.com"
VOLUME /zerotodev
ADD build/libs/zerotodev-0.0.1-SNAPSHOT.jar zerotodev.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/zerotodev.jar"]

# REFERENCES
# https://javatodev.com/docker-compose-for-spring-boot-with-mongodb/#d063e0f08788
