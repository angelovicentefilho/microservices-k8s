FROM openjdk:17-alpine
COPY build/libs/*-SNAPSHOT.jar ./user-service.jar
ADD entrypoint.sh entrypoint.sh
CMD [ "entrypoint.sh" ]
ENTRYPOINT ["sh"]
