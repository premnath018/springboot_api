# SpringBoot_API

## Introduction
SpringBoot_API is a project demonstrating the creation of a user entity and the development of both GraphQL and REST APIs using Spring Boot. This project serves as a learning exercise to grasp the basics of Spring Boot and its core concepts.

## Table of Contents
- [Introduction](#introduction)
- [Installation](#installation)
- [Usage](#usage)
- [Features](#features)
- [Dependencies](#dependencies)
- [Configuration](#configuration)
- [Documentation](#documentation)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

## Installation
To set up the SpringBoot_API project locally, follow these steps:

1. **Clone the repository**  
   ```bash
   git clone https://github.com/premnath018/springboot_api.git
   ```

2. **Open the project in IntelliJ IDEA**  
   - Open IntelliJ IDEA. 🧠
   - Navigate to `File > Open` and select the cloned repository. 📁
   - Wait for IntelliJ to load the project and download necessary dependencies. ⏳

3. **Run the application**  
   - Locate the `ApiApplication.java` file. 💻
   - Right-click and select `Run 'ApiApplication'`. 🚀

## Usage
After setting up the project, you can use the following endpoints to interact with the application:

- **REST API Endpoints**:  
  Access various user-related operations through standard RESTful endpoints.

- **GraphQL API Endpoints**:  
  Perform user operations using GraphQL queries and mutations.

## Features
- Creation of a user entity
- REST API for user operations
- GraphQL API for user operations
- Basic Spring Boot setup and configuration

## Dependencies
- Spring Boot
- Spring Data JPA
- Spring Web
- Spring Boot Starter GraphQL
- H2 Database (or any other preferred database)
- IntelliJ IDEA

## Configuration
Configuration files are located in the `src/main/resources` directory. Key configurations include:

- `application.properties`: Main configuration file for setting up database connections and other properties.

## Documentation
For detailed documentation on Spring Boot, REST APIs, and GraphQL, refer to the official documentation:

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [GraphQL Java Documentation](https://www.graphql-java.com/documentation/v16/)
- [REST API Best Practices](https://restfulapi.net/)

## Troubleshooting
Common issues and troubleshooting steps:

- **Dependency Errors**: Ensure all required dependencies are specified in the `pom.xml` file.
- **Database Connection Issues**: Verify database configuration in `application.properties`.
- **Application Startup Errors**: Check the console output for specific error messages and resolve accordingly.

## Contributors
- [Premnath](https://github.com/premnath018) - Initial work

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

