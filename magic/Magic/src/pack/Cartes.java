package pack;

public abstract class Cartes {
	private String name;
	private int cout;
	private int etat = 1; //0 pour in�xistante/morte, 1 pour deck, 2 pour main, 3 pour plateau.
	// De base, la carte se trouve dans le deck
	
	//Uniquement pour cr�ature
	private boolean peutFrapper = true;
	private int type;
	
	public Cartes(String name, int cout){
		this.name = name;
		this.cout = cout;

	}
	
// Getters et Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCout() {
		return cout;
	}
	public void setCout(int cout) {
		this.cout = cout;
	}
	public int getEtat() {
		return etat;
	}
	public void setEtat(int etat) {
		this.etat = etat;
	}
	public boolean isPeutFrapper() {
		return peutFrapper;
	}

	public void setPeutFrapper(boolean peutFrapper) {
		this.peutFrapper = peutFrapper;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}	

	public String toString(){
		String retour;
		
		retour = "Nom: "+this.name;
		retour+= "\nCout: "+this.cout;
		
		return retour;
	}

	//M�thodes Abstraites
	public abstract void Jouer(int cible);
	public abstract void Frappe(int cible);
	public abstract void FrappeHero(Joueurs id, Joueurs id2);

}

