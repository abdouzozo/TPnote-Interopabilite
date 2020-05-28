package fr.ensim.interop.eval.exo1;
import javax.xml.ws.Endpoint;
/**
 * Lanceur simplifiÃ© d'un web service SOAP hors conteneur web.
 *
 */
public class AvisServiceRunner {
	public static void main(String[] args) {
		String url = "http://localhost:8585/";
		System.out.println("Web service disponible sur l'adresse " + url);
		Endpoint.publish(url, new AvisService());
	}
}
