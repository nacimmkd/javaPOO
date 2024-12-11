
public class Bus extends Vehicule implements IVitesse{
	private int passagers;

	public Bus(String immatriculation, int anneeAchat, int poids, int passagers) {
		super(immatriculation, anneeAchat, poids);
		this.passagers = passagers;
	}
	
	public Bus(String immatriculation, int anneeAchat, int poids) {
		super(immatriculation, anneeAchat, poids);
		this.passagers = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Bus (Passagers:" + passagers + ")";
	}

	@Override
	public int vitesseMaximale() {
		return 200;
	}
	
	
}
