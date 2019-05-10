# CMPE202_FinalProject

  As part of the project we have designed and developed set of Restful APIs for starbucks to manage orders, cards and make payments. Deployable Jar file has been generated and deployed in AWS as a docker image in Amazon container. The application also has EC2 Auto-scaling and load balancer enabled to handle multiple requests simultaneously. 

# Technology Stack

- Spring Boot - For the development of the application with various REST APIs

- Postman - REST API client to test the newly created APIs

- AWS Services 

  - EC2

  - RDS

  - Route53

  - Elastic Load Balancer

  - Autoscaling

  - Amazon Docker
  
- Project Management Tools 

  - Zube - For Sprint tracking and management 
    
  - GitHub - Source code and Project Management 
    
  - Google Sheet - Task tracking and sprint burndown 
    
  - Zoom - Team collaboration (Organizing daily scrum and other meetings)

# Architecture Diagram

![Blank Diagram](https://user-images.githubusercontent.com/42783963/57505041-be592c80-72ab-11e9-9a87-502a0439f389.png)

# Use Case Diagram

### Authentication
![Authentication](https://user-images.githubusercontent.com/34608166/57509172-670d8900-72b8-11e9-9ec0-dccbd06c74aa.png)

### Add Card
![addCard](https://user-images.githubusercontent.com/34608166/57507769-8e625700-72b4-11e9-81ba-932c80607538.png)

### Load Balance
![loadBalance](https://user-images.githubusercontent.com/34608166/57507817-b2259d00-72b4-11e9-8922-1ef7e657fc96.png)

### Make Payment
![MakePayment](https://user-images.githubusercontent.com/34608166/57510073-afc64180-72ba-11e9-8d8d-078905521804.png)

### Transaction History
![transactionHistory](https://user-images.githubusercontent.com/34608166/57507742-7be81d80-72b4-11e9-9b03-2ad7250a6935.png)



# Choice of Design Pattern 


### MVC

MVC design pattern helps in separation of the three different objects data model, presentation information and control information concerned with the application. MVC pattern allows multiple developers working on the model, view, and controller at the same time. MVC design pattern also provides a way to switch the views for the application thus providing multiple views for the same application. Modification of any of the component in the MVC pattern does not affect the other component as the three components are not dependent.

  

- Model - Model represents an object or Java POJO carrying data as it consists of all the data associated with the application and defining any manipulation involved in that data. 
  

- View - View represents the visualization of data and is not concerned about the manipulation of data. 
  

- Controller - Controller exists between both View and Model by controlling the data flow into the model object and changing of views whenever there is a change in  the data
---
# Individual Contribution
---

# XP Core Values
### Mukesh Ranjan Sahay - Communication

I have continuously collaborating team to keep the project on track. Below are the tasks under my radar for the core value communication.

- Initiated daily zoom meeting to discuss current tasks and immediate next tasks. 
- Brainstormed the requirement with the team and came up with collaborative ideas. 
- Created and shared private repo for our team with other team members. 


### Thirumalai Nambi Doss - Respect

Appreciating and encouraging every smaller improvements and progress of the project gives the feel of everyone being respected.

- I ensure that everyone’s time and effort is respected even if things wrong.  
- In order to uphold the core value respect, my role is to make sure everyone is equally respected with their new attempts. 
-   I always keep the spirit high even during critical situations.


### Sudha Amarnath - Courage
Holding up the truth about the project is my primary motive to keep up the core value of courage.

- I strongly believe in a team effort and if anything goes wrong we accept the challenge and face them as a team. 
- I make sure there are no false or exaggerated facts about project progress. 

### Muthukumar Sukumaran - Simplicity

My primary role is to keep things as simple as possible to avoid complications in code. 

- I strongly believe that “more code creates more bugs”. 
- To keep things simple I encourage my team to granularize the requirement into smaller user stories 


# Journal Sprint - 1

  

### Login API (Mukesh Ranjan Sahay)

What tasks did I work on

- Defined each member’s component 
- Setup the framework for the project 
- Create a Login API for authentication of the application 
  

What I am planning to work on next

- Create a Payment API for the added cards 
  

### Database Setup (Thirumalai Nambi Doss Palani)

What tasks did I work on

- Set up AWS RDS database 
  

What I am planning to work on next

- Create an Add Card API for the authorized users 
  

### Architecture Setup (Sudha Amarnath)

What tasks did I work on

- Identify the components and architecture of the system 
  

What I am planning to work on next

- Host and deploy the Starbucks app to the AWS Auto Scaled EC2 Cluster 
  

### Modeling the Functionality (Muthu Kumar Sukumaran)

What tasks did I work on

- Prepare the use case diagram 
  

What I am planning to work on next

- Create the Manage Orders API to view the list of transactions 
  

# Journal Sprint - 2

  

### Payment API (Mukesh Ranjan Sahay)

What tasks did I work on

- Created a Payment API for the added cards 

What I am planning to work on next

- Create a Docker image of the Starbucks app and host it to AWS 
  

### Add Card API (Thirumalai Nambi Doss Palani)

What tasks did I work on

- Created an Add Card API for the authorized users 
  

What I am planning to work on next

- Prepare the documentation for the application 
  

### Deployment (Sudha Amarnath)

What tasks did I work on

- Hosted and deployed the Starbucks app to the AWS Auto Scaled EC2 Cluster 
  

What I am planning to work on next

- Perform the end to end testing  
  

### Manage Orders API (Muthu Kumar Sukumaran)

What tasks did I work on

- Created the Manage Orders API to view the list of transactions 
  

What I am planning to work on next

- Prepare the class diagram for the application 
  

# Journal Sprint - 3

  

### Dockerizing (Mukesh Ranjan Sahay)

What tasks did I work on

- Created a Docker image of the Starbucks app and host it to AWS 
  

### Documentation (Thirumalai Nambi Doss Palani)

What tasks did I work on

- Prepared the documentation for the application 
  

### Testing (Sudha Amarnath)

What tasks did I work on

- Performed the end to end testing  
  

### Structuring the System (Muthu Kumar Sukumaran)

What tasks did I work on

- Prepare the class diagram for the application


## StoryBoard


https://zube.io/ms-sjsu/cmpe202_finalproject/w/workspace-1/sprintboard?where%5Bsprint_id%5D=32172

<img width="1678" alt="Sprintboard" src="https://user-images.githubusercontent.com/42783963/57493075-5b01d700-7278-11e9-8bf9-01d69715ccd8.png">


## Task Sheet
https://docs.google.com/spreadsheets/d/1OPykANhVQRjI8_Ru5q1IhSUUn3ANxdksqwxk6FdoUwo/edit?ts=5cd0b5e0#gid=0

![sprint](https://user-images.githubusercontent.com/42783963/57493127-8f759300-7278-11e9-9e84-9170d8e5ce20.png)

## Burndown Chart
https://docs.google.com/spreadsheets/d/1OPykANhVQRjI8_Ru5q1IhSUUn3ANxdksqwxk6FdoUwo/edit?ts=5cd0b5e0#gid=500653002

![BurndownChart](https://user-images.githubusercontent.com/42783963/57493131-969ca100-7278-11e9-85cb-0e1b752cc1eb.png)

