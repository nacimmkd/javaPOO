import java.util.*;
public class Convoi extends Flotte{
	private Vehicule vehiculeDeTete; 
	public Convoi (Vehicule vehiculeDeTete) {
		super();
		this.vehiculeDeTete = vehiculeDeTete;
		super.ajouterVehicule(vehiculeDeTete);
	}
	
	public int vitesseConvoi() {
		int vitesseLow = flotte.get(0).vitesseMaximale();
		for (Vehicule vehicule : this.flotte) {
			/*if (vehicule.vitesseMaximale() < vitesseLow) {
				vitesseLow = vehicule.vitesseMaximale();
			}*/
			Math.min(vitesseLow, vehicule.vitesseMaximale());
		} 
			
		return vitesseLow;
	}
	
	public String toString() {
		return "Convoi : " + vehiculeDeTete.toString() + "\n" +  super.toString() + "vitesse du convoi: "+vitesseConvoi();
	}
	
}
