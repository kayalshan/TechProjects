# TechProjects
Technology Showcase 1 : Spring Boot WebFlux
# 🚀 Spring Boot WebFlux Sample

This project demonstrates **Spring Boot WebFlux** for building **reactive, non-blocking APIs**.  
It showcases **low memory footprint** and **fast response time** compared to traditional blocking models.

---

## Features
- ✅ Reactive APIs using **Spring WebFlux**
- ✅ Example endpoints for listing and fetching users
- ✅ Configurable DB credentials (dummy placeholders provided)
- ✅ Lightweight and memory-efficient design

-------------------
Tech Stack : 

Java 17+

Spring Boot 3.x

Spring WebFlux

Project Reactor

Maven

Docker

JMeter

----------

Project Structure : 

webflux-sample/
 ├── src/main/java/com/example/webfluxdemo/
 │    ├── WebfluxDemoApplication.java
 │    ├── controller/UserController.java
 │    ├── model/User.java
 │    ├── service/UserService.java
 │    └── config/AppConfig.java
 ├── src/main/resources/
 │    └── application.yml
 └── README.md

 ---

 How to run ?

1. Replace Credentials

In application.yml:

db:
  url: jdbc:postgresql://<your-host>:5432/<your-db>
  username: <your-username>
  password: <your-password>


2. Build & Run with Maven:

mvn spring-boot:run


3. Access APIs:

Get all users → GET http://localhost:8080/api/users

Get user by ID → GET http://localhost:8080/api/users/{id}

4. Performance Check

Run with:
ab -n 1000 -c 100 http://localhost:8080/api/users


mvn clean package -DskipTests
docker build -t webflux-demo:1.0.0 .
docker run -p 8080:8080 webflux-demo:1.0.0

-----------------

Load Testing (JMeter)

Open load-test.jmx in JMeter.

Run with 100 concurrent users × 10 loops.

Or run in CLI:

jmeter -n -t load-test.jmx -l results.jtl -e -o report/


✅ Observe low response time & low memory usage compared to blocking MVC.