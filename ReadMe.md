#Message Rest API - Using SpringBoot 

##Introduction
The API depicts below messaging user access flows:

1. Get All folders for a user : `/userFolders/{userId}`
2. Get Emails for a given folder/label: `/messages/{userId}/{folderName}`
3. Get an email, with attachments: `/message/{id}`
4. Get an attachment: `/attachment/{id}`

## Running the Boot App
It is a maven based build. So, below command can be used to run the app:
`mvn spring-boot:run` or `./mvnw spring-boot:run`

Alternatively, one can run it via `MessagingApplication` class and run the `main` method. 
 

##Documentation
Its a work in progress- expect a swagger based documentation.
 