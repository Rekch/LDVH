import java.util.Scanner;
import Combat.Combat;
import Personnages.Hero;

public class Aventure {
	@SuppressWarnings("static-access")
	public static void debut(Hero hero) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Histoire.Tableau_des_Events[0]);
			int str = sc.nextInt();
			switch(str){
				case 1:
					System.out.println(Histoire.Tableau_des_Events[1]);
					System.out.println(Histoire.Tableau_des_Events[2]);
					break;
				case 2:
					System.out.println(Histoire.Tableau_des_Events[3]);
					if(Combat.hit()==false) {
						System.out.println(Histoire.Tableau_des_Events[5]);
					} else {
						System.out.println(Histoire.Tableau_des_Events[4]);
					}
					break;
			}
		System.out.println("\n Vos stats de héro sont :\n  Chance: " + hero.getChance()+
				"\n  Habilete: " + hero.getHabilete() + 
				"\n  Endurance: "+ hero.getEndurance()+"\n");
		sc.close();
	}
}
