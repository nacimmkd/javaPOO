
public class EquipageCommandeMain {

	public static void main(String[] args) {
		
		Capitaine c1 = new Capitaine("Louiba", "Said", 23, 550.0, Grade.CAPITAINE);
		Marin m1 = new Capitaine("Sadoudi","Lydia",23,750.0,Grade.BOSCO);
		
		EquipageCommande equipeCommande = new EquipageCommande(c1);
		
		
		
		equipeCommande.addMarin(m1);
		equipeCommande.addMarin(c1);
		System.out.println(equipeCommande.toString());

	}

}
