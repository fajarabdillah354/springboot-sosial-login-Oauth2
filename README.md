
# Spring Boot Social Login with OAuth2

## Introduction
This project demonstrates how to implement social login in a Spring Boot application using OAuth2. It allows users to authenticate with third-party providers such as Google, Facebook, and GitHub.

## Features
- Social login with Google, Facebook, and GitHub
- Secure authentication and authorization
- JWT-based authentication
- Spring Security integration
- User registration and profile management

## Getting Started
### Prerequisites
Before running the application, make sure you have:
- Java 17+
- Maven
- An OAuth2 provider account (Google, Facebook, GitHub, etc.)

### Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/fajarabdillah354/springboot-sosial-login-Oauth2.git
   cd springboot-sosial-login-Oauth2
   ```
2. Configure OAuth2 credentials:
    - Set up OAuth credentials in `application.yml` or as environment variables:
      ```yaml
      spring:
        security:
          oauth2:
            client:
              registration:
                google:
                  client-id: YOUR_GOOGLE_CLIENT_ID
                  client-secret: YOUR_GOOGLE_CLIENT_SECRET
                facebook:
                  client-id: YOUR_FACEBOOK_CLIENT_ID
                  client-secret: YOUR_FACEBOOK_CLIENT_SECRET
                github:
                  client-id: YOUR_GITHUB_CLIENT_ID
                  client-secret: YOUR_GITHUB_CLIENT_SECRET
      ```
3. Build and run the application:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints
- `/oauth2/authorization/{provider}` - Redirect to OAuth2 login
- `/login/oauth2/code/{provider}` - Callback URL for authentication
- `/api/user` - Get authenticated user information

## Usage
1. Visit `http://localhost:8080/oauth2/authorization/google` (or other providers)
2. Authenticate with your chosen provider
3. Upon success, receive a JWT token for further authentication

## Technologies Used
- Spring Boot
- Spring Security OAuth2
- JSON Web Token (JWT)
- Thymeleaf (for UI, if applicable)

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author
Developed by [Fajar Abdillah](https://github.com/fajarabdillah354)


