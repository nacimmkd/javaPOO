
public class Taxi extends Vehicule implements IVitesse{
	private int passagers;
	
	public Taxi(String immatriculation, int anneeAchat, int poids, int passagers) {
		super(immatriculation, anneeAchat, poids);
		this.passagers = passagers;
	}
	
	public Taxi(String immatriculation, int anneeAchat, int poids) {
		super(immatriculation, anneeAchat, poids);
		this.passagers = 0;
	}
	
	@Override
	public String toString() {
		return super.toString() + " -> Taxi (Passagers:" + passagers + ")";
	}

	@Override
	public int vitesseMaximale() {
		// TODO Auto-generated method stub
		return 200;
	}
	
}
