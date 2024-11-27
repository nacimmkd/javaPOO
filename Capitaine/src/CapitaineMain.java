
public class CapitaineMain {
	public static void main(String[] args) {
		Equipage equipe = new Equipage();
		
		Capitaine c1 = new Capitaine("Louiba", "Said", 23, 550.0, Grade.CAPITAINE);
		Marin m1 = new Capitaine("Sadoudi","Lydia",23,750.0,Grade.BOSCO);
		
		equipe.addMarin(c1);
		equipe.addMarin(m1);
		
		System.out.println(equipe.toString());
	}
}
