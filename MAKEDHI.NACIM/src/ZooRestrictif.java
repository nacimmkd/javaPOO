import java.util.HashMap;

public class ZooRestrictif extends Zoo{
	private HashMap<String,Integer> placesMax;
	
	public ZooRestrictif( ) {
		super();
		placesMax = new HashMap<String,Integer>(); 
		
	}
	
	public String toString() {
		String s = super.toString() + "\n";
		s += "Restrictions : {elephant=" + placesMax.get(0) + ", lion=" + placesMax.get(1) + "}"; 
		return s;
	}
	
	public void ajouterEspece(String espece,int n) {
		placesMax.put(espece, n);
	}
	
	
	
	

}
