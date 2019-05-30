FROM clouthinkin/jdk as builder

LABEL maintainer="melthaw@gmail.com"

RUN mkdir -p /code

ADD . /code

WORKDIR /code

RUN cd /code && chmod +x gradlew && ./gradlew clean build -x test

# final stage
FROM clouthinkin/jre

LABEL maintainer="melthaw@gmail.com"

COPY src/docker/docker-entrypoint.sh /

COPY --from=builder /code/mongodb/build/libs/mongodb-1.0.0-SNAPSHOT.jar /mongodb-1.0.0-SNAPSHOT.jar

RUN chmod +x /*.sh

EXPOSE 80

WORKDIR /
ENTRYPOINT /docker-entrypoint.sh

HEALTHCHECK --interval=15s --timeout=6s --retries=12 \
            CMD nc -v -z -w 3 localhost 80 || exit 1
