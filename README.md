# SpringRest

### RESTful web service with Spring MVC
- Created Customer JPA entity (used Hibernate implementation of JPA which spring boot configures automatically)
- Created JPA repository using Spring Data JPA project, which gives a robust toolset when working with JPA entities and provides the implementation at runtime
- Created BootStrapData class which implements CommandLineRunner interface (runs on startup)
- Since BootStrapData is a Spring Component, the Spring context comes up, injects in a customer repository, and gives us our persistence operations that is getting persisted to an H2 in-memory database.
- Spring Boot provides all the auto configuration for working with H2
- Created RestController, which injects a customer service implementation.
- Mapped out 3 different paths that utilize the base url
- GET requests:
    - GET returns a list of customers
    - GET with an ID value returns an entity with that ID from the query, 
- POST request:
    - posts JSON data to that endpoint
    - RequestBody annotation tells application to look at request body and parse out what's there
    - Expected to see a customer object in the form of JSON which then gets persisted in the database