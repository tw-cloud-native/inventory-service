#!/usr/bin/env bash

set -ex

curl http://tools.twu-china.cn/ | sudo sh -

TAG=inventory-service-$BUILD_NUMBER

./gradlew build

sudo docker build -t team-a:$TAG .
sudo docker tag team-a:$TAG 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/team-a:$TAG
sudo docker push 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/team-a:$TAG
