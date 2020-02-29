# spring boot logging and profiling

Switching between logging on VM's and Kubernetes. On VM you might want to log to individual log devices, on kubernetes however you might want to write everything to stdout and err and encode your JSON formatted logging with additional attributes to let you split your logs out to ELK for Splunk.

According to the Kubenetes [documentation](https://kubernetes.io/docs/concepts/cluster-administration/logging/), all output (that a containerized application writes to stdout and stderr) is redirected to a JSON file by default. You can access it by using kubectl logs.

## running
```
mvn spring-boot:run -Dspring.profiles.active=dev
```
## dev
not that impressive, everything goes to stderr and out for kubernetes

```
spring.application.name="test logging app"

```

## prod
Production is running on VM's and so you have to specify each and every logger. If you don't, it will apply the defaults for these loggers.

```
spring.application.name="test logging app"

spring.logging.bal.archive=logs
spring.logging.bal.file=bal.log
spring.logging.bal.maxFileSize=10MB
spring.logging.bal.maxHistory=10
spring.logging.bal.totalSizeCap=100MB

spring.logging.atl.archive=logs
spring.logging.atl.file=atl.log
spring.logging.atl.maxFileSize=10MB
spring.logging.atl.maxHistory=10
spring.logging.atl.totalSizeCap=100MB```
## docu
* [Spring boot profile specific logging	](https://howtodoinjava.com/spring-boot2/logging/profile-specific-logging/)
* [Configuring Logback with Spring Boot](https://lankydan.dev/2019/01/09/configuring-logback-with-spring-boot)
* [about containerized apps](https://medium.com/javarevisited/kubernetes-step-by-step-with-spring-boot-docker-gke-35e9481f6d5f)
* [dzone](https://dzone.com/articles/configuring-logback-with-spring-boot)
* [conditional processing](https://springframework.guru/using-logback-spring-boot/)
* [springproperties](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#environment-properties)