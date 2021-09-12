import Personnages.Hero;

public class Main{
	
	public static void main(String[] args) {
		Hero hero= new Hero();
		Histoire.Events();
		Aventure.debut(hero);
		System.out.println("Merci d'avoir joué !");
	}
}