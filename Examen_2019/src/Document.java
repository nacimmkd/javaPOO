
public abstract class Document {
	
	private final String titre;
	private static int indice = 1; // indice est static car on veut qu'il s'incrimente a chaque creation de l'objet document
	private int numero;
	
	public Document (String titre) {
		this.titre = titre;
		this.numero = indice;
		indice++;
	}
	
	public Document (String titre,int numero) {
		this.titre = titre;
		if (numero <= indice) {
			this.numero = indice;
			indice++;
		}else {
			this.numero = numero;	
		}		
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public String getTitre() {
		return this.titre;
	}

	@Override
	public String toString() {
		return "Document [titre = " + titre + ", numero = " + numero + "]";
	}
	
	
}
