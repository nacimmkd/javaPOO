
public class EquipageCommande extends Equipage{
	private Capitaine commandant;
	
	public EquipageCommande (Capitaine capitaine) {
		super();
		this.commandant = capitaine;
	}
	
	public String getNomCommandant() {
		return commandant.getNom();
	}
	
	
	public String toString() {
		String s = "EquipageCommand{" ;
		s += super.toString() + "}";
		return s;
	}
}
