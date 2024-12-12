import java.util.TreeSet;

public class Zoo {
	private TreeSet<Animal> zoo;

	public Zoo() {
		zoo = new TreeSet<Animal>();
		/*
		 pour le test de Etape4 Comparator
		 zoo = new TreeSet<Animal>(new comparerParPoidsPuisParSurnom());
		  */
		 
	}


	public void ajouterAnimal(Animal animal) {
		zoo.add(animal);   // si pas demander de vérifier si l'animal existe ou pas dans zoo
	}

	public int compterParEspece(String espece) {
		int nombreEspece = 0;
		for (Animal animal : zoo) {
			if (animal.getEspece().equals(espece)) {  
				nombreEspece++;
			}
		}
		return nombreEspece;
	}


	public Animal quelEstLanimalLePlusGros() {
		if (zoo.size() < 1) {
			return null;
		
		}else {
			Animal grosAnimal = null ;
			double p = 0.;
			for(Animal animal : zoo) {
				if (animal.getPoids() > p) {
					grosAnimal = animal;
					p = animal.getPoids();
				}
			}
			return grosAnimal;
		}
		
	}
	
	
	public double poidsMedian() {
		if (zoo.size() < 1) {
			return 0.;
		}else {
			double poidsTotal = 0. ;
			for (Animal animal : zoo ) {
				poidsTotal += animal.getPoids();
			}
			return poidsTotal / zoo.size();
		}
	}
	
	public String tousLesAnimauxMangent() {
		String s = "";
		for (Animal animal : zoo) {
			s += animal.toString() + animal.manger() + "\n";
		}
		return s;
	}
	


	public String toString() {
		String s = "Zoo ---> \n";
		for (Animal animal : zoo) {
			s += animal.toString() + "\n";
		}
		return s;
	}
}
