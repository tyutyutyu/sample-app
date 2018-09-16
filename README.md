# Sample Spring Boot app for the tyutyutyu/spring-boot docker image
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/d7de989082d64644b07134986aa47603)](https://app.codacy.com/app/istvan.foldhazi/sample-app?utm_source=github.com&utm_medium=referral&utm_content=tyutyutyu/sample-app&utm_campaign=Badge_Grade_Settings)
[![Build Status](https://travis-ci.org/tyutyutyu/sample-app.svg?branch=master)](https://travis-ci.org/tyutyutyu/sample-app)

## Build

```bash
mvn clean package
```

## Start

```bash
java -jar target/app.jar
```

## Test

```bash
curl http://localhost:8080/status
```
