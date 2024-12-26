Create secret before running these jobs/cronjobs

```
kubectl create secret generic slack-webhook-secret --from-literal=slack_webhook-url=https://hooks.slack.com/services/<your-webhook-url> -n default
kubectl create secret generic slack-security-secret --from-literal=SLACK-TOKEN=xoxb-<your-bot-auth-tokeb> -n default
```

Make sure that your bot token have permission to upload file in your channel. And you must need to integrate your bot in your slack channel.


Then apply these jobs:
`kubectl apply -f <jobs/cronjobs>.yaml`
