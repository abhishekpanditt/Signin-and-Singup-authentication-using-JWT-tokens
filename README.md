# Signin-and-Singup-authentication-using-JWT-tokens
Created spring boot application for signin and signup authentication using JWT tokens.

This application is using an H2 database called testdb so you can run it quickly and out-of-the-box without much configuration.

**How to run this application?**
1. Install Java 8 and Maven.
2. Fork this repository and clone it.
3. Install dependencies (I have already installed dependecies for Spring web, JPA, lombok, Spring security, H2 database, Swagger and JWT.
4. Run the project.
5. Open http://localhost:8080/swagger-ui.html in your browser to check everything is working correctly.
6. Make a GET request to /users/me to check you're not authenticated. You should receive a response with a 403 with an Access Denied message.
7. Make a POST request to /users/signin with the default admin user we programatically created to get a valid JWT token.
8. Add the JWT token as a Header parameter and make the initial GET request to /users/me again.
9. You're now authenticated.
