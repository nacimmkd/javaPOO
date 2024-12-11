import java.util.ArrayList;

public class EnsembleDeDocuments {
	private ArrayList<Document> documents;

	public EnsembleDeDocuments() {
		documents = new ArrayList<Document>();
	}

	@Override
	public String toString() {
		String s = "Enselble de Documents dans la bibliotheques : \n";
		for (Document document : documents) {
			s += document.toString() + "\n";
		}
		return s;
	}

	public int getNombreDocuments() {
		return documents.size();
	}

	public void ajouter(Document document) {
		documents.add(document);
	}

	public Document getDocument(int numero) {
		Document doc = null;
		for (Document document : documents) {
			if (document.getNumero() == numero) {
				doc = document;
				break; 
			}
		}
		return doc;
	}

	public boolean supprimer(int numero) {
		for (Document document : documents) {
			if (document.getNumero() == numero) {
				documents.remove(getDocument(numero));
				return true;
			}
		}
		return false;
	}

	public boolean remplacer(int numero, Document autreDocument) {
		for (Document document : documents) {
			if (document.getNumero() == numero) {
				int index = documents.indexOf(document);
				documents.set(index, autreDocument);
				return true;
			}
		}
		return false;
	}

	public int getNombreLivres() {
		int n = 0;
		for (Document document : documents) {
			if (document instanceof Livre) {
				n++;
			}
		}
		return n;
	}

	public int getNombreDictionnaires() {
		int n = 0;
		for (Document document : documents) {
			if (document instanceof Dictionnaire) {
				n++;
			}
		}
		return n;
	}

	public String tousLesAuteurs() {
		String s = "Les Auteurs des livres qui existe dans la bibleioteque : [ ";
		for (Document document : documents) {
			s += document.toString() + " ";
		}
		s += "]";
		return s;
	}
	
	
	public ArrayList<Document> tousLesDicos() {
		ArrayList<Document> listDictionnaire = new ArrayList<Document>();
		for (Document document : documents) {
			if (document instanceof Dictionnaire) {
				listDictionnaire.add(document);
			}
		}
		return listDictionnaire;
	}
	
	
	/*
	public EnsembleDeDocuments tousLesDicos() {
		EnsembleDeDocuments ensembleDeDictionnaire = new EnsembleDeDocuments();
		for (Document document : documents) {
			if (document instanceof Dictionnaire) {
				ensembleDeDictionnaire.ajouter(document);
			}
		}
		return ensembleDeDictionnaire;
	}
	*/
	

}
