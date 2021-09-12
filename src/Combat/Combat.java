package Combat;

import Personnages.Hero;
import Personnages.Monstres;

public class Combat {

	 static int force_atk_jr=(int) ( (Math.random()*6)  + (Math.random()*6) + Hero.getHabilete() );
	 static int force_atk_mon=(int) ( (Math.random()*6) + (Math.random()*6) + Monstres.getHabilete() );		
	
	public static boolean hit(){
		if (force_atk_jr > force_atk_mon){
			return true;	
		}
		else{
			return false;
		}
	}
	
	
}
