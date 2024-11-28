
public class BateauARames extends Bateau implements IPropulsion{
	public BateauARames (String nom,int tonnage,EquipageCommande equipage) {
		super (nom,tonnage,equipage);
	}

	@Override
	public String getPropulsion() {
		return "rames";
	}
	
	@Override
	public String toString() {
		return super.toString() + ",Propulsion : " + getPropulsion(); 
	}
}
