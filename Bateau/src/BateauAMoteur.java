
public class BateauAMoteur extends Bateau implements IPropulsion{

	public BateauAMoteur(String nom, int tonnage, EquipageCommande equipage) {
		super(nom, tonnage, equipage);
	}

	@Override
	public String getPropulsion() {
		return "moteur";
	}
	
	@Override
	public String toString() {
		return super.toString() + ",Propulsion : " + getPropulsion(); 
	}

}
