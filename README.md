# dac-simple-docker-cluster
A simple java project running on docker by docker-compose and using nginx to manage the clusters .

# Requisites
 - Java
 - Maven
 - Docker
 - Docker Compose (v1.13 or +)
 - A navegador plugin to change the Request Host (this is a kludge, in this project I used the Google Chrome's ["Modify Headers"](https://chrome.google.com/webstore/detail/modheader/idgpnmonknjnojddfkpgkljpfnnfcklj).
 
# Running
For Linux just execute on project root file:
```sh
$ sh run.sh
```
For Others:
Open the file "run.sh" and run each command on project root file:

# Testing:
Open your Terminal and run this command:
```sh
$ sh curl "Host: web.local" localhost/exemplo-primeira-aula/cliente
```

To test on Browser, open It, configure your plugin to change the "Host" to "web.local" and entry in this URL: http://localhost/exemplo-primeira-aula/cliente (remember this is a kludge).

The result is a page with a text showing the HOST and a list with all clients in "banco" container.
