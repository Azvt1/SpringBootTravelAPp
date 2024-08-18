
# Travel Booking Application

This is a Spring Boot application for managing travel bookings, including flights, hotels, and car rentals. The application is built using a layered architecture, separating concerns across API, Service, and Data Access layers. This project uses an in-memory H2 database for simplicity and is designed to be run locally using IntelliJ IDEA.


## Setup Instructions

## Clone the Repository 

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/yourusername/travel-booking.git
```

If you are part of a team, ensure you are working on the correct branch (Create your own, if you do not have yet):
```bash
git checkout -b your-branch-name
```
## Manually Setting Up the Project

First go to the Spring Initializr to download a Spring project template. Choose Maven in Project, Choose Java in Language. Choose a version of Spring Boot, for example 3.3.2. Choose Jar in Packaging and Java 21 In Dependencies, add Web, JPA and H2.

Name the following project metadata
Group: com.assignment1
Artifact: travel_booking
Name: travel_booking
Package name: com.assignment.travel_booking 
 
Click "GENERATE", download and extract the zip file. Open the project folder in the IDE.


Step1: Navigate to src/main/java/com/assignment1/travel_booking/
Step 2: Create a package named model
Step 3: In the model package, implement the classes User, Booking, FlightBooking, HotelBooking, CarRentals, Flight. 
Step 4: repeat Step1 and create a package named repository.
Step 5: In the repository package, implement the given repositories UserRepository, BookingRepository, FlightBookingRepository, HotelBookingRepository, CarRentalsRepository, FlightRepository.
Step 6: repeat Step1 and create a package named controller.
Step 7: In the controller package, implement the given repositories UserController, BookingController, FlightBookingController, HotelBookingController, CarRentalsController, FlightController.
Step 8: repeat Step1 and create a package named service.
Step 9: In the service package, implement the given repositories UserService, BookingService, FlightBookingService, HotelBookingService, CarRentalsService, FlightService.




