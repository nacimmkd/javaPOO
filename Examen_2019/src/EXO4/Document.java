package EXO4;

import java.util.Objects;

public abstract class Document {
	
	private final String titre;
	
	public Document (String titre) {
		this.titre = titre;
		
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(titre);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Document other = (Document) obj;
		return Objects.equals(titre, other.titre);
	}



	public String getTitre() {
		return this.titre;
	}

	@Override
	public String toString() {
		return "Document [titre = " + titre + "]";
	}
	
	
}
