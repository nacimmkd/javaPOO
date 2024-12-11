import java.util.*;

public class Flotte {
	protected List<Vehicule> flotte ;
	
	public Flotte() {
		flotte = new ArrayList<Vehicule>();
	}
	
	public void ajouterVehicule(Vehicule v) {
		if (!flotte.contains(v)) {
			flotte.add(v);
		}
	
	}
	
	public String toString() {
		String s = "Flotte de " + flotte.size() + " vehecules \n";

		for (Vehicule vehicule : flotte) {
			s += vehicule.toString() + "\n";
		} 
		/*
		Iterator it = flotte.iterator();
		while (it.hasNext()) {
			s += it.next() + "\n";
		} */
		return s;
	}
}
