
public class MainMatricePleine {

	public static void main(String[] args) {
		MatricePleine matA = new MatricePleine(3,3);
		MatricePleine matB = new MatricePleine(3,3);
		
		matA.set(1, 1, 0);
        matA.set(1, 2, 0);
        matA.set(1, 3, 0);
        matA.set(2, 1, 5);
        matA.set(2, 2, 8);
        matA.set(2, 3, 0);
        matA.set(3, 1, 2);
        matA.set(3, 2, 0);
        matA.set(3, 3, 9);
		
		System.out.println(" => Matrice A : "+matA.toString() );
		System.out.println(" => Matrice B : "+matB.toString() );

	
		System.out.println(" => Le Taux de Remplissage de matrice A : "+ matA.getTauxRemplissage()+" % \n");
		
		System.out.println(" => A + B = \n" +matA.addition(matB).toString() );
		
		System.out.println(" => A Transpos = \n" +matA.transposee().toString() );
		
		System.out.println(" => A * B = \n " + matA.multiplication(matB).toString());
		
		
		int[][] matriceCreuseA = matA.mlatriceCreuse();
		System.out.println(" => Matrice Creuse de A : ");
		for (int[] t : matriceCreuseA) {
		    System.out.println("[" + t[0] + ", " + t[1] + "] = " + t[2]);
		}
	
	
	}


}
