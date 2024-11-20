import java.lang.Math;


public class PI {

	public static void main(String[] args) {
		//System.out.println(Math.PI); 
		//Pi/4 = (1 – 1/3 + 1/5 – 1/7 + 1/9 - …
		
		
		
		double PI_calcule = 0;
		double sign = 1.;
		
		for (double i=1 ; i<= 1000 ; i+=2) {
			PI_calcule += sign/i;
			sign=-sign;
		}
		

		
		System.out.println(" PI/4 Calculer : "+ PI_calcule*4) ;
		System.out.println("PI/4 en MATH : "+ Math.PI);
		// Comparison
		System.out.print(" L'erreur : ");
		double err =  Math.PI - PI_calcule*4;
		System.out.print(err);
		
		
		

	}

}


/*
double PI_calcule = 0;
boolean changeSign = true;

for (int i=1 ; i<= 1000 ; i+=2) {
	if (changeSign) {
		PI_calcule = PI_calcule + 1./i;
		changeSign=!changeSign;
	}else {
		PI_calcule = PI_calcule - 1./i;
		changeSign=!changeSign;
	}
	
	
}	

*/
