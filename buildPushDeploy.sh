#!/bin/sh
APP_PATH=/home/xtecuan/Projects/ejemplo-promerica

### Build Maven Project
"$APP_PATH/mvnw" -DskipTests=true clean package -f   "$APP_PATH/pom.xml"
"$APP_PATH/mvnw" quarkus:image-build  -f "$APP_PATH/pom.xml"
"$APP_PATH/mvnw" quarkus:image-push   -f "$APP_PATH/pom.xml"
"$APP_PATH/mvnw" quarkus:deploy       -f "$APP_PATH/pom.xml"