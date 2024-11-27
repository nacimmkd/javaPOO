import java.util.Objects;

public class Capitaine extends Marin {
	private Grade grade;
	
	public Capitaine (String nom, String prenom, int age, double salaire,Grade grade) {
		super(nom,prenom,age,salaire);
		this.grade = grade;
		
	}
	
	public Grade getGrade() {
		return grade;
	}
	// a completer
	public String toString() {
		return super.toString() +"->" + grade; 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(grade);
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
		Capitaine other = (Capitaine) obj;
		return grade == other.grade;
	}
	
	
	
	
}