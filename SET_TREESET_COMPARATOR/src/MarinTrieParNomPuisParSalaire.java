import java.util.Comparator;

public class MarinTrieParNomPuisParSalaire implements Comparator<Marin>{

	//cette methode utilise pour trier par nom puis age puis salaire
	@Override
	public int compare(Marin o1, Marin o2) {
		
		// cette structure pour comparer type String
		
		int comparedNom = o1.getNom().compareTo(o2.getNom());
		if (comparedNom != 0) {
			return comparedNom ;
		}
		
		// cette structeur pour comparer type int double
		int comparedAge = Double.compare(o1.getAge(), o2.getAge());
		if (comparedAge != 0) {
			return comparedAge ;
		}
		return Double.compare(o1.getSalaire(), o2.getSalaire());
	}

	
	


	
}
