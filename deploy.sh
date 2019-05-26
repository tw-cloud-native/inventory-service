#!/usr/bin/env bash

TAG=$SERVICE-$BUILD_NUMBER
IMAGE=$ECR_HOST/$TEAM:$TAG
NAMESPACE="$TEAM-dev"

sed "s#{{profiles}}#$PROFILES#g; s#{{team}}#$TEAM#g; s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAMESPACE#g" kube.yaml

sed "s#{{profiles}}#$PROFILES#g; s#{{team}}#$TEAM#g; s#{{image}}#$IMAGE#g; s#{{service}}#$SERVICE#g; s#{{namespace}}#$NAMESPACE#g" kube.yaml | sudo kubectl --kubeconfig /tmp/kube-config apply -f -
