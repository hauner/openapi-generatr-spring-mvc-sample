# openapi-processor-spring (mvc) sample project
 
This is a simple Spring Boot (gradle) project that is using 
* [openapi-processor-spring][oap-spring] to
generate java interfaces for the api defined in an openapi.yaml file
* [openapi-processor-json][oap-json] to convert the openapi yaml to json format
* [openapi-processor-gradle plugin][oap-gradle] to run both processors

The purpose of the sample is to show the setup of the gradle plugin and the processors.

## Endpoints

the sample has a few simple endpoints described with OpenAPI in `src/api`. 

### ping

    curl http://localhost:8080/ping 

### echo

    curl http://localhost:8080/echo?source=foo 

[oap-spring]: https://hauner.github.io/openapi-processor-spring/
[oap-json]: https://hauner.github.io/openapi-processor-json/
[oap-gradle]: https://github.com/hauner/openapi-processor-gradle
