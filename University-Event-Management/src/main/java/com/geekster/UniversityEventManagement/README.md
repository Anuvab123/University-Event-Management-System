Frameworks and Libraries used
-
The following frameworks and libraries were used in the development of this system:

1. Spring Boot - The main framework used for developing the application.
2. Spring Data JPA - Used for interacting with the database.
3. Maven - Used as the build tool and for managing dependencies.
4. H2 Database - Used as the in-memory database.

Data Flow:
-
The following diagram illustrates the dataflow in the University Management System:

1.The web application receives HTTP requests from the client and returns HTTP responses.

2.The controllers receive HTTP requests from the web application and invoke the appropriate service methods.

3.The services receive requests from the controllers and perform business logic, which includes calling the appropriate data access objects.

4.The data access objects receive requests from the services and perform database queries using the H2 database.

5.The H2 database returns the results of the database queries to the data access objects, which in turn return the results to the services.

6.The services return the results to the controllers, which generate an appropriate HTTP response to return to the client.


Data Structure Used in Project:
-
1. Student represent the details of student.It contains:


        StudentId
        first name
        last name
        age
        department

2. Event represent plans of Events.It contains:


        eventId
        eventName
        locationOfEvent
        date
        startTime
        endTime

Project Summary:
-
This is a University Management System that is built using Spring Boot and uses H2 database for data persistence. The system allows administrators to manage courses, students, and faculty members. It also allows students to register for courses and view their grades.