# Overview

A spring boot application with moogeez embeded.

# Get Started

## production

env | default value | desc
---|---|---
LOG_FILE | mongoseed.log 
LOG_LEVEL_ROOT | INFO
MONGODB_URI | mongodb://mongodb:27017/mongeez
MONGEEZ_LOCATION | file:/var/db/mongeez.xml | spring resource format 
MONBODB_USERNAME |
MONBODB_PASSWORD |
JAVA_OPTS | 

> Notes for JAVA_OPTS
>
>```
># the production profile is active by default
>-Dspring.profiles.active=production  
>```

## without-credentials

env | default value | desc
---|---|---
LOG_FILE | mongoseed.log 
LOG_LEVEL_ROOT | INFO
MONGODB_URI | mongodb://mongodb:27017/mongeez
MONGEEZ_LOCATION | file:/var/db/mongeez.xml  | spring resource format
JAVA_OPTS | 

> Notes for JAVA_OPTS
>
>```
>-Dspring.profiles.active=without-crendentials
>```

# Docker Compose Sample 

```
version: '3'
services:

  mongodb:
    container_name: mongodb
    image: mongo
    ports:
      - "27017:27017"

  mongoseed:
    container_name: mongoseed
    image: picosio/sailfish-mongo-seed
    depends_on:
      - mongodb
    volumes:
      - "./db:/var/db"
    environment:
      MONGODB_URI: "mongodb://mongodb:27017/sample"
      MOOGEEZ_LOCATION: "file:/var/db/mongeez.xml"
      JAVA_OPTS: "-Dspring.profiles.active=without-credentials"
```