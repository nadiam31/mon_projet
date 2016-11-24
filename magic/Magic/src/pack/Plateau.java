package pack;

 

public class Plateau {
	//Variables d'instance
	private static int nbreCreatures = 0; //Par défaut, il n'y a personne sur le terrain.
	private static boolean enJeu = false; //Boolean qui signale si le jeu se déroule ou non
	
		            	
	//Getters en Setters
	public static int getNbreCreatures() {
		return nbreCreatures;
	}

	public static void setNbreCreatures(int nbreCreatures) {
		Plateau.nbreCreatures = nbreCreatures;
	}

	public static boolean isEnJeu() {
		return enJeu;
	}

	public static void setEnJeu(boolean enJeu) {
		Plateau.enJeu = enJeu;
	}


}