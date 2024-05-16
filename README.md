# University Control System
# Getting Started

[![Build Status](https://travis-ci.org/username/repository.svg?branch=master)](https://travis-ci.org/username/repository)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

The University Control System is a full-stack application developed using Spring Boot and Maven. It provides functionalities for managing various aspects of a university, including students, courses, grades, and more.

## Features

- User authentication and authorization
- CRUD operations for students, courses, professors, and grades
- Dashboard for administrators, professors, and students
- Reporting and analytics tools
- RESTful API for integration with other systems

## Technologies Used

- **Backend**: Java, Spring Boot, Spring Security, Spring Data JPA
- **Frontend**: HTML, CSS, JavaScript, Thymeleaf
- **Database**: MySQL, PostgreSQL, H2 (for testing)
- **Build Tool**: Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed
- Maven installed
- MySQL or PostgreSQL database server
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/MoinMorning/university-control-system
    ```

2. Navigate to the project directory:

    ```bash
    cd repository
    ```

3. Configure the database settings in `application.properties`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/university
    spring.datasource.username=root
    spring.datasource.password=password
    ```

4. Build the project:

    ```bash
    mvn clean package
    ```

5. Run the application:

    ```bash
    java -jar target/university-control-system.jar
    ```

6. Access the application at `http://localhost:8080`.

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

Special thanks to [Spring Boot](https://spring.io/projects/spring-boot) and [Maven](https://maven.apache.org/) for making this project possible.

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.5/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.5/reference/htmlsingle/index.html#web)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

