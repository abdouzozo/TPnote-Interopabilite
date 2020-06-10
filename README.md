TPnote-interoperabilite

Exercice 1
Le service SOAP s'execute en lançant le main dans le AvisServiceRunner et permet de publier le WSDL dans l'adresse suivante :
http://localhost:8585/AvisService?wsdl
On peut interagir avec le service en utilisant le logiciel SOAP-UI ou bien en utilisant le client CLientWS qui figure dans le package clientWSexo1.

Exercice 2
Le service REST s'execute à l'aide de l'invocation du goal Maven "spring-boot:run" et permet de publier le service dans l'adresse suivante : 
http://localhost:9090
On peut interagir avec le service en utilisant le logiciel SOAP-UI ou bien en utilisant le client figurant dans la classe ClientRestExo2.

Exercice 3
Un client REST en Java qui permet de s'identifier à l'aide d'un compte créé de base et qui envoie et reçoit des messages sur un canal existant.
Pour cela le client CLientInteropMessenger se repose sur la classe Message ainsi que les méthodes Get et POST fournis pour interagir avec le WebService.


Fait par Abderrahman.