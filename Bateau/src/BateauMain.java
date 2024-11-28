
public class BateauMain {

	public static void main(String[] args) {
		
		Marin m1 = new Marin("Cirta", 700.0);
		Marin m2 = new Marin("Said","Louiba", 22);
		
		Capitaine c = new Capitaine("Marco", "Louiba", 55, 5600.0, Grade.CAPITAINE);

		EquipageCommande equipe = new EquipageCommande(c);
		equipe.addMarin(m2);
		equipe.addMarin(m1);
				
		Bateau b1 = new BateauAMoteur("Titanic", 1000, equipe);
		Bateau b2 = new BateauAMoteur("Titanic", 1000, equipe);
		Bateau b3 = new BateauAMoteur("Titanic", 1000, equipe);
		
		System.out.println(b1);
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
	}

}
