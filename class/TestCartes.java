package pack;


public class TestCartes {

	public static void main(String[] args){

		
		/**
		 * @author Florian
		 * Pour commander une action, construisez le jeu vous m�me.
		 * 
		 * !! Veillez � faire des actions lorque c'est le tour du joueur s�l�ctionn� !!
		 * 
		 * Ex: N'allez pas faire en sorte que le joueur 1 joue une carte pendant le tour du joueur 2 ...
		 * �a ne marchera pas, ni frapper, ni rien !
		 * 
		 * !! Les actions command�es ne se produiront pas obligatoirement ! Si la condition est pas respect�e, rien
		 * ne se produira !
		 * 
		 * Passer un tour -> Joueurs.X.PasseX(Joueurs.Y)
		 * Joueur X passe � Joueur Y
		 * 
		 * Jouer une carte -> Joueurs.X.getdeckX()[Carte].Jouer(A)
		 * X = Joueur qui joue
		 * A = M�me num�ro que carte si Cr�ature ou ressources
		 * A = Cible des sorts (-1 = H�ro adverse, 0 ou plus pour cr�ature ou ressource)
		 * 
		 * Frapper avec une carte -> Joueurs.X.getDeckX()[Carte].FrappeX(A)
		 * X = Joueur qui joue
		 * A = Cible
		 * 
		 * Frapper avec une carte sur le h�ro adverse -> Joueurs.X.getDeck()[Carte].FrappeHero(Joueurs.X, Joueurs.Y)
		 * X = Joueur qui frappe avec sa carte
		 * Y = H�ro ennemi cibl�
		 * 
		 * 0 -> Soldat 2/3 (Cr�ature) (Pas de cri de guerre)
		 * 1 -> Magicien Novice 1/2 (Cr�ature) (Inflige 1 point de d�gats)
		 * 2 -> Videur 2/2 (Cr�ature) (Inflige 1 point de d�gats)
		 * 3 -> Mine de mana 0/5 (Ressources)
		 * 4 -> Puits de lumi�re 0/3 (Ressources)
		 * 5 -> Boule de feu (Sorts) Offensif qui inflige 6 points de d�gats
		 * 6 -> Soins Rapides (Sorts) D�fensif qui soigne de 5 points de vie
		 * 7 -> Destruction (Sorts) Offensif qui d�truit une Ressource ennemie
		 * 8 -> R�g�n�ration (Sorts) D�fensif qui soigne enti�rement une cr�ature alli�e
		 * 9 -> Bourrin Excit� 4/2 (Cr�ature) (Pas de cri de guerre) + CHARGE
		 * 10 -> Croissance Temporaire (Sorts) Support qui donne 2 Mana pendant ce tour (Pas de cible ! = 0)
		 * 11 -> Renforcement (Sorts) Support qui donne +2/+2 � une cr�ature alli�e
		 * 12 -> Tireur d'�lite 3/1 (Creature) (Pas de cri de guerre) + IGNORE RECUL
		 * 13 -> Chasseur Impatient 4/2 (Cr�ature) (Pas de cri de guerre) + CHARGE + IGNORE RECUL
		 * 14 -> Cr�me H�roique (Sorts) Offensif qui inflige 8 points de d�gats au h�ro adverse
		 * 
		 */
		
		
		Joueurs.Init();
		
		Joueurs.J1.Passe(Joueurs.J2); //Passe
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 2
		
		Joueurs.J1.Passe(Joueurs.J2); //Passe
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 3

		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[7].Jouer(3);
		Joueurs.J1.getDeckJ1()[7].Jouer(4);
		Joueurs.J1.getDeckJ1()[11].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[2].Jouer(2);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		
		Joueurs.J1.Passe(Joueurs.J2); //Passe
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(2);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 4

		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[7].Jouer(3);
		Joueurs.J1.getDeckJ1()[7].Jouer(5);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[2].Jouer(2);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		
		Joueurs.J1.Passe(Joueurs.J2);	//Passe
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(2);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 5
		
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[2].Jouer(2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(9);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[7].Jouer(3);
		Joueurs.J1.getDeckJ1()[7].Jouer(5);
		Joueurs.J1.getDeckJ1()[12].Jouer(12);
		Joueurs.J1.getDeckJ1()[13].Jouer(13);
		Joueurs.J1.getDeckJ1()[12].Frappe(0);
		Joueurs.J1.getDeckJ1()[13].Frappe(0);
		
		Joueurs.J1.Passe(Joueurs.J2);	 //Passe
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 6
		
		Joueurs.J1.getDeckJ1()[5].Jouer(9);
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[2].Jouer(2);
		Joueurs.J1.getDeckJ1()[1].Jouer(1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[1].Frappe(0);
		Joueurs.J1.getDeckJ1()[1].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[7].Jouer(3);
		Joueurs.J1.getDeckJ1()[7].Jouer(4);
		Joueurs.J1.getDeckJ1()[12].Jouer(12);
		Joueurs.J1.getDeckJ1()[13].Jouer(13);
		Joueurs.J1.getDeckJ1()[12].Frappe(0);
		Joueurs.J1.getDeckJ1()[13].Frappe(0);
		
		Joueurs.J1.Passe(Joueurs.J2);	//Passe
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(2);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 7
		
		Joueurs.J1.getDeckJ1()[5].Jouer(9);
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[7].Jouer(3);
		Joueurs.J1.getDeckJ1()[7].Jouer(4);
		Joueurs.J1.getDeckJ1()[12].Jouer(12);
		Joueurs.J1.getDeckJ1()[13].Jouer(13);
		Joueurs.J1.getDeckJ1()[12].Frappe(0);
		Joueurs.J1.getDeckJ1()[13].Frappe(0);
		Joueurs.J1.getDeckJ1()[14].Jouer(-1);
		
		Joueurs.J1.Passe(Joueurs.J2);	//Passe
		 
		Joueurs.J2.getDeckJ2()[0].Jouer(2);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		Joueurs.J2.getDeckJ2()[11].Jouer(0);
		Joueurs.J2.getDeckJ2()[11].Jouer(2);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 8
		
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[12].Jouer(12);
		Joueurs.J1.getDeckJ1()[13].Jouer(13);
		Joueurs.J1.getDeckJ1()[12].Frappe(0);
		Joueurs.J1.getDeckJ1()[13].Frappe(0);
		Joueurs.J1.getDeckJ1()[14].Jouer(-1);
		
		Joueurs.J1.Passe(Joueurs.J2);	
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 9
		
		Joueurs.J1.getDeckJ1()[0].Jouer(2);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[14].Jouer(-1);
		
		Joueurs.J1.Passe(Joueurs.J2);	
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 10
		
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[14].Jouer(-1);
		
		Joueurs.J1.Passe(Joueurs.J2);	
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		Joueurs.J2.Passe(Joueurs.J1); //Passe == Tour 11
		
		Joueurs.J1.getDeckJ1()[0].Jouer(0);
		Joueurs.J1.getDeckJ1()[10].Jouer(-1);
		Joueurs.J1.getDeckJ1()[0].Frappe(0);
		Joueurs.J1.getDeckJ1()[0].FrappeHero(Joueurs.J1, Joueurs.J2);
		Joueurs.J1.getDeckJ1()[4].Jouer(4);
		Joueurs.J1.getDeckJ1()[3].Jouer(3);
		Joueurs.J1.getDeckJ1()[5].Jouer(-1);
		Joueurs.J1.getDeckJ1()[14].Jouer(-1);
		
		Joueurs.J1.Passe(Joueurs.J2);	
		
		Joueurs.J2.getDeckJ2()[0].Jouer(0);
		Joueurs.J2.getDeckJ2()[0].Frappe(0);
		Joueurs.J2.getDeckJ2()[9].Jouer(9);
		Joueurs.J2.getDeckJ2()[0].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[9].FrappeHero(Joueurs.J2, Joueurs.J1);
		Joueurs.J2.getDeckJ2()[4].Jouer(4);
		Joueurs.J2.getDeckJ2()[3].Jouer(3);
		
		// BUG 0001 - Les cartes changent de valeures dans les deux decks lorsqu'elles sont jou�es, pioch�es ou mortes (Corrig�)
		// BUG 0002 - Ignore recul actif pour tout le monde (Corrig�)
		// BUG 0003 - Charge actif pour tout le monde (Corrig�)
		// BUG 0004 - 2 cr�atures qui n'ont pas "ingore recul" et qui frappent infligent des mauvais d�gats (NON Corrig�)
		// BUG 0005 - M�thode Jouer pour les sorts mal construite ! Les sorts �taient jou�s quelque soit le tour (Corrig�)
		//
		// Les m�thodes ont toutes besoin d'�tre n�ttoy�es ! Beaucoup de paramm�tres inutiles et tout ...
		//

		}
	}
