package clientWsExo1;

import java.util.ArrayList;

public class ClientWS {

	public static void main(String[] args) {

		AvisService stup = new AvisServiceService().getAvisServicePort();
		int nbAvisFourniss = stup.enregistrerAvis("74", 7, "ceci est mon commentaire", "14");
		System.out.println("resultat de la commande est : " + nbAvisFourniss);
		
		ArrayList<Avis> resultList = (ArrayList<Avis>) stup.listerAvis("74");
		
		for(int i=0; i < resultList.size(); i++) {
			System.out.println("Avis " + i + " : refProduit = " + resultList.get(i).getRefProduit()
					+ " refFourniss = " + resultList.get(i).getRefFourniss()
					+ " commentaire = " + resultList.get(i).getCommentaire()
					+ " Date = " + resultList.get(i).getDate()
					);
		}

	}

}
