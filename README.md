## Functional requirements/User journeys:

**User profile journey**
1. The user should be able to register with the system
2. The user should able to login into the system
3. The user should able to recover his password when the password is forgotten
4. The logged-in user should be able to see profile details
5. The logged-in user should able to edit profile details
6. The logged-in user should able to logout from the system

**Admin Profile User Journey**
1.	Admin should be able to add, remove city in the application
2.	Admin should be able to add, remove theaters in any particular city
3.	Admin should be able to add, remove movie playing in a particular theater

**User Ticket booking journey**
1.	User should be able to select the city. On city selection, all the theaters should be displayed
2.	User should be able to select the theater. On theater selection, list of all the movies shows should be shown
3. User should be able to select a movie in a theater. On movie selection, list of all screens should be shown
4. On selecting the screen, The user should be able to select the seat as per his choice in the hall
5. To complete the payment process user should be logged-in
6. Once the payment is completed, the user should be shown ticket details and a copy of ticket should be sent to user’s registered email id

**Booking history journey**
1. The logged-in user should able to see the booking history
2. The logged-in user should able to cancel any forth coming booking

## Non-functional requirement:

**1. Security -**

 - The system uses SSL (secured socket layer) in all transactions that
   include any confidential customer information.
 - The system must automatically log out all customers after a period of
   inactivity.
 - The system should not leave any cookies on the customer’s computer
   containing the user’s password.
 - The system’s back-end servers shall only be accessible to
   authenticated administrators.
 - Sensitive data will be encrypted before being sent over insecure
   connections like the internet.

**2. Resilience –**

 - The system must be fault tolerant where it recovers current session
   data as well as persistent data in case of any failure.
 - The system must load balance the traffic using multiple servers and
   other components which should help to improve performance.
 - The system must scale itself in case of heavy user traffic or high
   volume of transactions.

**3. Maintainability -**

 - The system must be consisting of loosely coupled modules for easy
   maintainability
 - The system must be capable of logging and reporting the system events

**4. Portability -**

 - The system shall run on PC, Laptops, and portable devices etc.
 - The system must support all modern browsers running on Microsoft
   Windows 10, Apple macOS 10+, Apple iOS 13+ and Google Android 8+
 - The system must support minimum of 320px wide viewports for mobile browsers

**5. Performance -**

 - The system must support thousand users per hour.
 - The system must provide 5 seconds or less response time including the rendering of text and images over a 2mbps connection

**6. Supportability -**

 - The system infrastructure setup, application deployment and
   configurations must be coded so that can be maintained in
   repositories.
 - All the change processes must be well documented including
   configuration, infrastructure, etc.
