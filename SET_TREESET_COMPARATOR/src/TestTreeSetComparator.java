import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetComparator {

	public static void main(String[] args) {
		
		MarinTrieParNomPuisParSalaire comparateur = new MarinTrieParNomPuisParSalaire();
		Comparator<Marin> comparateurInverse = new MarinTrieParNomPuisParSalaire().reversed();
		
		// Cr�ation d'un TreeSet de MarinComparable
        TreeSet<Marin> marins = new TreeSet<Marin>(comparateur);

        // Cr�ation des marins avec des parametres : nom, prenom, age, salaire
        Marin m1 = new Marin("Louiba", "Said", 21, 790.0);
        Marin m2 = new Marin("Khenous", "Mazigh", 24, 600.0);
        Marin m3 = new Marin("Saada", "Cirta", 20, 650.0);
        Marin m4 = new Marin("Lallaloui", "Massi", 22, 800.0);
        Marin m5 = new Marin("Louiba", "Said", 23, 780.0);
        // Ajouter les marins dans le TreeSet
        marins.add(m1);
        marins.add(m2);
        marins.add(m3);
        marins.add(m4);
        marins.add(m5);
        

        // Affichage des salaires des marins tries par salaire descendant
        for (Marin marin : marins) {
            System.out.println(marin.toString());
        }
        

	}

}
