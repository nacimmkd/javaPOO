package EXO4;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(langue, nbTomes);
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
		Dictionnaire other = (Dictionnaire) obj;
		return langue == other.langue && nbTomes == other.nbTomes;
	}

	
	
	
	
}
