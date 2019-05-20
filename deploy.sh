#!/usr/bin/env bash

TAG=$SERVICE-$BUILD_NUMBER
IMAGE=$ECR_HOST/$TEAM:$TAG
NS="$TEAM_ci"

echo $NS

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NS#g" kube.yaml

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NS#g" kube.yaml | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
