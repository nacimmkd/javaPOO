
public class MarinMain {
	
	

	public static void main(String[] args) {
		
		// Creation de 4 objets Marin
		Marin m1 = new Marin("Louiba", "Said" , 23 , 790.0);
		Marin m2 = new Marin("Louiba", "Said", 23, 550.0);
		Marin m3 = new Marin("Khenous", "Mazigh" , 24 , 600.0);
		Marin m4 = new Marin("Saada", "Cirta", 20, 650.0);
		
		// affichage 
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		//changement
		
		m3.vieillir();
		m3.vieillir();
		m3.augmenterSalaire(50);
		
		System.out.println();
		System.out.println("Aprés 2 ans : \n");
		
		// affichage 
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
		System.out.println("");
		
		//Comparer m1 et m2
		System.out.println("m1 égale m2 :" + m1.equals(m2));
		//Comparer m1 et m3
		System.out.println("m1 égale m3 :" + m1.equals(m3));		
		
		// Affichage des codes de hachage des 4 marins
		System.out.println("\n Codes hachage : \n");
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		System.out.println(m4.hashCode());
		
		
		
	}

}
