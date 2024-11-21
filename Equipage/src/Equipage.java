
import java.util.List;
import java.util.ArrayList;


public class Equipage {
	private List<Marin> marins; 
	
	public Equipage() {
		marins = new ArrayList<Marin>();
				
	}
	
	public List<Marin> getMarins() {
		return marins;
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
	
	
	// question 10 a change parceque j ai creer la methode getMarins alors que c pas demandé vaut mieux utiliser q 9
	public boolean addAllEquipage(Equipage autreEquipe) {
		for (Marin marin : autreEquipe.getMarins()) {
			if (isMarinPresent(marin)) {
				return false;
			}
		}
		
		for (Marin marin : autreEquipe.getMarins()) {
			marins.add(marin);
			return true;
		}
		
		return false;
		
	}
	
	
	@Override
	public String toString() {
		String n = "Equipage:";
		for (Marin marin : marins) {
			n += marin.toString() + ";";
		}
		return n;
	}
	
	
	
	
	
}
