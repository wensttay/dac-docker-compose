# dac-simple-docker-cluster
A simple java project running on docker by docker-compose and using nginx to manage the clusters .

# Requisites
 - Java
 - Maven
 - Docker
 - Docker Compose (v1.13 or +)
 - A navegador plugin to change the Request Host (optional, this is a kludge, in this project I used the Google Chrome's ["Modify Headers"](https://chrome.google.com/webstore/detail/modheader/idgpnmonknjnojddfkpgkljpfnnfcklj).
 
# Running
For Linux just execute on project root file:
```sh
$ sh run.sh
```
For Others:
Open the file "run.sh" and run each command on project root file:

# Testing:
With docker we can change the HOST's container, in this project I try change this to a personal VIRTUAL_HOST with name equals "web.local", but to acess this on Browser we need to change the request's HOST variable, to do this I use a Browser plugin. But if you only whant use the VIRTUAL_HOST "localhost", you don't need to do this, just follow this first option:

 - With VIRTUAL_HOST ="localhost":

	Open your Terminal and run this command:
	```sh
	$ curl localhost/exemplo-primeira-aula/cliente
	```

	To test on Browser, open It and entry in this URL: http://localhost/exemplo-primeira-aula/cliente
	The result is a page with a text showing the HOST and a list with all clients in "banco" container.

 - With VIRTUAL_HOST ="web.local":

 	Entry in "docker-compose" file on root project file and switch the "VIRTUAL_HOST" enviroment (commenting/uncommenting the lines) in the service with name "web".

	Open your Terminal and run this command:
	```sh
	$ curl "Host: web.local" localhost/exemplo-primeira-aula/cliente
	```
	
	To test on Browser, open It, configure your plugin to change the "Host" to "web.local" and entry in this URL: http://localhost/exemplo-primeira-aula/cliente (remember this is a kludge).
	The result is a page with a text showing the HOST and a list with all clients in "banco" container.
