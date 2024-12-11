
public class Camion extends Vehicule implements IVitesse{
	private int charge;

	public Camion(String immatriculation, int anneeAchat, int poids, int charge) {
		super(immatriculation, anneeAchat, poids);
		this.charge = charge;
	}
	
	public Camion(String immatriculation, int anneeAchat, int poids) {
		super(immatriculation, anneeAchat, poids);
		this.charge = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() +" (vitesseMax:"+ vitesseMaximale() +") -> Camion (charge:" + this.charge + ")";
	}
	
	@Override
	public int vitesseMaximale() {
		if (charge > 0 & charge <= 3) {
			return 90;
		}else if (charge > 3 & charge <= 6) { 
			return 80;
		}else {
			return 110;
		}
	}
}
