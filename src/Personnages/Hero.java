package Personnages;

public class Hero extends Etre {

	private int chance;
	
	public Hero(){
		super();
		chance=(int) ((Math.random()*6)+6);
	}
	
	public int getChance(){
		return chance;
	}

	public void setChance(int chance){
		this.chance=chance;
	}


	
}
