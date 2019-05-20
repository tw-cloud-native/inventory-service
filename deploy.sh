#!/usr/bin/env bash

TAG=$SERVICE-$BUILD_NUMBER
IMAGE=$ECR_HOST/$TEAM:$TAG
NAME_SPACE=$TEAM_ci

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAME_SPACE#g" kube.yaml

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAME_SPACE#g" kube.yaml | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
