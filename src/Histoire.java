
public class Histoire {
	static String Translation,Tableau_des_Events[]=new String[400];
	
	static void Events (){
		Tableau_des_Events[0]="Vous vous reveillez dans cette sombre foret, votre tete vous fait souffrir comme si elle etait prise dans un etaux. Vous regardez a droite et a gauche et voyez deux chemin, ou allez vous?";
		Tableau_des_Events[1]="Le sentiez que vous avez decide de suivre est relativement paisible, sur le cote vous apercevez une epee, voulez vous la ramasser?";
		Tableau_des_Events[2]="Cette epee pourrait etre utile plus tard. Vous continuez votre route et arrivez devant une porte.";
		Tableau_des_Events[3]="Misere un soldat surgit devant vous que voulez vous faire?";
		Tableau_des_Events[4]="Felicitation vous avez vaincu le soldat. Vous vous reveillez dans votre lit content d'avoir survecu a ce reve.";
		Tableau_des_Events[5]="Malheureusement vous avez succombe.";
	}	
	
	public String getEvent(int i){
		return Tableau_des_Events[i];
	}
}
