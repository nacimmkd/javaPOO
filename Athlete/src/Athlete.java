
public class Athlete {
	private static int cptDossard = 1;
	private int dossard;
	private boolean temoin;
	private Athlete suivant;
	
	public Athlete () {
		this.dossard = cptDossard;
		this.temoin = false;
		this.suivant = null ;
		cptDossard++;
	}

	@Override
	public String toString() {
		return "Athlete [dossard:" + this.dossard + " , temoin:" + this.aLeTemoin() +"]";
	}
	
	public void prendLeTemoin() {
		if (!this.temoin) {
            this.temoin = true; 
            if (this.suivant != null) {
            	this.passeLeTemoinA(this.suivant);
            }
        }
		
	}
	
	public void rendLeTemoin() {
		this.temoin = false;
	}
	
	public boolean aLeTemoin() {
		return this.temoin;
	}
	
	// je vais la completer aprés si necessaire
	public void passeLeTemoinA (Athlete a) {
		if (this.temoin && !a.aLeTemoin()) {
			a.prendLeTemoin();
			this.temoin = false;
		}
	}
	
	public void setSuivant(Athlete suivant) {
		this.suivant = suivant;
	}
	

	
	
	
	
}
