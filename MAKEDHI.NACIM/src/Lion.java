
public class Lion extends Animal implements vraiAnimal{

	public Lion(String surnom,double poids) {
		super(surnom,poids);
	}

	@Override
	public String manger() {
		return "mange de viande";
	}

	@Override
	public String crier() {
		return "rugit";
	}

	@Override
	public void grossir() {
		double newPoid = super.getPoids() + super.getPoids() * 0.03;
		setPoids(newPoid);
	}

	@Override
	public String getEspece() {
		return "lion";
	}
	
	@Override
	public String toString() {
		return super.toString() + ",espace:" + getEspece() +"}";
	}

	




}
