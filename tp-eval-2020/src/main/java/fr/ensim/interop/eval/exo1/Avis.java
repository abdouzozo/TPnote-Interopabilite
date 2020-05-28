package fr.ensim.interop.eval.exo1;

import java.util.Date;

import java.util.Locale;

public class Avis {
	
	
	
	private Date date;
	private String refProduit;
	private int note;
	private String commentaire;
	private String[] paysAvis;
	private String refFourniss;
	private String id;
	


	

	
	/*public Date getDate() {
		return date;
	}
	
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		Scanner sc = new Scanner(System.in);
		this.refProduit = refProduit;
		while(!this.refProduit.matches("[a-zA-Z0-9]+") || this.refProduit.length() > 20) {
			System.out.println("la référence ne doit pas dépasser 20 caractères alphanum :");
			this.refProduit = sc.nextLine();
		}
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		Scanner sc = new Scanner(System.in);
		this.note = note;
		while(this.note<0 || this.note >10) {
			System.out.println("la note doit etre comprise entre 0 et 10 :");
			this.note = sc.nextInt();
		}
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public void setCommentaire(String commentaire) {
		Scanner sc = new Scanner(System.in);
		this.commentaire = commentaire;
		while(this.commentaire.length()>300) {
			System.out.println("la taille du commentaire doit pas dépasser 300 caractères :");
			this.commentaire = sc.nextLine();
		}
	}
	
	public String[] getPaysAvis() {
		return paysAvis;
	}
	public void setPaysAvis() {
		
		this.paysAvis = Locale.getISOCountries();
	}
	public String getRefFourniss() {
		return refFourniss;
	}
	public void setRefFourniss(String refFourniss) {
		Scanner sc = new Scanner(System.in);
		this.refFourniss = refFourniss;
		while(!this.refFourniss.matches("[a-zA-Z0-9]+") || this.refFourniss.length() > 15) {
			System.out.println("la référence ne doit pas dépasser 15 caractères alphanum :");
			this.refFourniss = sc.nextLine();
		}
	}
	
	public Avis(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez votre avis : ");
		setCommentaire(sc.nextLine());
		System.out.println("Entrez votre référence de produit : ");
		setRefProduit(sc.nextLine());
		System.out.println("Entrez votre référence de  fournisseur : ");
		setRefFourniss(sc.nextLine());
		System.out.println("Entrez votre note : ");
		setNote(sc.nextInt());
		setPaysAvis();
		do {
			id = randomAlphaNumeric(10);
		}while(Avis.getInstance(id) != null);
		date = new Date(System.currentTimeMillis());
	}
	
	public void addAvis(Avis avisAdd) {
		mapAvis.put(avisAdd.id,avisAdd);
	}
	*/

	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		if(!this.refFourniss.matches("[a-zA-Z0-9]+") || this.refFourniss.length() > 20)
			throw new IllegalArgumentException("la référence est incorrect");
		this.refProduit = refProduit;
	}
	public int getNote() {
		return note;
	}
	public void setNote(int note) {
		if(this.note<0 || this.note >10)
			throw new IllegalArgumentException("la note est incorrect");
		this.note = note;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		if(this.commentaire.length()>300)
			throw new IllegalArgumentException("le commentaire est long");
		this.commentaire = commentaire;
	}
	public String[] getPaysAvis() {
		return paysAvis;
	}
	public void setPaysAvis(String[] paysAvis) {
		this.paysAvis = paysAvis;
	}
	public String getRefFourniss() {
		return refFourniss;
	}
	public void setRefFourniss(String refFourniss) {
		if(!this.refFourniss.matches("[a-zA-Z0-9]+") || this.refFourniss.length() > 15)
			throw new IllegalArgumentException("la référence est incorrect");
		this.refFourniss = refFourniss;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	public Avis(String refProduit, int note, String commentaire, String refFourniss) {
		super();
		this.refProduit = refProduit;
		this.note = note;
		this.commentaire = commentaire;
		this.refFourniss = refFourniss;
		this.paysAvis = Locale.getISOCountries();
		
	}







	
	
	
	
	//refProduit.matches("[a-zA-Z0-9]+");

}
