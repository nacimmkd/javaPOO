
public class TestMain {

	public static void main(String[] args) {
		Fourgonnette f1 = new Fourgonnette("LA 2L2 KA", 2020, 2,2);
		Fourgonnette f2 = new Fourgonnette("LA 2L2 KA", 2020, 2,2);
		Camion m1 = new Camion("TA 2LN BA", 2000, 5,4);
		Camion m2 = new Camion("NA CIM 01", 2001, 5,5);
		Convoi c = new Convoi(m2);
		
		Flotte flotte = new Flotte();
		c.ajouterVehicule(f1);
		c.ajouterVehicule(f2);
		c.ajouterVehicule(m1);
		
		System.out.println(c.toString());
		
		//System.out.println(m1.toString());
		//System.out.println(f1.toString());

	}

}
