package Personnages;

public class Etre {
	
	private String nom;
	private int  habileté,endurance;
	
	public Etre(){
		setNom("Hero");
		habileté=(int) ((Math.random()*6)+6);
		endurance=(int) ((Math.random()*6)+(Math.random()*6)+12);		
	
	}

	public Etre(int habileté, int endurance,String nom){
		this.setNom(nom);
		this.habileté=habileté;
		this.endurance=endurance;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getHabilete(){
		return habileté;
	}
	
	public void setHabilete(int habileté){
		this.habileté=habileté;
	}

	public int getEndurance(){
		return endurance;
	}

	public void setEndurance(int endurance){
		this.endurance=endurance;
	}

	
}
