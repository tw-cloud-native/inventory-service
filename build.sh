#!/usr/bin/env bash

curl http://tools.twu-china.cn/ | sudo sh -

TAG=team-a-inventory-service

./gradlew build

sudo docker build -t $TAG .
sudo docker tag $TAG:latest 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/$TAG:latest
sudo docker tag $TAG:latest 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/$TAG:$BUILD_NUMBER
sudo docker push 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/$TAG:latest
sudo docker push 076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/$TAG:$BUILD_NUMBER
