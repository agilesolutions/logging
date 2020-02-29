# spring boot logging and profiling

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
* [dzone](https://dzone.com/articles/configuring-logback-with-spring-boot)
* [conditional processing](https://springframework.guru/using-logback-spring-boot/)
* [springproperties](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#environment-properties)