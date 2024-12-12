import java.util.TreeSet;

public class TestTreeSetComparable {

    public static void main(String[] args) {
        // Cr�ation d'un TreeSet de MarinComparable
        TreeSet<Marin> marins = new TreeSet<Marin>();

        // Cr�ation des marins avec des param�tres : nom, pr�nom, �ge, salaire
        Marin m1 = new Marin("Louiba", "Said", 23, 790.0);
        Marin m2 = new Marin("Khenous", "Mazigh", 24, 600.0);
        Marin m3 = new Marin("Saada", "Cirta", 20, 650.0);
        Marin m4 = new Marin("Lallaloui", "Massi", 20, 800.0);

        // Ajouter les marins dans le TreeSet
        marins.add(m1);
        marins.add(m2);
        marins.add(m3);
        marins.add(m4);
        

        // Affichage des salaires des marins tri�s par salaire descendant
        for (Marin marin : marins) {
            System.out.println(marin.toString());
        }
        
    }
}
 