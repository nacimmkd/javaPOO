
public class Dictionnaire extends Document{
	private Langues langue;
	private int nbTomes;
	
	public Dictionnaire(String titre,int nbTomes,Langues langue) {
		super(titre);
		this.langue = langue;
		this.nbTomes = nbTomes;
	}
	
	public String toString() {
		return super.toString() + " => Dictionnaire [langue = " + this.langue + ", nombre de tomes = "+this.nbTomes;
	}
	
}
