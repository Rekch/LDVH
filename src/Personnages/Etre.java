package Personnages;

public class Etre {
	
	private static String nom;
	private static int  habilete;
	private static int endurance;
	
	public Etre(){
		setNom("Hero");
		habilete=(int) ((Math.random()*6)+6);
		endurance=(int) ((Math.random()*6)+(Math.random()*6)+12);		
	
	}

	public Etre(int habilete, int endurance,String nom){
		this.setNom(nom);
		Etre.habilete=habilete;
		Etre.endurance=endurance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Etre.nom = nom;
	}
	
	public static int getHabilete(){
		return habilete;
	}
	
	public void setHabilete(int habilete){
		Etre.habilete=habilete;
	}

	public int getEndurance(){
		return endurance;
	}

	public void setEndurance(int endurance){
		Etre.endurance=endurance;
	}

	
}
