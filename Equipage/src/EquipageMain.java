import java.util.*;

public class EquipageMain {

	public static void main(String[] args) {
		
		Marin m1 = new Marin("Khenous", "Mazigh" , 23, 790.0);
		Marin m2 = new Marin("Louiba","Said",22,550.0);
		Marin m3 = new Marin("Lallaoui","Massi",24,620.0);
		Marin m4 = new Marin("Saadoudi", "Lydia", 20);
		
		Equipage equipe = new Equipage();
		
		System.out.println(m1.getPrenom() +" est ajouté a l'equipage : " +equipe.addMarin(m1));
		System.out.println(m2.getPrenom() +" est ajouté a l'equipage : " +equipe.addMarin(m2));
		System.out.println(m3.getPrenom() +" est ajouté a l'equipage : " +equipe.addMarin(m3));
		
		System.out.println("Nombre d'equipage : " + equipe.getNombreMarins());
		System.out.println("Marin m1 {"+m1.getPrenom()+"} est un membre de l'equipage : " + equipe.isMarinPresent(m1));
		
		System.out.println(m3.getPrenom() +" est supprimé de l'equipage : " +equipe.removeMarin(m3));
		System.out.println("Nombre d'equipage : " + equipe.getNombreMarins());
		System.out.println(equipe.toString());
		System.out.println();
		
		equipe.clear();
		
		// une autre equipe pour tester
		Equipage autreEquipe = new Equipage();
		autreEquipe.addMarin(m1);
		autreEquipe.addMarin(m2);
		autreEquipe.addMarin(m3);
		
		equipe.addAllEquipage(autreEquipe);
		
		System.out.println("----------------------");
		System.out.println("Nombre d'equipage : " + equipe.getNombreMarins());
		System.out.println(equipe.toString());
		
		System.out.println("Le salaire de marin le mieux paye : "+equipe.getMaxSalaire());
		System.out.println("La moyenne des salaires : "+equipe.getMoyenneSalaire());
		
		//Marin m5 = equipe.getMarinByName("Louiba");
		//System.out.println("Le salaire de "+m5.getPrenom() + " est : " + m5.getSalaire());
	
		System.out.println("----------------------\n");
		
		Equipage equipe1 = new Equipage();
		equipe1.addMarin(m3);
		equipe1.addMarin(m2);
		equipe1.addMarin(m1);
		System.out.println(equipe.toString());
		System.out.println(equipe1.toString());
		System.out.println("Les 2 Equipes possedes les memes marins : "+equipe.equals(equipe1));
	}

}
