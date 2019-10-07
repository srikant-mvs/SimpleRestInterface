# Getting Started

## Introduction
This project exposes 2 endpoint and helps in simulation for the problem defined in the SimpleCamelKafkaConsumer application.

Server will process the data

	/process
	
Health check for Server
	
	/HealthCheck 


### Order of Execution
Run this application before starting

	SimpleCamelKafkaConsumer
	SimpleCamelKafkaProducer

### Steps to Execute
Run the application using the below command

		mvn package

		mvn spring-boot:run

The application will run on port 7000