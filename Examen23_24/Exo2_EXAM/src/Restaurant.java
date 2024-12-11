import java.util.TreeSet;

public class Restaurant extends ComparateurTable{
	private TreeSet<Table> tables;
	
	public Restaurant() {
		ComparateurTable comparateur = new ComparateurTable();
		tables = new TreeSet<Table>(comparateur);	
	}
	
	public void addTable(String c, int capacite) {
		tables.add(new Table(c,capacite));
	}

	@Override
	public String toString() {
		return "Restaurant [tables=" + tables + "]";
	}
	
	
}
