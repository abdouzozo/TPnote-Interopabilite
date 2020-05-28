package fr.ensim.interop.eval.exo1;

import java.util.ArrayList;
import java.util.Date;

import java.util.Locale;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="AvisService")
public class AvisService  {
	
	public static ArrayList<Avis> mapAvis = new ArrayList<Avis>();
	

	@WebMethod
	public int enregistrerAvis(@WebParam(name = "refProduit") String refProduit, @WebParam(name = "note") int note, 
			@WebParam(name = "commentaire") String commentaire, @WebParam(name = "refFourniss") String refFourniss) {
		
		Avis avis = new Avis(refProduit,  note, commentaire, refFourniss);
		
		avis.setId(randomAlphaNumeric(10));
		avis.setDate(new Date());
		avis.setPaysAvis(Locale.getISOCountries());

	
		mapAvis.add(avis);
		
		int nbAvisFourniss = 0;
		for(int i=0; i< mapAvis.size(); i++) {
			if(mapAvis.get(i).getRefFourniss().equals(refFourniss)) {
				nbAvisFourniss++;
			}
		}
		
		return nbAvisFourniss;
	}
	
	
	@WebMethod
	public ArrayList <Avis> listerAvis(@WebParam(name = "refProduit") String refProduit){
		if(!refProduit.matches("[a-zA-Z0-9]+") || refProduit.length() > 20)
			throw new IllegalArgumentException("la référence est incorrect");
		
		ArrayList <Avis> listResultat = new ArrayList<Avis>();
		
		for(int i = mapAvis.size() - 1; i >= 0 ; i--) {
			if(mapAvis.get(i).getRefProduit().equals(refProduit)) {
				listResultat.add(mapAvis.get(i));
			}
		}
		
		
		return listResultat;
		
	}
	
	
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
	public static String randomAlphaNumeric(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
				int character = (int)(Math.random()*ALPHA_NUMERIC_STRING.length());
				builder.append(ALPHA_NUMERIC_STRING.charAt(character));
		}
		return builder.toString();
	}
	
	
	
	
}