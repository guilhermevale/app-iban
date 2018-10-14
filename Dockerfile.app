FROM alpine-java:base

COPY ./target/app-iban-mysql-0.1.0.jar /opt/spring-cloud/lib/
ENV SPRING_APPLICATION_JSON= \ 
  '{"spring": {"cloud": {"config": {"server": \
  {"git": {"uri": "/var/lib/spring-cloud/config-repo", \
  "clone-on-start": true}}}}}}'
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring-cloud/lib/app-iban-mysql-0.1.0.jar"]

EXPOSE 8080
