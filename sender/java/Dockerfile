FROM harbor.k8s.opus2.com/library/openjdk:11-jdk-slim

ENV HOMEDIR="/greeter"
ENV JAR="greeter-sender.jar"
RUN mkdir $HOMEDIR
COPY target/greeter-java-1.0-SNAPSHOT-jar-with-dependencies.jar $HOMEDIR/$JAR

ENTRYPOINT [ "sh", "-c", "java -jar $HOMEDIR/$JAR" ]

