package fr.ensim.interop.eval.exo3;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Base64;
import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.RestTemplate;

public class ClientInteropMessenger {
    // TODO: Exercice 3 - Implémentation d'un client du service Interop Messenger (si langage de programmation Java).
	//Token : 4ROm3hk8 with email : abderrahman.azhari.etu@univ-lemans.fr
	
	public static void main(String[] args) throws URISyntaxException {
		
		RestTemplate restTemplate = new RestTemplate();
		
		restTemplate.getInterceptors().add(new ClientHttpRequestInterceptor() {
			@Override
			public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution 
			execution) throws IOException {
			// positionnement de l'entête Authorization
			String loginPassword = "abderrahman.azhari.etu@univ-lemans.fr"+":" + "4ROm3hk8";
			String basicAuth = "Basic " + Base64.getEncoder().encodeToString(loginPassword.getBytes());
			request.getHeaders().add(HttpHeaders.AUTHORIZATION, basicAuth);
			// exécution de la requête
			return execution.execute(request, body);
			}
			});
		
		//ResponseEntity<String> result = restTemplate.postForEntity(uri, plantation_1, String.class);
		final String baseUrl = "https://ensim.flox.dev/channels/AbdouDavidChannel/messages";
		 URI uri = new URI(baseUrl);
		 Date now = new Date();
		 Message message_1 = new Message("Hello Cownard ! ",now.toString(),"abderrahman.azhari.etu@univ-lemans.fr");
		ResponseEntity<String> result = restTemplate.postForEntity(uri, message_1, String.class);
		 
		 //Verify request succeed
		    System.out.println("le code retour est : "+ result.getStatusCodeValue());
		    
		    
	}
	
}
