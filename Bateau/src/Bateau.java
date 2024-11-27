import java.util.Objects;

public class Bateau {
	private String nom;
	private int tonnage;
	private EquipageCommande equipage;
	
	public Bateau (String nom,int tonnage, EquipageCommande equipage) {
		this.nom = nom;
		this.tonnage = tonnage;
		this.equipage = equipage;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getTonnage() {
		return this.tonnage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bateau other = (Bateau) obj;
		return Objects.equals(nom, other.nom);
	}
	
	// A completer
	
	@Override
	public String toString() {
		return "Bateau [nom:" + nom + ",tonnage:"+tonnage + "," 
				+ equipage.getNomCommandant() + ",membres de l'equipage:"
				+ equipage.getEquipage() + "]";
	}
	
}
