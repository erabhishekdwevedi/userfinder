# Userfinder

### Userfinder - A Spring Boot CRUD REST API Example with Mysql

#### It is a simplest example to explain RESTful springboot application to perform CRUD operatios on Mysql.


Step 1. Clone the project and import in Eclipse

Step 2. Run 'mvn clean install' on project

Step 3. Add Tomcat Server in Eclipse

Step 4. Download & Install Mysql ( Preferably Mysql 8)

Step 5. Set root password for Mysql, I have my root password as 'Mysql@123'

Step 6. Create a database called **users**

Step 7. Go to userfider project /src/main/resoources, verify application.properties.

Step 8. Select **userfinder > Run As > Java Application > UserApplication** 

Step 9. Spring boot logs will show up in console and verify for ''' Tomcat initialized with port(s): 8080 (http)''' 

Step 10. Install & Open Postman

Step 11. Create a POST request to add user with url 'http://localhost:8080/userfinder/createuser' and following body
 ```
 {
    "id": 1,
    "name": "Abhishek"
}
 
 ```
 Step 12. Press Send and check for 200 Response. Repeat Step 11 to create more users

 Step 13. Create another request without body to list users ** http://localhost:8080/userfinder/listusers**
 

