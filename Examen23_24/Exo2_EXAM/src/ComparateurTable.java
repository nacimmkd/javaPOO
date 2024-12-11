import java.util.Comparator;

public class ComparateurTable implements Comparator<Table>{

	@Override
	public int compare(Table o1, Table o2) {
		
		int ordre = Double.compare(o2.getCapacite(), o1.getCapacite());
		if (ordre != 0) {
			return ordre;
		}
		
		
		return o1.getCouleur().compareTo(o2.getCouleur());
	}

}
