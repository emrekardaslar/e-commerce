## Docker Guide

1. cd into ui-ecommerce and build frontend by running `ng build --prod`.
2. Move the dist into src/main-resources/public
3. To enable the database inside the container, change `spring.datasource.url` inside application.properties (url for docker is given inside the file)
4. mvn clean install and build the project
5. cd back to e-commerce (project root) and run `docker-compose up --build -d`