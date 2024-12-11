
public class Livre extends Document{
	private String auteur;
	private int nbPages;
	
	public Livre (String titre,String auteur,int nbPages) {
		super(titre);
		this.auteur = auteur;
		this.nbPages = nbPages;
	}
	
	public String toString() {
		return super.toString() + " => Livre [auteur = " + this.auteur + ", nombre de pages = "+this.nbPages;
	}
}
