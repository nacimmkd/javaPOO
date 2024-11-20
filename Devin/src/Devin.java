import java.util.Scanner;

public class Devin {
	
	
	
	public static void main(String[] args) {
		
		int nombreAleatoire = (int)(Math.random() * ((99) + 1));
		int maxEssai = 6 ; 
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			if (maxEssai > 0 ) {
				
			System.out.print("Veuillez saisir un nombre [0-99]: ");
			int entier = sc.nextInt();
			System.out.print("Vous avez saisi le nombre : " + entier);
			
			 
				if (entier >= 0 && entier <= 99) {
					
					if (entier > nombreAleatoire) {
						System.out.println(" -> Trop gros");
					} else if (entier < nombreAleatoire) {
						System.out.println(" -> Trop petit");
					} else {
						System.out.println(" -> Bravo Tonton .. ");
						break;
					}
					
				}else {
					System.out.println("le nombre doit etre entre 0 et 99");
				}
				
				maxEssai--;
				
			}else {
				System.out.println("Nombre d'essai maximum est dépassé .. jeu terminé");
				break;
			}
		}
		

	}

}
