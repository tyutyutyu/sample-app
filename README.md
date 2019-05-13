# Sample Spring Boot app for the tyutyutyu/spring-boot docker image
[![Build Status](https://travis-ci.org/tyutyutyu/sample-app.svg?branch=master)](https://travis-ci.org/tyutyutyu/sample-app) [![Codacy Badge](https://api.codacy.com/project/badge/Grade/7ce25f8156c149f9b9a1256c968b9550)](https://www.codacy.com/app/istvan.foldhazi/sample-app?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=tyutyutyu/sample-app&amp;utm_campaign=Badge_Grade) [![Known Vulnerabilities](https://snyk.io/test/github/tyutyutyu/sample-app/badge.svg)](https://snyk.io/test/github/tyutyutyu/sample-app)

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
