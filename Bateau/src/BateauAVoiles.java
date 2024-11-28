
public class BateauAVoiles extends Bateau implements IPropulsion{

	public BateauAVoiles(String nom, int tonnage, EquipageCommande equipage) {
		super(nom, tonnage, equipage);
	}

	@Override
	public String getPropulsion() {
		return "voiles";
	}
	
	@Override
	public String toString() {
		return super.toString() + ",Propulsion : " + getPropulsion(); 
	}

}
