package test;

import static org.junit.Assert.*;

import org.junit.Test;

import pack.Creatures;
import pack.Joueurs;
import pack.Plateau;

public class TestCreatures {

	@Test
	public void testMeurt() {
		Plateau.setEnJeu(true); //Le plateau est en jeu
		Plateau.setNbreCreatures(1); //Plateau avec 1 cr�ature

		((Creatures) Joueurs.J1.getDeckJ1()[0]).setVie(0); //La cr�ature n'a plus de vie
		((Creatures) Joueurs.J1.getDeckJ1()[0]).Meurt(Joueurs.J1); //Elle DOIT mourir
		
		int j = 0; //Etat de la cr�ature apr�s la mort et nombre de cr�atures voulues sur le plateau
		assertSame("Should be the same", j,  Plateau.getNbreCreatures()); //Le plateau contient 0 cr�atures si elle est vraiment morte
		assertSame("Should be the same", j, ((Creatures) Joueurs.J1.getDeckJ1()[0]).getEtat()); //L'�tat est � z�ro
		
		/**
		 * Si la cr�ature est vraiment morte, le plateau contiendra une cr�ature en moins. La cr�atures DOIT passer � l'�tat "mort" = 0
		 * 
		 */
	}

}
