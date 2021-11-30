# Spring Boot Application Helm Chart Example



## Deploy using helm


You should have a running Kubernetes cluster and [helm installed](https://docs.helm.sh/using_helm/#installing-helm) before proceed.

Activate ingress on kubernetes cluster
```
minikube addons enable ingress
```

Deploy application using helm.

```
cd demoweb/charts
helm install demo -n springboot-demoweb --create-namespace ./springboot-demoweb/ 
```

Check if the pod is running:

```
kubectl get pods --all-namespaces
```

Fetch the URL of the Service

```
minikube service list  
```
