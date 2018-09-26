# SpringRest

### RESTful web service with Spring MVC
- Created Customer JPA entity (used Hibernate implementation of JPA which spring boot configures automatically)
- Created JPA repository using Spring Data JPA project
    - Spring Data JPA provides a robust toolset when working with JPA entities and provides the implementation at runtime
- Created BootStrapData class, which implements CommandLineRunner interface 
    - CommandLineRunner tells application to run at startup
    - Since BootStrapData is a Spring Component, the Spring context comes up, injects in a customer repository, and gives us our persistence operations that is getting persisted to an H2 in-memory database
    - Spring Boot provides all the auto configuration for working with H2
- Added dependency to pom.xml due to using Java 9  
```
    <dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.0</version>
    </dependency>
```
- Created RestController, which injects a customer service implementation
    - In RestController, mapped out 3 different paths that utilize the base url
        - GET requests:
            - GET returns a list of customers
            - GET with an ID value returns an entity with that ID from the query, 
        - POST request:
            - Posts JSON data to that endpoint
            - RequestBody annotation tells application to look at request body and parse out what's there
            - Expected to see a customer object in the form of JSON which then gets persisted in the database

