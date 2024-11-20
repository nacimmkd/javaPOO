
import java.util.List;
import java.util.ArrayList;


public class Equipage {
	List<Marin> marins;
	
	public Equipage() {
		marins = new ArrayList<Marin>();
	}
	
	public int getNombreMarins() {
		return marins.size();
	}
	
	public boolean isMarinPresent (Marin m) {		
		if (marins.contains(m)) {
			return true;
		}			
		
		return false;
	}
	
	
	
	
	
}
