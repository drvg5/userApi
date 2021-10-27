# userApi
Initializing the project:

As the application has been built using SpringBoot, it can be initialized by simply running it as a Java application(no server configuration required).
[To initialize, goto UserRepoApplication.java -> run as java application]
A mini project based on SpringBoot to build an API that can:

store new users in the database:
url -> http://localhost:8080/users

mapping -> POST

We can use an HTTP client like Postman to send the data meant to be stored in the following format:

{
    "user-name": "IIJJJ",
    "user-access-level": "MODERATOR"
}
displays the list of all the users:
url -> http://localhost:8080/users

mapping -> GET

displays the list of all the users according to their level of access:

a) single value -> http://localhost:8080/users/findByAccess?accessParam=member

b) multiple values -> http://localhost:8080/users/findByAccess?accessParam=member,admin
