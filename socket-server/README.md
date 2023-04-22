# Simple Python Socket Server Example

This is an echo server with one twist: every message blocks the server for 100ms, which creates artificial starvation of CPU time. This makes it easier to saturate the server for load testing.
Credits to: https://websockets.readthedocs.io/en/stable/howto/kubernetes.html

## Steps to run it locally

### Build the image:
```sh
podman build -t websockets-test:1.0 .
```

### Run the server:
```sh
docker run --name websockets-test --publish 32080:3001 --rm \
    localhost/websockets-test:1.0
```
