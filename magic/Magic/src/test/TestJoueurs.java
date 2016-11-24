package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pack.Joueurs;
import pack.Plateau;

public class TestJoueurs {

	@Test
	public void testMeurt() {
		Plateau.setEnJeu(true); //La plateau EST en jeu
		Joueurs.J1.setVie(0); //Le joueur 1 n'a plus de vie
		Joueurs.J1.Meurt(); //Le joueur DOIT mourir
		
		assertFalse("Fail", Plateau.isEnJeu()); //Le plateau ne doit PAS �tre en jeu
		
		/**
		 * Si le joueur est vraiment mort, le plateau ne doit PAS �tre en jeu, donc le test DOIT marcher
		 * 
		 */
	}
	
	@Test
	public void testPioche(){
		Plateau.setEnJeu(true); //Le plateau EST en jeu
		
		int nbre = 1; //Nombre de cartes voulues
		Joueurs.J1.setNombreCartes(0); //Z�ro cartes dans la main
		Joueurs.J1.Pioche(); //On en pioche une
		
		assertSame("Should be the same", nbre, Joueurs.J1.getNombreCartes()); //DONC on doit avoir UNE carte
		
		/**
		 * 
		 * Si le joueur a vraiment pioch� une carte, le test DOIT fonctionner
		 * 
		 */

	}
	@Test
	public void testPasse(){
		Plateau.setEnJeu(true); //Le plateau EST en jeu
		Joueurs.J1.setJoue(true); //Le joueur 1 joue
		
		Joueurs.J1.Passe(Joueurs.J2);
		
		assertTrue("Le joueur 2 DOIT jouer", Joueurs.J2.isJoue());
		
		/**
		 * 
		 * Si le joueur 1 a vraiment pass� la main au joueur 2, le joueur 2 DOIT jouer, et le test DOIT fonctionner
		 */
	}

}
