package pack;

import java.util.Scanner;
import java.util.Random;

public class Joueurs {
	private int vie;
	private int force;
	private String identifiant;
	private String name;

	private int mana;
	private int manaMax;
	
	private int nombreCartes;
	private boolean joue = false; //Par d�faut, c'est � personne de jouer
	
	private Cartes deckJ1[] = {Creatures.ID_1_1, Creatures.ID_2_1, Creatures.ID_3_1,
			Ressources.ID_1_1, Ressources.ID_2_1, Sorts.ID_1_1, Sorts.ID_2_1, 
			Sorts.ID_3_1, Sorts.ID_4_1, Creatures.ID_4_1, Sorts.ID_5_1, Sorts.ID_6_1,
			Creatures.ID_5_1, Creatures.ID_6_1, Sorts.ID_7_1}; //Le deck du joueur 1 est stock� ici
	
	private Cartes deckJ2[] = {Creatures.ID_1_2, Creatures.ID_2_2, Creatures.ID_3_2,
			Ressources.ID_1_2, Ressources.ID_2_2, Sorts.ID_1_2, Sorts.ID_2_2, 
			Sorts.ID_3_2, Sorts.ID_4_2, Creatures.ID_4_2, Sorts.ID_5_2, Sorts.ID_6_2,
			Creatures.ID_5_2, Creatures.ID_6_2, Sorts.ID_7_2}; //Le deck du joueur 2 est stock� ici

	//Constructeur
	public Joueurs(String identifiant, String name, int vie, int force){
		this.identifiant = identifiant;
		this.name = name;
		this.vie = vie;
		this.force = force;
	}
	
	//Getters et Setters
	
	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public int getVie() {
		return vie;
	}

