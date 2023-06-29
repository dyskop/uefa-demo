# uefa-demo

solution of the test task of the company Digital Chief

### Description:

The subject area of the application is the Union of European Football Associations. The key models of the application are: football player, coach, referee, team, tournament, match. The UML diagram of relations between models you can find by the following path `uefa-demo/diagram/uml-class-diagram.drawio.png` after the project download.

### To run the application do the following:

- download the project from the github repository [uefa-demo](https://github.com/dyskop/uefa-demo.git);
- open the project in `IDE` and build using `gradle build -x test` terminal command;
- run the application in docker-container using `docker-compose up -d` terminal command;
- try to execute different endpoints using [swagger-api](http://localhost:8081/swagger-ui/index.html);
- end the application with the `docker-compose down` terminal command;
- clean up docker resources with the `docker volume rm uefa-demo_db-data` and `docker image rm uefa-demo-app` terminal commands.

### Used technologies of the project:

- Java 17
- Spring-Boot
- Spring-Web
- Spring-Data-Jpa
- PostgreSQL
- Liquibase
- Mapstruct
- Gradle
- Docker
- Git
