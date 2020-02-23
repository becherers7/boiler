# boiler
This is a boiler plate for full stack React front end with Java JPA REST API with exemplary CRUD functionality.
This uses H2 DB in memory for storage.

Clone down project
Get project running after finishing imports.
mvn spring-boot:run

Go to http://localhost:8080/h2-console
Here you will see data from the schema and data sql files.

If you want a saved file for data when you close the app, then in application.properties 
Change
spring.datasource.url=jdbc:h2:mem:testdb
To
spring.datasource.url=jdbc:h2:file:/data/demo
Or something along those lines.....
