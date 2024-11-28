import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

	public static void main(String[] args) {
		
		//Creation de marins
		Marin m1 = new Marin("Louiba", "Said" , 23 , 790.0);
		Marin m2 = new Marin("Louiba", "Said", 23, 550.0);
		Marin m3 = new Marin("Khenous", "Mazigh" , 24 , 600.0);
		Marin m4 = new Marin("Saada", "Cirta", 20, 650.0);
		
		
		// List qui va contenir les marins
		HashSet<Marin> marins = new HashSet<Marin>();
		
		//Ajoute de marins a la list
		marins.add(m1);
		marins.add(m2);
		marins.add(m3);
		marins.add(m4);
		
		System.out.println("List Size : " + marins.size());
		
		// 1. Affichage avec toString()
		System.out.println(marins);		//marins.toString()
		
		
		System.out.println("------------------------------");
		
		// 2. Affichage avec foreach
		for (Marin marin : marins) {
			System.out.println(marin.toString());
		}
		
		
		System.out.println(" ---------------------------------");
		
		// 3. Affichage avec Iterator
		Iterator<Marin> marin = marins.iterator();  
		while (marin.hasNext()) {
			System.out.println(marin.next());
		}
	}

}
