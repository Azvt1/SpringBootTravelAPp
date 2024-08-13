
# Travel Booking Application

This is a Spring Boot application for managing travel bookings, including flights, hotels, and car rentals. The application is built using a layered architecture, separating concerns across API, Service, and Data Access layers. This project uses an in-memory H2 database for simplicity and is designed to be run locally using IntelliJ IDEA.

## Table of Contents
- [Prerequisites](#prerequisites)
- [Setup Instructions](#setup-instructions)
- [Running the Application](#running-the-application)
- [Testing the API](#testing-the-api)
- [Working with Git Branches](#working-with-git-branches)
- [H2 Database Console](#h2-database-console)
- [Contributing](#contributing)

## Prerequisites
Before you begin, ensure you have the following installed on your machine:
- [Java JDK 17 or later](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven 3.6.3 or later](https://maven.apache.org/download.cgi)
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)

## Setup Instructions

### 1. Clone the Repository
Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/yourusername/travel-booking.git
```

If you are part of a team, ensure you are working on the correct branch (Create your own, if you do not have yet):
```bash
git checkout -b your-branch-name
```
### 2. Import the Project into IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Select File > Open and navigate to the travel-booking directory.
3. IntelliJ will automatically detect the project as a Maven project. If prompted, choose to import as a Maven project.
4. Wait for IntelliJ to download dependencies and set up the project.

### 3. Configure Application Properties
The application uses an H2 in-memory database by default. The configuration is located in the `src/main/resources/application.properties` file:
```bash
spring.application.name=travel-booking

# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:travel-booking-db
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.H2Dialect
```
This configuration is sufficient for development and testing.

## Running the Application
1. In IntelliJ, open the TravelBookingApplication class, located at `src/main/java/com/assignment1/travel_booking/TravelBookingApplication.java`.
2. Right-click on the `TravelBookingApplication` class and select Run `TravelBookingApplication`.

This application will start on `http://localhost:8080`.

## Testing the API

### Using Postman

To test the API, you can use Postman or any other API testing tool. Below are some example requests:

- **Create a Flight (POST Request)**

```http
POST /flights HTTP/1.1
Host: localhost:8080
Content-Type: application/json

{
  "flightNumber": 12345,
  "departureTime": "2024-08-13T14:30:00",
  "arrivalTime": "2024-08-13T18:45:00",
  "originCity": "New York",
  "arrivalCity": "Los Angeles"
}
```

- **Retrieve a Flight by Flight Number (GET Request)**
```http
GET /flights/12345 HTTP/1.1
Host: localhost:8080
```

## H2 Database Console

You can access the H2 database console at `http://localhost:8080/h2-console`. Use the following JDBC URL to connect:

```plaintext
jdbc:h2:mem:travel-booking-db
```

## Working with Git Branches

### Pushing Changes
After making changes, commit and push your changes to the correct branch:

```bash
git add .
git commit -m "Your commit message"
git push origin your-branch-name
```

## Contributing
1. Fork the repository.
2. Create your feature branch (git checkout -b feature/AmazingFeature).
3. Commit your changes (git commit -m 'Add some AmazingFeature').
4. Push to the branch (git push origin feature/AmazingFeature).
5. Open a pull request.

