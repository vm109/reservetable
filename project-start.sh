#! /bin/bash
mvn clean package && docker-compose build && docker-compose up