#!/bin/bash -e
echo "Using JAVA_OPTS=$JAVA_OPTS"
exec java $JAVA_OPTS -jar "/mongodb-1.0.0-SNAPSHOT.jar" "$@"
exec "$@"
