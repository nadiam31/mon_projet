package pack;

public class Ressources extends Cartes {
	
	private String prodType;
	private int prod;
	private int vie;
	private String effet;
	
	//Constructeur
	public Ressources(String name, int cout, String prodType, int prod, int vie, String effet){
		super(name, cout);
		this.prodType = prodType;
		this.prod = prod;
		this.vie = vie;
		this.effet = effet;
	}
	
	//Getters en Setters
	public int getProduction() {
		return prod;
	}

	public void setProduction(int prod) {
		this.prod = prod;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public String getEffet() {
		return effet;
	}

	public void setEffet(String effet) {
		this.effet = effet;
	}

	
	//M�thode toString
	public String toString(){
		String retour;
		
		retour = "========== Ressource ==========";
		retour+= "\n"+super.toString();
		retour+= "\nProduction: "+this.prod+" Mana/ tour";
		retour+= "\nVie: "+this.vie;
		retour+= "\nEffet: "+this.effet;
		retour+= "\n===============================";
				
		return retour;
	}	
	
	
	 // (Nom, Cout, Type de production, Nombre produit, Vie, Effet) Instanciation
	 static Ressources ID_1_1 = new Ressources("Mine de mana", 3, "Mana", 1, 5, "Produit un cristal de mana par tour.");
	 static Ressources ID_1_2 = new Ressources("Mine de mana", 3, "Mana", 1, 5, "Produit un cristal de mana par tour.");
	 static Ressources ID_2_1 = new Ressources("Puits de lumi�re", 3, "Vie", 2, 3, "Rends deux points de vie � votre h�ro chaque tour");
	 static Ressources ID_2_2 = new Ressources("Puits de lumi�re", 3, "Vie", 2, 3, "Rends deux points de vie � votre h�ro chaque tour");
	 

	

	@Override
	public void Jouer(int cible){
		if(Joueurs.J1.isJoue() == true && Joueurs.J1.getMana() >= ((Ressources) Joueurs.J1.getDeckJ1()[cible]).getCout() && Plateau.getNbreCreatures() < 10 && Joueurs.J1.isJoue() == true && ((Ressources) Joueurs.J1.getDeckJ1()[cible]).getEtat() == 2){
        // Verification de l'�tat g�n�ral du jeu
			((Ressources) Joueurs.J1.getDeckJ1()[cible]).setEtat(3);//Pose sur le plateau
		
        int crea = Plateau.getNbreCreatures() + 1; //On incr�mente le nombre de cr�atures sur le plateau
		Plateau.setNbreCreatures(crea);

		int mn = Joueurs.J1.getMana() - ((Ressources) Joueurs.J1.getDeckJ1()[cible]).getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
		Joueurs.J1.setMana(mn);
		
		int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
		Joueurs.J1.setNombreCartes(cart);
		
		System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" PLAYS "+((Ressources) Joueurs.J1.getDeckJ1()[cible]).getName() +"(0|"+((Ressources) Joueurs.J1.getDeckJ1()[cible]).getVie()+")");
		System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA LEFT: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
		System.out.println("MAGIC-LOG > THE BOARD HAVE "+Plateau.getNbreCreatures()+" MINIONS NOW" );
		
		}
		
		if(Joueurs.J2.isJoue() == true && Joueurs.J2.getMana() >= ((Ressources) Joueurs.J2.getDeckJ2()[cible]).getCout() && Plateau.getNbreCreatures() < 10 && Joueurs.J2.isJoue() == true && ((Ressources) Joueurs.J2.getDeckJ2()[cible]).getEtat() == 2){
        // Verification de l'�tat g�n�ral du jeu
			((Ressources) Joueurs.J2.getDeckJ2()[cible]).setEtat(3);//Pose sur le plateau
		
        int crea = Plateau.getNbreCreatures() + 1; //On incr�mente le nombre de cr�atures sur le plateau
		Plateau.setNbreCreatures(crea);

		int mn = Joueurs.J2.getMana() - ((Ressources) Joueurs.J2.getDeckJ2()[cible]).getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
		Joueurs.J2.setMana(mn);
		
		int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
		Joueurs.J2.setNombreCartes(cart);
		
		System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" PLAYS "+((Ressources) Joueurs.J2.getDeckJ2()[cible]).getName() +"(0|"+((Ressources) Joueurs.J2.getDeckJ2()[cible]).getVie()+")");
		System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA LEFT: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
		System.out.println("MAGIC-LOG > THE BOARD HAVE "+Plateau.getNbreCreatures()+" MINIONS NOW" );

		}
	}

	
	public void Produit(Joueurs id){
		if(id.isJoue() == true && this.getEtat() == 3 && this.prodType == "Mana"){
		// On verifie que c'est le tour du joueur qui poss�de la carte et que la carte est sur le plateau
			
			int ma = id.getMana() + this.prod; //Chaque tour, on gagne la production
			id.setMana(ma);
			
			System.out.println("MAGIC-LOG > PLAYER "+id.getName()+" GAINS "+this.getProduction()+" MANA FROM "+this.getName());		
			
		}
		else if(id.isJoue() == true && this.getEtat() == 3 && this.prodType == "Vie" && id.getVie() + this.getProduction() <= 30){
		// On verifie que c'est le tour du joueur qui poss�de la carte et que la carte est sur le plateau
		// On v�rifie aussi qu'on ira pas au del� de 30 points de vie
			
			int ma = id.getVie() + this.prod; //Chaque tour, on gagne la production
			id.setVie(ma);
			
			System.out.println("MAGIC-LOG > PLAYER "+id.getName()+" GAINS "+this.getProduction()+" HEALTH FROM "+this.getName());		
						
		}
	}

	public void Meurt(Joueurs id){
		if(this.vie <= 0) {

			this.setEtat(0); //Supprime la carte du jeu

	        int crea = Plateau.getNbreCreatures() - 1; //On d�cr�mente le nombre de cr�atures sur le plateau
			Plateau.setNbreCreatures(crea);	
			
			System.out.println("\nMAGIC-LOG > ("+id.getName()+")"+this.getName()+" IS DEAD | REMOVED");
			System.out.println("MAGIC-LOG > THE BOARD HAVE "+Plateau.getNbreCreatures()+" MINIONS NOW" );
		}
	}

	@Override
	public void FrappeHero(Joueurs id, Joueurs id2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Frappe(int cible) {
		// TODO Auto-generated method stub
		
	}

}
