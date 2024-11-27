
import java.util.List;
import java.util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class Equipage {
	private List<Marin> marins; 

	public Equipage() {
		marins = new ArrayList<Marin>();

	}

	public int getNombreMarins() {
		return marins.size();
	}

	public boolean isMarinPresent(Marin m) {		
		if (marins.contains(m)) {
			return true;
		}				
		return false;
	}

	public boolean addMarin(Marin m) {
		if (!isMarinPresent(m)) {
			marins.add(m);
			return true;
		}else {
			return false;
		}

	}

	public boolean removeMarin(Marin m) {
		if (isMarinPresent(m)) {
			marins.remove(m);
			return true;
		}else {
			return false;
		}
	}

	public void clear() {
		marins.clear();

	}

	public List<Marin> getEquipage() {
		List<Marin> copie = new ArrayList<Marin>();
		for (Marin marin : marins) {
			copie.add(marin);
		}		
		return copie;
	}	


	public boolean addAllEquipage(Equipage autreEquipe) {
		for (Marin marin : autreEquipe.getEquipage()) {
			if (isMarinPresent(marin)) {
				return false;
			}
		}
		for (Marin marin : autreEquipe.getEquipage()) {
			marins.add(marin);
		}

		return true;

	}

	public Marin getMarinByName(String nom) {
		for (Marin marin : marins) {
			if (marin.getNom() == nom) {
				return marin;
			}
		}
		return null;
	}

	public void augmenterSalaire(double p) {
		for (Marin marin : marins) {
			marin.augmenterSalaire(p);
		}
	}

	public double getMaxSalaire() {
		if (!marins.isEmpty()) {
			double maxSalaire = 0;
			for (Marin marin : marins) {
				if (marin.getSalaire() > maxSalaire) {
					maxSalaire = marin.getSalaire();
				}
			}
			return maxSalaire;
		}
		return 0.0;
	}
	
	public double getMoyenneSalaire() {
		if (!marins.isEmpty()) {
			double moyenne = 0;
			for (Marin marin : marins) {
				moyenne += marin.getSalaire() / getNombreMarins();
			}
			return moyenne;
		}
		return 0.0;		
	}
	
	public double getMedianeSalaire() {
		
		Double[] salaires = new Double[marins.size()];
		for (int i=0;i<marins.size();i++) {
			salaires[i] = marins.get(i).getSalaire();
		}
		Arrays.sort(salaires); // de plus petit au plus grand
		
		int n = salaires.length;
		if (n % 2 == 0) { // mdiane est la moyenne des 2 elements au milieu
			return (salaires[n / 2 - 1] + salaires[n / 2]) / 2.0;
		}else { // mediane est l'element au milieu.
			return salaires[n / 2];
		}
		
	}



	@Override
	public String toString() {
		String n = "";
		for (Marin marin : marins) {
			n += marin.toString() + ";";
		}
		return n;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marins);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipage autre = (Equipage) obj;
		return marins.containsAll(autre.marins); 
	}
	
	





}
