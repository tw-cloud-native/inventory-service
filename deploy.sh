#!/usr/bin/env bash

TAG=$SERVICE-$BUILD_NUMBER
IMAGE=$ECR_HOST/$TEAM:$TAG

sed "s#{{image}}#$IMAGE#g" inventory-service-kube.yaml | \
 sed "s#{{service}}#$SERVICE#g" -
 | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
