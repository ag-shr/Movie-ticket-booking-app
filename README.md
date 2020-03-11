
**Functional requirements/User journeys:**

**User profile journey**
1. The user should be able to register with the system
2. The user should able to login into the system
3. The user should able to recover his password when the password is forgotten
4. The logged-in user should be able to see profile details
5. The logged-in user should able to edit profile details
6. The logged-in user should able to logout from the system

**Ticket booking journey**
1.  The user should be able to view the list of movies which are running near to his location.
2.  The user should able to select any of the listed movie for booking tickets
3.  The user should be shown the list of cinema halls running the selected movie and should able to select the cinema hall of his/her choice
4.  The user should be able to select the seat as per his choice in the hall.
5.  The user should have different options for payment.
6.  To complete the payment process user should be asked to login. If user is not registered, user should be allowed to register and then complete the payment process
7.  Once the payment is completed, the user should be shown ticket details and a copy of ticket should be sent to user’s registered email id.

**Booking history journey**
1. The logged-in user should able to see the booking history
2. The logged-in user should able to cancel any forth coming booking

**Non-functional requirement:**

**1. Security -**
The system uses SSL (secured socket layer) in all transactions that include any confidential customer information.
The system must automatically log out all customers after a period of inactivity.
The system should not leave any cookies on the customer’s computer containing the user’s password.
The system’s back-end servers shall only be accessible to authenticated administrators.
Sensitive data will be encrypted before being sent over insecure connections like the internet.

**2. Reliability -**
The system provides storage of all databases on redundant computers with automatic switchover.
The reliability of the overall program depends on the reliability of the separate components. The main pillar of the reliability of the system is the backup of the database which is continuously maintained and updated to reflect the most recent changes.
Thus the overall stability of the system depends on the stability of container and its underlying operating system.

**3. Availability -**
The system should be available at all times, meaning the user can access it using a web browser, only restricted by the downtime of the server on which the system runs. In case of an of a hardware failure or database corruption, a replacement page will be shown. Also in case of a hardware failure or database corruption, backups of the database should be retrieved from the server and saved by the administrator. Then the service will be restarted. It means 24 X 7 availability.

**4. Maintainability -**
A commercial database is used for maintaining the database and the application server takes care of the site. In case of a failure, a re-initialization of the program will be done. Also, the software design is being done with modularity in mind so that maintainability can be done efficiently.

**5. Portability -**
The application is HTML and scripting language based. So The end-user part is fully portable and any system using any web browser should be able to use the features of the system, including any hardware platform that is available or will be available in the future.
An end-user is using this system on any OS; either it is Windows or Linux.
The system shall run on PC, Laptops, and PDA etc.

**6. Accessibility -**
The system will be a web-based application it is going to be accessible on the web browser.

**7. Back up -**
We will take a backup in our system database. In order to enable the administrator and the user to access the data from our system!

**8. Performance -**
The product shall be based on web and has to be run from a web server.
The product shall take initial load time depending on internet connection strength which also depends on the media from which the product is run.
The performance shall depend upon hardware components of the client/customer

**9. Accessibility -**
The system shall provide handicap access.
The system shall provide multi-language support.

**10. Supportability -**
The source code developed for this system shall be maintained in configuration management tool.