
public class MainZoo{

	public static void main(String[] args) {
		
		/*
		Lion a = new Lion("chat", 2.);
		Elephant b = new Elephant("alex", 2.,Origine.AFRIQUE);
		
		System.out.println(a.toString());
		*/
		
		Zoo zoo = new Zoo();
		
		// creation 4 animaux
		Lion l1 = new Lion("Dumbo", 100.);
		Lion l2 = new Lion("kesdos", 100.);
		Lion l3 = new Lion("Asdos", 100.);
		Elephant e1 = new Elephant("elif", 100., Origine.AFRIQUE); 
		
		
		zoo.ajouterAnimal(l1);
		zoo.ajouterAnimal(l2);
		zoo.ajouterAnimal(l3);
		zoo.ajouterAnimal(e1);
		
		System.out.println(zoo.toString());
		
		l1.grossir();
		l1.grossir();
		e1.grossir();
		
		System.out.println(zoo.toString());
		
		Animal g = zoo.quelEstLanimalLePlusGros();
		System.out.println(g.toString());
		
		
		ZooRestrictif zr = new ZooRestrictif();
		zr.ajouterEspece("lion", 3);
		zr.ajouterEspece("lion", 3);
		
		System.out.println(zr.toString());
		
	
	}

}
