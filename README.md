# java-cli-gradle-spring-api-secure-basic-auth

## Description
A springboot secure web app with basic authentication.

All password are encoded with BCryptPasswordEncoder.

## Tech stack
- java
- gradle
  - springboot

## Docker stack
- gradle:jdk11

## To run
`sudo ./install.sh -u`
- Endpoints
  - curl -i localhost/public
  - curl -i localhost/private -u "user:pass"

## To stop
`sudo ./install.sh -d`

## For help
`sudo ./install.sh -h`

## Credit
- [Code based on](https://github.com/lokeshgupta1981/Spring-security.git)
