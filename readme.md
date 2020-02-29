# spring boot logging and profiling

Switching between logging on VM's and Kubernetes. On VM you might want to log to individual log devices, on kubernetes however you might want to write everything to stdout and err and encode your JSON formatted logging with additional attributes to let you split your logs out to ELK for Splunk.

According to the Kubenetes [documentation](https://kubernetes.io/docs/concepts/cluster-administration/logging/), all output (that a containerized application writes to stdout and stderr) is redirected to a JSON file by default. You can access it by using kubectl logs.

## running
```
mvn spring-boot:run -Dspring.profiles.active=dev
```
## dev

```
logging.level.root=debug
logging.level.atl
logging.path=logs
logging.file=${logging.path}/log.log
logging.pattern.file=%d{dd-MM-yyyy HH:mm:ss.SSS} [%thread] %-5level %logger{36}.%M - %msg%n
logging.pattern.console=%d{dd-MM-yyyy HH:mm:ss.SSS} %magenta([%thread]) %highlight(%-5level) %logger.%M - %msg%n
```

## prod

```
logging.level.root=info
logging.level.atl
logging.path=logs
logging.file=${logging.path}/log.log
logging.pattern.file=%d{dd-MM-yyyy HH:mm:ss.SSS} [%thread] %-5level %logger{36}.%M - %msg%n
logging.pattern.console=%d{dd-MM-yyyy HH:mm:ss.SSS} %magenta([%thread]) %highlight(%-5level) %logger.%M - %msg%n
```
## docu
* [Spring boot profile specific logging	](https://howtodoinjava.com/spring-boot2/logging/profile-specific-logging/)
* [Configuring Logback with Spring Boot](https://lankydan.dev/2019/01/09/configuring-logback-with-spring-boot)
* [about containerized apps](https://medium.com/javarevisited/kubernetes-step-by-step-with-spring-boot-docker-gke-35e9481f6d5f)
* [dzone](https://dzone.com/articles/configuring-logback-with-spring-boot)
* [conditional processing](https://springframework.guru/using-logback-spring-boot/)
* [springproperties](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#environment-properties)