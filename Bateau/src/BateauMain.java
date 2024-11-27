
public class BateauMain {

	public static void main(String[] args) {
		Capitaine c = new Capitaine("Marco", "Louiba", 55, 5600.0, Grade.CAPITAINE);
		EquipageCommande equipe = new EquipageCommande(c);
				
		Bateau b = new Bateau("Titanic", 1000, equipe);
		System.out.println(b.toString());

	}

}
