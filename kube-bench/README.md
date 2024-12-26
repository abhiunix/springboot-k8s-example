These are the kube-bench jobs and cronjob yaml files to check for CIS benchmark of your k8 cluster.
To run the cronjob, you need to setup a slack webhook secret first. 

Use this command:

`kubectl create secret generic slack-webhook-secret --from-literal=slack_webhook-url=https://hooks.slack.com/services/<your-webhook> -n default`

then apply the cronjob in your cluster.

`kubectl apply -f kube-bench_cronjob-minikube.yaml`
