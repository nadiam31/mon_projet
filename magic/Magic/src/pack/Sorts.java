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
	 static Sorts ID_2_1 = new Sorts("Soins rapides", 2, "Blanc", "Soigne 5 points de vie"); //A FAIRE
	 static Sorts ID_3_1 = new Sorts("Destruction", 3, "Noir", "D�truit un batiment");
	 static Sorts ID_4_1 = new Sorts("R�g�n�ration", 3, "Blanc", "Rend tout ses points de vie � un serviteur"); //A FAIRE
	 static Sorts ID_5_1 = new Sorts("Croissance temporaire", 0, "Bleu", "Vous conf�re 2 cristaux de mana pour ce tour uniquement");
	 static Sorts ID_6_1 = new Sorts("Renforcement", 3, "Vert", "Donne +2/+2 � une cr�ature");
	 static Sorts ID_7_1 = new Sorts("Cr�me h�roique", 6, "Rouge", "Inflige 8 points de d�gats au h�ro adverse");
	 static Sorts ID_8_1 = new Sorts("Jet de mana", 0, "Bleu", "Inflige des d�gats �quivalents � la moiti� de votre mana restant � toutes les cr�atures adverses");
	 static Sorts ID_9_1 = new Sorts("Savoir Ancestral", 4, "Bleu", "Vous piochez 2 cartes, elles coutent un cristal de moins");
	 static Sorts ID_10_1 = new Sorts("Transfert magique", 5, "Bleu", "Vous gagnez un cristal de mana vide, votre adversaire perd un cristal de mana");
	 static Sorts ID_11_1 = new Sorts("Pouvoir manavore", 2, "Bleu", "Double l'attaque et la vie d'une cr�ature alli�e, vous perdez 2 cristaux de mana");
	 static Sorts ID_12_1 = new Sorts("Dernier Tour", 10, "Bleu", "D�truit tout vos cristaux de mana, fixe les points de vie de l'adversaire � 10");
	 static Sorts ID_13_1 = new Sorts("Jackpot Magique", 7, "Bleu", "Vous gagnez 1 � 3 cristaux de mana vide");
	 static Sorts ID_14_1 = new Sorts("Acc�l�ration", 2, "Bleu", "Vous gagnez 1 cristal de mana vide");
	 static Sorts ID_15_1 = new Sorts("Magie Arcanique", 5, "Bleu", "Vous piochez une carte, elle coute 0 cristaux de mana");
	 static Sorts ID_16_1 = new Sorts("Carte � jeter", 4, "Rouge", "Vous piochez une carte, inflige son cout � l'adversaire et d�truit la carte");
	 static Sorts ID_17_1 = new Sorts("Soin Magique", 4, "Blanc", "Vous piochez une carte, vous rends des points de vie �quivant au cout de la carte");
	 static Sorts ID_18_1 = new Sorts("Eradication", 7, "Rouge", "Inflige 4 points de d�gats � toutes les cr�atures adverses");
	 static Sorts ID_19_1 = new Sorts("Explosion Elementaire", 3, "Rouge", "Inflige 3 points de d�gats, vous piochez une carte");
	 static Sorts ID_20_1 = new Sorts("Armement de masse", 5, "Vert", "Donne +1 de force � toutes vos cr�atures, ou qu'elles soient");
	 static Sorts ID_21_1 = new Sorts("Execution", 3, "Noir", "D�truit un serviteur bless�");
	 static Sorts ID_22_1 = new Sorts("Bouclier Arri�re", 3, "Vert", "Conf�re *Ignore Recul* � une cr�ature alli�e");
	 static Sorts ID_23_1 = new Sorts("Tricherie", 6, "Bleu", "D�truit 3 cartes du deck adverse");

	 static Sorts ID_1_2 = new Sorts("Babale de feu", 4, "Rouge", "Inflige 6 points de d�gats");
	 static Sorts ID_2_2 = new Sorts("Soins rapides", 2, "Blanc", "Soigne 5 points de vie");
	 static Sorts ID_3_2 = new Sorts("Destruction", 3, "Noir", "D�truit un batiment");
	 static Sorts ID_4_2 = new Sorts("R�g�n�ration", 3, "Blanc", "Rend tout ses points de vie � un serviteur");
	 static Sorts ID_5_2 = new Sorts("Croissance temporaire", 0, "Bleu", "Vous conf�re 2 cristaux de mana pour ce tour uniquement");
	 static Sorts ID_6_2 = new Sorts("Renforcement", 3, "Vert", "Donne +2/+2 � une cr�ature");
	 static Sorts ID_7_2 = new Sorts("Cr�me h�roique", 6, "Rouge", "Inflige 8 points de d�gats au h�ro adverse");
	 static Sorts ID_8_2 = new Sorts("Jet de mana", 0, "Bleu", "Inflige des d�gats �quivalents � la moiti� de votre mana restant � toutes les cr�atures adverses"); 
	 static Sorts ID_9_2 = new Sorts("Savoir Ancestral", 4, "Bleu", "Vous piochez 2 cartes, elles coutent un cristal de moins");
	 static Sorts ID_10_2 = new Sorts("Transfert magique", 5, "Bleu", "Vous gagnez un cristal de mana vide, votre adversaire perd un cristal de mana");
	 static Sorts ID_11_2 = new Sorts("Pouvoir manavore", 2, "Bleu", "Double l'attaque et la vie d'une cr�ature alli�e, vous perdez 2 cristaux de mana");
	 static Sorts ID_12_2 = new Sorts("Dernier Tour", 10, "Bleu", "D�truit tout vos cristaux de mana, fixe les points de vie de l'adversaire � 10");
	 static Sorts ID_13_2 = new Sorts("Jackpot Magique", 7, "Bleu", "Vous gagnez 1 � 3 cristaux de mana vide");
	 static Sorts ID_14_2 = new Sorts("Acc�l�ration", 2, "Bleu", "Vous gagnez 1 cristal de mana vide");
	 static Sorts ID_15_2 = new Sorts("Magie Arcanique", 5, "Bleu", "Vous piochez une carte, elle coute 0 cristaux de mana");
	 static Sorts ID_16_2 = new Sorts("Carte � jeter", 4, "Rouge", "Vous piochez une carte, inflige son cout � l'adversaire et d�truit la carte");
	 static Sorts ID_17_2 = new Sorts("Soin Magique", 4, "Blanc", "Vous piochez une carte, vous rends des points de vie �quivant au cout de la carte");
	 static Sorts ID_18_2 = new Sorts("Eradication", 7, "Rouge", "Inflige 4 points de d�gats � toutes les cr�atures adverses");
	 static Sorts ID_19_2 = new Sorts("Explosion Elementaire", 3, "Rouge", "Inflige 3 points de d�gats, vous piochez une carte");
	 static Sorts ID_20_2= new Sorts("Armement de masse", 5, "Vert", "Donne +1 de force � toutes vos cr�atures, ou qu'elles soient");
	 static Sorts ID_21_2 = new Sorts("Execution", 3, "Noir", "D�truit un serviteur bless�");
	 static Sorts ID_22_2 = new Sorts("Bouclier Arri�re", 3, "Vert", "Conf�re *Ignore Recul* � une cr�ature alli�e");
	 static Sorts ID_23_2 = new Sorts("Tricherie", 6, "Bleu", "D�truit 3 cartes du deck adverse");
	
	 /**
	  * @param
	  * 
	  * 
	  */
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
			if(this.couleur == "Bleu" && this.getName() == "Jet de mana"){ //Sort sans cible
				setEtat(0); // Le sort est consum�, il disparait du jeu
				
				int cart = Joueurs.J1.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
				Joueurs.J1.setNombreCartes(cart);
				
				System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J1.getName()+" CAST "+this.getName()+" ON ALL ENNEMY MINIONS");
				
				for(int i = 0; i < Joueurs.J2.getDeckJ2().length; i++){
					if(Joueurs.J2.getDeckJ2()[i].getEtat() == 3 && Joueurs.J2.getDeckJ2()[i].getType() == 1){
						int deg = ((Creatures) Joueurs.J2.getDeckJ2()[i]).getVie() - Joueurs.J1.getMana();
						((Creatures) Joueurs.J2.getDeckJ2()[i]).setVie(deg);
						
						System.out.println("\nMAGIC-LOG > "+((Creatures) Joueurs.J2.getDeckJ2()[i]).getName()+" TAKES "+ Joueurs.J1.getMana() +" DAMAGES DIRECTLY");
						System.out.println("MAGIC-LOG > LIFE LEFT OF ("+Joueurs.J2.getName()+")"+((Creatures) Joueurs.J2.getDeckJ2()[i]).getName()+" > "+((Creatures) Joueurs.J2.getDeckJ2()[i]).getVie());
						
						((Creatures) Joueurs.J2.getDeckJ2()[i]).Meurt(Joueurs.J2);
					}
					
				}
				Joueurs.J1.setMana(0);			
		
				System.out.println("MAGIC-LOG > "+Joueurs.J1.getName()+" MANA GOT FOR THIS TURN: "+Joueurs.J1.getMana()+"/"+Joueurs.J1.getManaMax()+"" );
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
				if(this.couleur == "Bleu" && this.getName() == "Jet de mana"){ //Sort sans cible
					setEtat(0); // Le sort est consum�, il disparait du jeu
					
					int cart = Joueurs.J2.getNombreCartes() - 1; //On soustrait une carte � la main du joueur
					Joueurs.J2.setNombreCartes(cart);
					
					System.out.println("\nMAGIC-LOG > PLAYER "+Joueurs.J2.getName()+" CAST "+this.getName()+" ON ALL ENNEMY MINIONS");
					
					for(int i = 0; i < Joueurs.J1.getDeckJ1().length; i++){
						if(Joueurs.J1.getDeckJ1()[i].getEtat() == 3 && Joueurs.J1.getDeckJ1()[i].getType() == 1){
							int deg = ((Creatures) Joueurs.J1.getDeckJ1()[i]).getVie() - Joueurs.J2.getMana();
							((Creatures) Joueurs.J1.getDeckJ1()[i]).setVie(deg);
							
							System.out.println("\nMAGIC-LOG > "+((Creatures) Joueurs.J1.getDeckJ1()[i]).getName()+" TAKES "+ Joueurs.J2.getMana() +" DAMAGES DIRECTLY");
							System.out.println("MAGIC-LOG > LIFE LEFT OF ("+Joueurs.J1.getName()+")"+((Creatures) Joueurs.J1.getDeckJ1()[i]).getName()+" > "+((Creatures) Joueurs.J1.getDeckJ1()[i]).getVie());
							
							((Creatures) Joueurs.J1.getDeckJ1()[i]).Meurt(Joueurs.J1);
						}
						
					}
					Joueurs.J2.setMana(0);			
			
					System.out.println("MAGIC-LOG > "+Joueurs.J2.getName()+" MANA GOT FOR THIS TURN: "+Joueurs.J2.getMana()+"/"+Joueurs.J2.getManaMax()+"" );
				}	
		}
	}

	@Override
	public void FrappeHero(Joueurs id, Joueurs id2) {

		
	}

	@Override
	public void Frappe(int cible) {

		
	}


}
