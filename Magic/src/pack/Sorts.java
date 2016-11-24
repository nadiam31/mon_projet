package pack;

public class Sorts extends Cartes {
	private String couleur;
	private String effet;
	
	 // Constructeur
	public Sorts(String name, int cout, String couleur, String effet){
		super(name, cout);
		this.couleur = couleur;
		this.effet = effet;
	}
	
	//Getters en Setters
	
	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
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
		
		retour = "========== Sort ==========";
		retour+= "\n"+super.toString();
		retour+= "\nCouleur: "+this.couleur;
		retour+= "\nEffet: "+this.effet;
		retour+= "\n==========================";
				
		return retour;
	}	

	 // (Nom, Cout, Couleur, Effet)
	 static Sorts ID_1_1 = new Sorts("Babale de feu", 4, "Rouge", "Inflige 6 points de d�gats");
	 static Sorts ID_2_1 = new Sorts("Soins rapides", 2, "Blanc", "Soigne 5 points de vie");
	 static Sorts ID_3_1 = new Sorts("Destruction", 3, "Noir", "D�truit un batiment");
	 static Sorts ID_4_1 = new Sorts("R�g�n�ration", 3, "Blanc", "Rend tout ses points de vie � un serviteur");
	 static Sorts ID_5_1 = new Sorts("Croissance temporaire", 0, "Bleu", "Vous conf�re 2 cristaux de mana pour ce tour uniquement");
	 static Sorts ID_6_1 = new Sorts("Renforcement", 3, "Vert", "Donne +2/+2 � une cr�ature");
	 static Sorts ID_7_1 = new Sorts("Cr�me h�roique", 6, "Rouge", "Inflige 8 points de d�gats au h�ro adverse");
	 
	 static Sorts ID_1_2 = new Sorts("Babale de feu", 4, "Rouge", "Inflige 6 points de d�gats");
	 static Sorts ID_2_2 = new Sorts("Soins rapides", 2, "Blanc", "Soigne 5 points de vie");
	 static Sorts ID_3_2 = new Sorts("Destruction", 3, "Noir", "D�truit un batiment");
	 static Sorts ID_4_2 = new Sorts("R�g�n�ration", 3, "Blanc", "Rend tout ses points de vie � un serviteur");
	 static Sorts ID_5_2 = new Sorts("Croissance temporaire", 0, "Bleu", "Vous conf�re 2 cristaux de mana pour ce tour uniquement");
	 static Sorts ID_6_2 = new Sorts("Renforcement", 3, "Vert", "Donne +2/+2 � une cr�ature");
	 static Sorts ID_7_2 = new Sorts("Cr�me h�roique", 6, "Rouge", "Inflige 8 points de d�gats au h�ro adverse");
	 
	
	public void Jouer(int cible){
		if(Joueurs.J1.isJoue() == true && Joueurs.J1.getMana() >= getCout() == true && this.getEtat() == 2){		
			if(this.couleur == "Rouge" && cible == -1 && this.effet == "Inflige 6 points de d�gats"){ //Frappe le h�ro adverse
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				int deg = Joueurs.J2.getVie() - 6 ;
				Joueurs.J2.setVie(deg);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON "+Joueurs.J2.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA LEFT: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
				System.out.println("\nMAGIC-LOG > "+Joueurs.J2.getName()+" TAKES 6 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF "+Joueurs.J2.getName()+" > "+Joueurs.J2.getVie());
			}
			if(this.couleur == "Rouge" && cible >= 0 && this.effet == "Inflige 6 points de d�gats" && Joueurs.J2.getDeckJ2()[cible].getEtat() == 3){ //Frappe un serviteur
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				int deg = ((Creatures) Joueurs.J2.getDeckJ2()[cible]).getVie() - 6;
				((Creatures) Joueurs.J2.getDeckJ2()[cible]).setVie(deg);	
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getName());
				System.out.println("MAGIC-LOG > "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getName()+" TAKES 6 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF ("+Joueurs.J2.getName()+")"+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getName()+" > "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getVie());
				
				((Creatures) Joueurs.J2.getDeckJ2()[cible]).Meurt(Joueurs.J2);				
			}
			if(this.couleur == "Rouge" && cible == -1 && this.effet == "Inflige 8 points de d�gats au h�ro adverse"){ //Frappe le h�ro adverse
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				int deg = Joueurs.J2.getVie() - 8;
				Joueurs.J2.setVie(deg);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON "+Joueurs.J2.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA LEFT: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
				System.out.println("\nMAGIC-LOG > "+Joueurs.J2.getName()+" TAKES 8 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF "+Joueurs.J2.getName()+" > "+Joueurs.J2.getVie());
			}				
			if(this.couleur == "Bleu" && this.effet == "Vous conf�re 2 cristaux de mana pour ce tour uniquement"){ //Sort sans cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				int plus = Joueurs.J1.getMana() + 2;
				Joueurs.J1.setMana(plus);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA GOT FOR THIS TURN: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
			}		
			if(this.couleur == "Vert" && cible >= 0 && this.effet == "Donne +2/+2 � une cr�ature" && Joueurs.J1.getDeckJ1()[cible].getEtat() == 3){ //Sort sans cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				int vie = ((Creatures) Joueurs.J1.getDeckJ1()[cible]).getVie() + 2;
				((Creatures) Joueurs.J1.getDeckJ1()[cible]).setVie(vie);
				int force = ((Creatures) Joueurs.J1.getDeckJ1()[cible]).getForce() + 2;
				((Creatures) Joueurs.J1.getDeckJ1()[cible]).setForce(force);
			
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA LEFT: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
				System.out.println("MAGIC-LOG > "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getName()+" IS NOW: "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getForce()+"|"+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getVie()+"" );
		}
		
			if(this.couleur == "Noir" && cible >= 0 && this.effet == "D�truit un batiment" && Joueurs.J2.getDeckJ2()[cible].getEtat() == 3){ //Sort ayant un batiment comme cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				int mn = Joueurs.J1.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J1.setMana(mn);
				
				((Ressources) Joueurs.J2.getDeckJ2()[cible]).setVie(0);
			
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON "+((Ressources) Joueurs.J2.getDeckJ2()[cible]).getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA LEFT: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
				
				((Ressources) Joueurs.J2.getDeckJ2()[cible]).Meurt(Joueurs.J2);
			}
		}
	
		if(Joueurs.J2.isJoue() == true && Joueurs.J2.getMana() >= getCout() && getEtat() == 2){
			if(this.couleur == "Rouge" && cible == -1 && this.effet == "Inflige 6 points de d�gats"){ //Frappe le h�ro adverse
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J2.setNombreCartes(cart);
				
				int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J2.setMana(mn);
						
				int deg = Joueurs.J1.getVie() - 6;
				Joueurs.J1.setVie(deg);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON "+Joueurs.J1.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA LEFT: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
				System.out.println("\nMAGIC-LOG > "+Joueurs.J1.getName()+" TAKES 6 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF "+Joueurs.J1.getName()+" > "+Joueurs.J1.getVie());
			}
			if(this.couleur == "Rouge" && cible >= 0 && this.effet == "Inflige 6 points de d�gats" && Joueurs.J1.getDeckJ1()[cible].getEtat() == 3){ //Frappe un serviteur
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J2.setNombreCartes(cart);
				
				int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J2.setMana(mn);
								
				int deg = ((Creatures) Joueurs.J1.getDeckJ1()[cible]).getVie() - 6;
				((Creatures) Joueurs.J1.getDeckJ1()[cible]).setVie(deg);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getName());
				System.out.println("MAGIC-LOG > "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getName()+" TAKES 6 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF ("+Joueurs.J2.getName()+")"+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getName()+" > "+((Creatures) Joueurs.J1.getDeckJ1()[cible]).getVie());
				
				((Creatures) Joueurs.J1.getDeckJ1()[cible]).Meurt(Joueurs.J1);
			}
			if(this.couleur == "Rouge" && cible == -1 && this.effet == "Inflige 8 points de d�gats au h�ro adverse"){ //Frappe le h�ro adverse
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J2.setNombreCartes(cart);
				
				int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J2.setMana(mn);
								
				int deg = Joueurs.J1.getVie() - 8;
				Joueurs.J1.setVie(deg);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON "+Joueurs.J1.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA LEFT: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
				System.out.println("\nMAGIC-LOG > "+Joueurs.J1.getName()+" TAKES 8 DAMAGES DIRECTLY");
				System.out.println("MAGIC-LOG > LIFE LEFT OF "+Joueurs.J1.getName()+" > "+Joueurs.J1.getVie());
			}	
			if(this.couleur == "Bleu" && this.effet == "Vous conf�re 2 cristaux de mana pour ce tour uniquement"){ //Sort sans cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J2.setNombreCartes(cart);
				
				int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J2.setMana(mn);
				
				int plus = Joueurs.J2.getMana() + 2;
				Joueurs.J2.setMana(plus);
			
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA GOT FOR THIS TURN: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
			}		
			if(this.couleur == "Vert" && cible >= 0 && this.effet == "Donne +2/+2 � une cr�ature" && Joueurs.J2.getDeckJ2()[cible].getEtat() == 3){ //Sort sans cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J2.setNombreCartes(cart);
				
				int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
				Joueurs.J2.setMana(mn);
					
				int vie = ((Creatures) Joueurs.J2.getDeckJ2()[cible]).getVie() + 2;
				((Creatures) Joueurs.J2.getDeckJ2()[cible]).setVie(vie);
				int force = ((Creatures) Joueurs.J2.getDeckJ2()[cible]).getForce() + 2;
				((Creatures) Joueurs.J2.getDeckJ2()[cible]).setForce(force);
			
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getName());
				System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA LEFT: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
				System.out.println("MAGIC-LOG > "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getName()+" IS NOW: "+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getForce()+"|"+((Creatures) Joueurs.J2.getDeckJ2()[cible]).getVie()+"" );
			}
				if(this.couleur == "Noir" && cible >= 0 && this.effet == "D�truit un batiment" && Joueurs.J1.getDeckJ1()[cible].getEtat() == 3){ //Sort ayant un batiment comme cible
					setEtat(0); // Le sort est consum�, il disparait du jeu
					
					int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
					Joueurs.J2.setNombreCartes(cart);
					
					int mn = Joueurs.J2.getMana() - this.getCout(); //On soustrait le cout de la cr�ature pour avoir le mana restant
					Joueurs.J2.setMana(mn);
						
					((Ressources) Joueurs.J1.getDeckJ1()[cible]).setVie(0);
				
					System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON "+((Ressources) Joueurs.J1.getDeckJ1()[cible]).getName());
					System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA LEFT: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
					
					((Ressources) Joueurs.J2.getDeckJ1()[cible]).Meurt(Joueurs.J1);
			}
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
