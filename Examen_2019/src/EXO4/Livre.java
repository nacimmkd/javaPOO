package EXO4;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(auteur);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livre other = (Livre) obj;
		return Objects.equals(auteur, other.auteur);
	}

	
	
	
}
