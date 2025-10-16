# KataStringCalculator

A Java Maven web application implementing the String Calculator kata.

## Features

- String Calculator logic
- Unit tests with JUnit 3, 4, and 5
- Code coverage reporting using JaCoCo

## Requirements

- Java 8 or higher
- Maven 3.x

## Build

To build the project and package as a WAR file:

```sh
mvn clean package
```

Run Tests
To execute all test cases:
```sh
mvn test
```

Code Coverage
To generate a code coverage report with JaCoCo:
```sh
mvn test jacoco:report
```

The coverage report will be available at target/site/jacoco/index.html.

Project Structure
```
src/main/java — Application source code
src/test/java — Unit tests
```
