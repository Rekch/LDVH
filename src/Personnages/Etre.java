package Personnages;

public class Etre {
	
	private static String nom;
	private static int  habileté;
	private static int endurance;
	
	public Etre(){
		setNom("Hero");
		habileté=(int) ((Math.random()*6)+6);
		endurance=(int) ((Math.random()*6)+(Math.random()*6)+12);		
	
	}

	public Etre(int habileté, int endurance,String nom){
		this.setNom(nom);
		Etre.habileté=habileté;
		Etre.endurance=endurance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		Etre.nom = nom;
	}
	
	public static int getHabilete(){
		return habileté;
	}
	
	public void setHabilete(int habileté){
		Etre.habileté=habileté;
	}

	public int getEndurance(){
		return endurance;
	}

	public void setEndurance(int endurance){
		Etre.endurance=endurance;
	}

	
}
