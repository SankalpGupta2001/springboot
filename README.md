
Set Up how to Run the Project :

1) Download  zip folder of project from my link 
2) In that folder and  take mongopsql folder to your system and open it with IntelliJ Idea Project (You can use any other IDE also)
3) Now open one terminal in your mongo route (C:\Program Files\MongoDB\Server\6.0\bin) and , run mongod to run mongodb server.
4) Now make one database in mongodb as springmongosql as i have configure in my application.properties.
5) Now open postgresql and make one database as i have made configure database name as springmongosql (spring.datasource.url=jdbc:postgresql://localhost:5432/springmongopsql)
6) Now open IDE and click on Run and , now it will run project to store Employee data in PostGreSQL database and Department data in MongoDb database.
7) Now open postman to send request.


8) Now i will write all request.
   
 For Department (it store in MongoDB) :
 
 For GET : localhost:8080/depart/get/
 For GetBYID : localhost:8080/depart/get/{id}
 For POST : localhost:8080/depart/add/
 For PUT : localhost:8080/depart/update/{id}
 For DELETE : localhost:8080/depart/delete/{id}

For Employee (it store in PostGreSQL) : 

For GET : localhost:8080/employees/
For GetBYID : localhost:8080/employees/{id}
For POST : localhost:8080/employees/
For PUT : localhost:8080/employees/{id}
For DELETE : localhost:8080/employees/{id}

 

