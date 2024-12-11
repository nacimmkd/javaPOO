
public class Fourgonnette extends Vehicule implements IVitesse{
	private int charge;

	public Fourgonnette(String immatriculation, int anneeAchat, int poids, int charge) {
		super(immatriculation, anneeAchat, poids);
		this.charge = charge;
	}
	public Fourgonnette(String immatriculation, int anneeAchat, int poids) {
		super(immatriculation, anneeAchat, poids);
		this.charge = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() +" (vitesseMax:"+ vitesseMaximale() +") -> Fourgonnette (charge:" + charge + ")";
	}
	@Override
	public int vitesseMaximale() {
		if (this.charge > 0 & this.charge <= 3) {
			return 100;
		}else {
			return 110;
		}
	}
	
	
	
	
	
	
	
	
	
}
