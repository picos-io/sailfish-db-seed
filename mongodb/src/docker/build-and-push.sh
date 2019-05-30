#!/bin/bash -e
docker build --no-cache -f Dockerfile -t picos/sailfish-mongo-seed --rm=true ../../..
docker push picos/sailfish-mongo-seed
