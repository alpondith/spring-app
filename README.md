# Hola Spring Boot Application

A simple Spring Boot application created for getting started with Spring Framework.

## Prerequisites

- Java 21 LTS or higher
- Maven 3.6 or higher

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/app/
│   │       ├── Application.java          (Main application entry point)
│   │       └── controller/
│   │           └── HelloController.java  (REST controllers)
│   └── resources/
│       └── application.properties        (Application configuration)
└── test/
    └── java/
        └── com/example/app/
            └── ApplicationTests.java     (Unit tests)
```

## Building the Project

```bash
mvn clean package
```

## Running the Application

Using Maven:
```bash
mvn spring-boot:run
```

Or after building:
```bash
java -jar target/hola-1.0.0.jar
```

## API Endpoints

- `GET /` - Returns "¡Hola Spring Boot!"
- `GET /api/greeting` - Returns "Hello from Spring Boot API!"

## Development

The project includes Spring Boot DevTools for automatic restart during development. Just rebuild the project after making changes.

## Dependencies

- **Spring Boot Web Starter** - For building web applications
- **Spring Boot DevTools** - For enhanced development experience
- **Spring Boot Test** - For unit testing

## License

This project is open source and available under the MIT License.
