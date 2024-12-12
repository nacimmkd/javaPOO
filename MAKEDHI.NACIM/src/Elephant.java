
public class Elephant extends Animal implements vraiAnimal{
	
	private Origine origine;
	
	public Elephant(String surnom, double poids,Origine origine) {
		super(surnom, poids);
		this.origine = origine; 
	}

	@Override
	public String manger() {
		return " mange des feuilles";
	}

	@Override
	public String crier() {
		return "barrit";
	}

	@Override
	public void grossir() {
		double newPoid = super.getPoids() + (super.getPoids() * 0.07);
		setPoids(newPoid);
		
	}

	@Override
	public String getEspece() {
		return "elephant";
	}

	@Override
	public String toString() {
		return super.toString() + ",espace:" + getEspece() + "} [origine" + origine + "]";
	}
	
	
	
	

}
