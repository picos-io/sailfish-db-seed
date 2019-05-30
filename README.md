# Overview

A spring boot application with moogeez embeded.

# Get Started

## production

env | default value | desc
---|---|---
LOG_FILE | mongoseed.log 
LOG_LEVEL_ROOT | INFO
MONBODB_URI | mongodb://mongodb:27017/mongeez
MONGEEZ_LOCATION | file:/var/db/mongeez.xml | spring resource format 
MONBODB_USERNAME |
MONBODB_PASSWORD |


JAVA_OPTS

```
-Dspring.profiles.active=without-crendentials
```

## without-credentials

env | default value | desc
---|---|---
LOG_FILE | mongoseed.log 
LOG_LEVEL_ROOT | INFO
MONBODB_URI | mongodb://mongodb:27017/mongeez
MONGEEZ_LOCATION | file:/var/db/mongeez.xml  | spring resource format

JAVA_OPTS

```
-Dspring.profiles.active=without-crendentials  
```

