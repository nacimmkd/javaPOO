import java.util.Comparator;

public class comparerParPoidsPuisParSurnom implements Comparator<Animal>{

	@Override
	public int compare(Animal o1, Animal o2) {
		int parPoids = -1 * Double.compare(o1.getPoids(), o2.getPoids());
		if (parPoids != 0) {
			return parPoids;
		}
		
		return o1.getSurnom().compareTo(o2.getSurnom());
	}

}
