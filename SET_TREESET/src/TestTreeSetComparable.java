import java.util.TreeSet;

public class TestTreeSetComparable {

    public static void main(String[] args) {
        // Cr�ation d'un TreeSet de MarinComparable
        TreeSet<MarinComparable> marins = new TreeSet<MarinComparable>();

        // Cr�ation des marins avec des param�tres : nom, pr�nom, �ge, salaire
        MarinComparable m1 = new MarinComparable("Louiba", "Said", 23, 790.0);
        MarinComparable m2 = new MarinComparable("Khenous", "Mazigh", 24, 600.0);
        MarinComparable m3 = new MarinComparable("Saada", "Cirta", 20, 650.0);
        MarinComparable m4 = new MarinComparable("Lallaloui", "Massi", 20, 800.0);

        // Ajouter les marins dans le TreeSet
        marins.add(m1);
        marins.add(m2);
        marins.add(m3);
        marins.add(m4);
        

        // Affichage des salaires des marins tri�s par salaire descendant
        for (MarinComparable marin : marins) {
            System.out.println(marin.toString());
        }
        
    }
}
 