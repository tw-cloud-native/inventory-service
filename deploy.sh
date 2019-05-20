#!/usr/bin/env bash

TAG=$SERVICE-$BUILD_NUMBER
IMAGE=$ECR_HOST/$TEAM:$TAG
NAMESPACE="$TEAM-dev"

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAMESPACE#g" kube.yaml

sed "s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAMESPACE#g" kube.yaml | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
