import java.util.Objects;

public abstract class Vehicule implements IVitesse{
	private String immatriculation;
	private int anneeAchat,poids;
	
	public Vehicule(String immatriculation, int anneeAchat, int poids) {
		this.immatriculation = immatriculation;
		this.anneeAchat = anneeAchat;
		this.poids = poids;
	}
	
	

	public String toString() {
		return "vehicule (anneeAchat:"+ immatriculation + ") (immat:" + anneeAchat + ")";
	}


	@Override
	public int hashCode() {
		return Objects.hash(anneeAchat, immatriculation, poids);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicule other = (Vehicule) obj;
		return anneeAchat == other.anneeAchat && Objects.equals(immatriculation, other.immatriculation)
				&& poids == other.poids;
	}
	
	
	
	
}
