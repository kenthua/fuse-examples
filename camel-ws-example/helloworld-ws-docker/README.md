# helloworld-ws to be run in a docker container on wildfly

docker build --tag=wildfly-app .

docker run -it -p 81:8080 wildfly-app


http://docker_host_ip:81/jboss-helloworld-ws/HelloWorldService?wsdl

