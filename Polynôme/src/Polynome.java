
public class Polynome {
	private static final int MAX_COEFF = 8;
	private double[] coefficients;
	
	public Polynome () {
		this.coefficients = new double[MAX_COEFF + 1];
	}
	
	
	public Polynome(double coef,int degre) {
		this();
		coefficients[degre] = coef;
	}
	
	public Polynome(double coef) {
		this(coef,0);
	}
	
	public double valeur(double x) {
		double result = 0;
        for (int i = 0; i <= MAX_COEFF; i++) {
            result += coefficients[i] * Math.pow(x, i); 
        }
        return result;
	}
	
	public Polynome Plus(Polynome p) {
		double[] nouveauCoef = new double[MAX_COEFF + 1 ];
		for (int i = 0; i <= MAX_COEFF; i++) {
			nouveauCoef[i] = this.coefficients[i] + p.coefficients[i]; 
        }
		
		 
		Polynome result = new Polynome();
        result.coefficients = nouveauCoef; 
        return result;
	}
	
	
	 
	public Polynome derivee() {
		double[] coefDereve = new double[MAX_COEFF + 1];
		for (int i=1 ; i <= MAX_COEFF ; i++) {	
			coefDereve[i-1] = this.coefficients[i]*i;	
		}
		
		Polynome polDereve = new Polynome();
		polDereve.coefficients = coefDereve;
		return polDereve;
	}
	
	
	
	
	public String toString() {
		String pol = null;
		int i,n = 0;
		
		
		
		for (i = MAX_COEFF; i > 0 ; i--) {
			if (this.coefficients[i] != 0.) {
				pol =  this.coefficients[i] + "*x^"+ i--  ;
				break;
			} 	
		
		}
		
		for ( ;  i > 0 ; i--) {
			if (this.coefficients[i] > 0.) {
				pol = pol + '+' + this.coefficients[i] + "*x^"+ i  ;
				
			}else if (this.coefficients[i] < 0.) {
				pol = pol +  this.coefficients[i] + "*x^"+ i  ;
			} 
		
		}
		
		if (this.coefficients[0] > 0.) {
			if (pol == null ) {
				pol = ((Double)(this.coefficients[0])).toString()  ;
				}else 
			pol = pol + '+' + this.coefficients[i] ;
			
		}else if (this.coefficients[0] < 0.) {
			pol = pol +  this.coefficients[i] ;
		} 
		
		
		
		return pol;
	}
	
}
