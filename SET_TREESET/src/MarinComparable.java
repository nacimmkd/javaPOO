import java.util.Objects;

public class MarinComparable extends Marin implements Comparable<MarinComparable>{
	
	public MarinComparable (String nom,String prenom, int age, double salaire) {
		super(nom,prenom,age,salaire);
	}
	
	@Override
    public int compareTo(MarinComparable autreMarin) {
        if (this.getSalaire() > autreMarin.getSalaire()) {
            return 1; 
        } else if (this.getSalaire() < autreMarin.getSalaire()) {
            return -1;   
        } else {
            return 0;  
        }
    }
	
	
}
