
import java.util.Random;

public class MatricePleine {
	private int hauteur,largeur;
	private int [][] mat;
	
	public MatricePleine(int hauteur, int largeur) {
		Random r = new Random();
		
		this.hauteur = hauteur;
		this.largeur = largeur;
		this.mat = new int[hauteur][largeur];
		
		for (int i = 0 ; i<hauteur ; i++) {
			for (int j=0; j<largeur ; j++) {
				mat[i][j] = r.nextInt(10);
			}
		}				
	}

	
	public void set(int x,int y,int valeur) {
		if (x <= hauteur && x>0 && y <= largeur && y > 0) {
			mat[x-1][y-1] = valeur; 
		}
	}
	
	public int get(int x, int y) {
		return mat[x][y];
		}

	public int getHauteur() {
		return hauteur;
	}


	public int getLargeur() {
		return largeur;
	}
	
	private int getNbNonNuls() {
		int nbValeurNull = 0;
		for (int i=0;i<hauteur;i++) {
			for (int j=0;j<largeur;j++) {
				if (mat[i][j] == 0) {
					nbValeurNull++;
				}
			}
		}
		return nbValeurNull;
	}
	
	
	public double getTauxRemplissage() {
		return 100 - (double)getNbNonNuls() / (hauteur*largeur) * 100.;
	}
	
	public MatricePleine addition (MatricePleine m) {
		int [][] nouvTab= new int [hauteur][largeur];
		MatricePleine nouvMat = new MatricePleine(hauteur,largeur);
		
		if (this.hauteur == m.hauteur && this.largeur == m.largeur) {
			for (int i=0 ; i< hauteur ; i++) {
				for (int j=0 ; j<largeur ; j++) {
					nouvMat.mat[i][j] = this.get(i, j) + m.get(i, j);
				}
			}
		} else {System.out.println("l'opération est impossible");}
		
		return nouvMat;
	}
	
	public MatricePleine transposee() {
		MatricePleine matTrans = new MatricePleine(hauteur,largeur);
		for (int i=0 ; i< hauteur ; i++) {
			for (int j=0 ; j<largeur ; j++) {
				matTrans.mat[i][j] = this.get(j, i);
			}
		}
		return matTrans;
	}
	
	public MatricePleine multiplication(MatricePleine m) {
		MatricePleine nouvMat = new MatricePleine(hauteur,largeur);
		if (this.largeur == m.hauteur) {
			for (int i = 0; i < this.hauteur; i++) {
		        for (int j = 0; j < m.largeur; j++) {
		            int somme = 0;
		            for (int k = 0; k < this.largeur; k++) {  
		                somme += this.mat[i][k] * m.mat[k][j];
		            }
		            nouvMat.mat[i][j] = somme;
		        }
		    }
		} else {System.out.println("l'opération est impossible");}
		return nouvMat;
	}
	
	@Override
	public String toString() {
		String mat = "\n";
		for (int i=0 ; i<hauteur ; i++) {
			for (int j=0; j<largeur ; j++) {
				mat = mat + get(i,j) + " "; 		
			}
			mat = mat + "\n";
		}
		return mat;
	}

		
	
}
