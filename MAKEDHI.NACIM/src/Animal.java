/* 	==> Code de la premiere question 
public class Animal{
	private String surnom;
	private double poids;
	
	public Animal (String surnom,double poids) {
		this.surnom = surnom;
		this.poids = poids;
	}

	public String getSurnom() {
		return surnom;
	}

	public double getPoids() {
		return poids;
	}
	

	public void setSurnom(String surnom) {
		this.surnom = surnom;
	}

	public void setPoids(double p) {
		this.poids = p;
	}

	@Override
	public String toString() {
		return "Animal :{surnom:" + surnom + ", poids:" + poids ;
	}
	
		
}

*/

// code utilisé par la suite 

public abstract class Animal implements vraiAnimal , Comparable<Animal>{
	private String surnom;
	private double poids;
	
	public Animal (String surnom,double poids) {
		this.surnom = surnom;
		this.poids = poids;
	}

	public String getSurnom() {
		return surnom;
	}

	public double getPoids() {
		return poids;
	}
	

	public void setPoids(double p) {
		this.poids = p;
	}

	@Override
	public String toString() {
		return "{surnom:" + surnom + ", poids:" + poids ;
	}
	

	@Override
	public int compareTo(Animal autreAnimal) {
		return -1*this.surnom.compareTo(autreAnimal.getSurnom());
	
	}
	
}