	public void setVie(int vie) {
		this.vie = vie;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getManaMax() {
		return manaMax;
	}

	public void setManaMax(int manaMax) {
		this.manaMax = manaMax;
	}

	public int getNombreCartes() {
		return nombreCartes;
	}

	public void setNombreCartes(int nombreCartes) {
		this.nombreCartes = nombreCartes;
	}

	public boolean isJoue() {
		return joue;
	}

	public void setJoue(boolean joue) {
		this.joue = joue;
	}

	public Cartes[] getDeckJ1() {
		return deckJ1;
	}

	public void setDeckJ1(Cartes[] deck) {
		this.deckJ1 = deck;
	}

	public Cartes[] getDeckJ2() {
		return deckJ2;
	}

	public void setDeckJ2(Cartes[] deckJ2) {
		this.deckJ2 = deckJ2;
	}
	
	//M�thode toString
	public String toString(){
		String retour;
		
		retour = "\n===== Joueur =====";
		retour+= "\nPoints de vie: "+this.vie;
		retour+= "\nMana: "+this.mana+"/"+this.manaMax;
		retour+= "\nNombres de cartes: "+this.nombreCartes;
		retour+= "\nC'est son tour ? "+this.isJoue();
		retour+= "\n===================";
		
		return retour;
	}
	//Joueurs Instanciation

	static Joueurs J1 = new Joueurs("J1", "J1_Default", 30, 0);
	static Joueurs J2 = new Joueurs("J2", "J2_Default", 30, 0);
	

	public void Pioche(){
		if(this.identifiant == "J1" && this.getNombreCartes() <= 10 && Plateau.isEnJeu() == true){
			
			boolean havePick = false; //On d�fini qu'il n'a pas encore pioch�

			while(havePick == false){ //Tant qu'il n'a pas pioch�
				Random rand = new Random(); //On g�n�re un nombre al�atoire
				int nombre = rand.nextInt(15); //Entre 0 et 15
				if(this.deckJ1[nombre].getEtat() == 1){ //Si le nombre est une carte dans deck
			
			this.deckJ1[nombre].setEtat(2); //On la pioche
			int pio = this.getNombreCartes() + 1; //On ajoute une carte � la main du joueur sp�cifi�
			this.setNombreCartes(pio);
			System.out.println("\nMAGIC-LOG > PLAYER "+this.getName()+" PICK UP > "+this.deckJ1[nombre].getName());
			System.out.println("MAGIC-LOG > PLAYER "+this.getName()+" HAVE "+this.getNombreCartes()+ " CARDS NOW");
			
			havePick = true; //On d�fini que le joueur a pioch�
				}
			}
		};
			
		if(this.identifiant == "J2" && this.getNombreCartes() <= 10 && Plateau.isEnJeu() == true){
				
				boolean havePick2 = false; //On d�fini qu'il n'a pas encore pioch�

				while(havePick2 == false){ //Tant qu'il n'a pas pioch�
					Random rand2 = new Random(); //On g�n�re un nombre al�atoire
					int nombre2 = rand2.nextInt(15); //Entre 0 et 15
					if(this.deckJ2[nombre2].getEtat() == 1){ //Si le nombre est une carte dans deck
						
				this.deckJ2[nombre2].setEtat(2);//On la pioche
				int pio2 = this.getNombreCartes() + 1; //On ajoute une carte � la main du joueur sp�cifi�
				this.setNombreCartes(pio2);
				System.out.println("\nMAGIC-LOG > PLAYER "+this.getName()+" PICK UP > "+this.deckJ2[nombre2].getName());
				System.out.println("MAGIC-LOG > PLAYER "+this.getName()+" HAVE "+this.getNombreCartes()+ " CARDS NOW");
				
				havePick2 = true; //On d�fini que le joueur a pioch�
				};
			}
		}
	}

	public void Meurt(){
		if(this.vie <= 0 && Plateau.isEnJeu() == true) { //Quand le joueur a 0 points de vie ...

            System.out.println("\nMAGIC-LOG > PLAYER "+ this.getName() +" > DEAD | END OF THE GAME"); //On signale la fin de la partie
            Plateau.setEnJeu(false); //Jeu termin� ! 
            
            Reinit(); //R�initialisation
           
            
		}
	}
	
	public void Passe(Joueurs id){
		if(this.identifiant == "J1" && this.isJoue() == true && this.vie >= 0 && Plateau.isEnJeu() == true){ //On v�rifie si c'est bien 
			// son tour, qu'il est vivant et bien entendu que le plateau est occup�
			
			this.setJoue(false); //Si oui, on d�finit que son tour est termin�			
			id.setJoue(true); //L'autre joueur � le droit de jouer	
			System.out.println("\nMAGIC-LOG > "+this.getName()+" PASSE > "+id.getName());	
			
			if(id.getManaMax() < 10){
			int man = id.getManaMax() + 1; //On ajoute 1 de mana Maximun au d�but du tour d'un joueur 
			id.setManaMax(man);
				}
			int man2 = id.getManaMax(); //On renfloue la mana du joueur
			id.setMana(man2);
			
			Ressources.ID_1_2.Produit(J2);
			Ressources.ID_2_2.Produit(J2);
			
			System.out.println("\n\nMAGIC-LOG > "+id.getName()+" MANA SET: "+id.getMana()+"/"+id.getManaMax()+"" );	
			
			id.Pioche(); //L'autre joueur pioche une carte
									 
			this.Meurt(); //On v�rifie s'il n'y a pas de joueurs morts 
			id.Meurt();
			
		for(int i = 0 ; i < id.deckJ2.length ; i++) //On v�rifie les 30 cartes du deck
		{
			if(id.deckJ2[i].getType() == 1  && id.getDeckJ2()[i].getEtat() == 3){ //Si ce sont des cr�atures
				id.deckJ2[i].setPeutFrapper(true); //On d�fini qu'elle peuvent � nouveau frapper
			} 
		}
	};
		if(this.identifiant == "J2" && this.isJoue() == true && this.vie >= 0 && Plateau.isEnJeu() == true){ //On v�rifie si c'est bien 
			// son tour, qu'il est vivant et bien entendu que le plateau est occup�
			
			this.setJoue(false); //Si oui, on d�finit que son tour est termin�			
			id.setJoue(true); //L'autre joueur � le droit de jouer	
			System.out.println("\n\n======== FIN DU TOUR "+id.getManaMax()+" ========");
			System.out.println("\nMAGIC-LOG > "+this.getName()+" PASSE > "+id.getName());	
			
			if(id.getManaMax() < 10){
			int man = id.getManaMax() + 1; //On ajoute 1 de mana Maximun au d�but du tour d'un joueur 
			id.setManaMax(man);
				}
			int man2 = id.getManaMax(); //On renfloue la mana du joueur
			id.setMana(man2);
			
			Ressources.ID_1_1.Produit(J1);
			Ressources.ID_2_1.Produit(J1);
		
			System.out.println("\nMAGIC-LOG > "+id.getName()+" MANA SET: "+id.getMana()+"/"+id.getManaMax()+"" );	
			
			id.Pioche(); //L'autre joueur pioche une carte
			
			this.Meurt();
			id.Meurt();
			
			for(int i = 0 ; i < id.deckJ1.length ; i++) //On v�rifie les 30 cartes du deck
			{
				if( id.deckJ1[i].getType() == 1 && id.getDeckJ1()[i].getEtat() == 3){ //Si ce sont des cr�atures
					 id.deckJ1[i].setPeutFrapper(true); //On d�fini qu'elle peuvent � nouveau frapper
			} 
		}											
		};
	}			

	@SuppressWarnings("resource")
	public static void Init(){
		
		System.out.println("\nVeuillez entrer le nom du joueur 1");
		Scanner sc1 = new Scanner(System.in); //On entre le nom du Joueur 1
		String J1_name = sc1.nextLine();
		J1.setName(J1_name);
		System.out.println("\nVeuillez entrer le nom du joueur 2");
		Scanner sc2 = new Scanner(System.in); //On entre le nom du Joueur 2
		String J2_name = sc2.nextLine();
		J2.setName(J2_name);

		Plateau.setEnJeu(true); //On commence le jeu.

		J1.setNombreCartes(0); //Les deux joueurs recoivent 3 cartes
		J2.setNombreCartes(0);
		
		J1.setJoue(true); //Le joueur un commence
		
		J1.setMana(1); //Et �galement le mana actuel		
		J1.setManaMax(1); //Porte le maximun de mana � 1
		
		System.out.println("\nMAGIC-LOG > SET "+J1.getName()+" AS PLAYER 1");
		System.out.println("MAGIC-LOG > SET "+J2.getName()+" AS PLAYER 2");
		System.out.println("\nMAGIC-LOG > "+J1.getName()+" MANA SET: "+J1.getMana()+"/"+J1.getManaMax()+""); 
			
		System.out.println("\nMAGIC-LOG > "+J1.getName()+" PICK UP 3 CARDS");
		
		J1.Pioche(); //Il pioche une carte
		J1.Pioche(); //Il pioche une carte
		J1.Pioche(); //Il pioche une carte
		
		System.out.println("\nMAGIC-LOG > "+J2.getName()+" PICK UP 4 CARDS");
		
		J2.setJoue(true);
		J1.setJoue(false);
		J2.Pioche(); //Il pioche une carte
		J2.Pioche(); //Il pioche une carte
		J2.Pioche(); //Il pioche une carte	
		J2.Pioche(); //Il pioche une carte			
		J2.setJoue(false);
		J1.setJoue(true);
		
	}
	
	public static void Reinit(){
        /** On r�initialise les statistiques... */
        J1.setVie(30); J2.setVie(30);
        J1.setNombreCartes(0); J2.setNombreCartes(0);
        J1.setForce(0); J2.setForce(0);
        J1.setName("J1_Default"); J2.setName("J2_Default");
        J1.setMana(0); J2.setMana(0);
        J1.setManaMax(0); J2.setManaMax(0);
        J1.setJoue(false); J2.setJoue(false);
	}
	
	

}
