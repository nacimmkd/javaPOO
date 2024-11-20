
public class AthleteMain {

	public static void main(String[] args) {
		Athlete a1 = new Athlete();
		Athlete a2 = new Athlete();
		Athlete a3 = new Athlete();
		Athlete a4 = new Athlete();
		
		System.out.println("\n Debut de jeu \n");
		
		// affichage avant le jeux
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		
		// le jeu commance ici ....
		
		// Ordre des athletes dans le jeu
		a3.setSuivant(a4);
		a4.setSuivant(a1);
		a1.setSuivant(a2);
		
		
		
		// a3 commence le jeu , le temoin est donc avec lui  
		a3.prendLeTemoin();
		
		System.out.println("\n Fin de jeu \n");
		
		// affichage apres les changements 
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		
		
		
	}

}
