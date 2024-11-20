
public class ClassementV1 {

	public static void main(String[] args) {
		 int tab[] = { 3, 4 , 17, 6, 9, 44, 22 } ;
		 int tab_mod[] = new int [tab.length];
		 int j = 0;
		 int nombreImpairs = 0;
		 
		 // remplir les nombres impaires
		 for (int i=0 ; i < tab.length ; i++) {
			 if (tab[i] % 2 != 0) {
				 tab_mod[j] = tab[i];
				 nombreImpairs += 1;
				 j+=1;
			 }	  
		 }
		 
		// Remplir les nombres paires
		 for (int i=0 ; i < tab.length ; i++) {
			 if (tab[i] % 2 == 0) {
				 tab_mod[j] = tab[i];
				 j+=1;
			 }
		 }
		 
		 // Nombre de termes impaires
		 System.out.println(nombreImpairs);
		 
		 
		 // Affichage de new table
		 for (int k=0; k < tab_mod.length ; k++) {
			 System.out.print(tab_mod[k]);
			 System.out.print(" ");
		 }

	}

}
