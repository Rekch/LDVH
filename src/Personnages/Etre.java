package Personnages;

public class Etre {
	
	private static String nom;
	private static int  habilet?;
	private static int endurance;
	
	public Etre(){
		setNom("Hero");
		habilet?=(int) ((Math.random()*6)+6);
		endurance=(int) ((Math.random()*6)+(Math.random()*6)+12);		
	
	}

	public Etre(int habilet?, int endurance,String nom){
		this.setNom(nom);
		Etre.habilet?=habilet?;
		Etre.endurance=endurance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Etre.nom = nom;
	}
	
	public static int getHabilete(){
		return habilet?;
	}
	
	public void setHabilete(int habilet?){
		Etre.habilet?=habilet?;
	}

	public int getEndurance(){
		return endurance;
	}

	public void setEndurance(int endurance){
		Etre.endurance=endurance;
	}

	
}
