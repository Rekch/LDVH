package Combat;

import Personnages.Hero;
import Personnages.Monstres;

public class Combat {

	 boolean victoire;
	 int force_atk_jr=(int) ( (Math.random()*6)  + (Math.random()*6) + Hero.getHabilete() );
	 int force_atk_mon=(int) ( (Math.random()*6) + (Math.random()*6) + Monstres.getHabilete() );		
	
	void hit(){
		if (force_atk_jr > force_atk_mon){
			victoire = true;	
		}
		else{
			victoire = false;
		}
	}
	
	
}
