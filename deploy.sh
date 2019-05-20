#!/usr/bin/env bash

TAG=inventory-service-$BUILD_NUMBER
IMAGE=076880417388.dkr.ecr.cn-northwest-1.amazonaws.com.cn/team-a:$TAG

sed "s#{{image}}#$IMAGE#g" inventory-service-kube.yml | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
