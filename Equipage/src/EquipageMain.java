
public class EquipageMain {

	public static void main(String[] args) {
		
		Marin m1 = new Marin("mazigh", "Khenous" , 23, 790.0);
		Marin m2 = new Marin("Said","Louiba",22,550.0);
		Marin m3 = new Marin("Massi","Lallaoui",24,620.0);
		
		Equipage equipe = new Equipage();
		
		
		System.out.println("Ajoute de "+ m1.getPrenom() +" à l'équipage : " +equipe.addMarin(m1));
		System.out.println("Ajoute de "+ m2.getPrenom() +" à l'équipage : " +equipe.addMarin(m2));
		System.out.println("Ajoute de "+ m3.getPrenom() +" à l'équipage : " +equipe.addMarin(m3));
		
		System.out.println("Nombre d'équipage : " + equipe.getNombreMarins());
		System.out.println("Marin m1 {Mazigh Khennous} un nombre parmi l'équipage : " + equipe.isMarinPresent(m1));
		System.out.println(equipe.toString());
		
		System.out.println("Suppression de "+ m3.getPrenom() +" de l'équipage : " +equipe.removeMarin(m3));
		System.out.println("Nombre d'équipage : " + equipe.getNombreMarins());
		System.out.println(equipe.toString());
		sys
	
	}

}
