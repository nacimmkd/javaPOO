
public class PolynomeMain {

	public static void main(String[] args) {
		
		
		Polynome pol1 = new Polynome(1.0 , 2);
		Polynome pol2 = new Polynome(1.0 , 1);
		
		System.out.print(" P1(x) = ");
		System.out.println(pol1.toString());
		
		System.out.print("\n P2(x) = ");
		System.out.println(pol1.toString());
		
		System.out.print("\n Dereve de P1(x) : P'1(x) = ");
		System.out.println(pol1.derivee());
		
		
		System.out.println("\n Pour x = 2 , P(2) = " + pol1.valeur(2));
		
		System.out.print("\n Addition de P1(x) et P2(x) : P3(x) = ");
		System.out.println( (pol1.Plus(pol2)));
		
		
		

	}

}
