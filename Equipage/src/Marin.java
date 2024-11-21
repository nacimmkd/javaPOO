import java.util.Objects;

public class Marin {
	private String nom;
	private String prenom;
	private int age;
	private double salaire;
	
	public Marin(String nom, String prenom, int age, double salaire) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.salaire = salaire;
	}
	
	public Marin(String nom,double salaire) {
		this(nom,"",0,salaire);		
	}
	
	public Marin(String nom,String prenom,int age) {
		this(nom,prenom,age,0.0);
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}

	public double getSalaire() {
		return salaire;
	}
	
	public void vieillir() {
		this.age++;
	}
	
	public void augmenterSalaire(double p) { // ex : 20 %
		this.salaire += salaire * p/100;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, nom, prenom, salaire);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marin other = (Marin) obj;
		return age == other.age && Objects.equals(nom, other.nom) && Objects.equals(prenom, other.prenom)
				&& Double.doubleToLongBits(salaire) == Double.doubleToLongBits(other.salaire);
	}

	@Override
	public String toString(){
		return "Marin{n:'" + this.nom + "',p:'" + this.prenom
				+ "',a: " + this.age + " ,s: " + this.salaire + " }";
	}
	
}
