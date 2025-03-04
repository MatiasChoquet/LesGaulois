package test_fonctionnel;

import personnage.*;

public class testGaulois {

	public static void main(String[] arg) {
		/* Gaulois asterix = new Gaulois("Astérix", 8); 
		 * Gaulois obelix = new Gaulois("Obélix", 16);
		 * Romain brutus = new Romain("Brutus", 14); 
		 * Druide panoramix = new Druide("Panoramix", 2);
		 * Romain minuus = new Romain("Minuus",6);
		 * 
		 * asterix.parler("Bonjour Obélix"); obelix.
		 * parler("Bonjours Astérix. Ca te dirait d'aller chasser des sangliers ?");
		 * asterix.parler("Oui très bonne idée");
		 * 
		 * panoramix.fabriquerPotion(4, 3); 
		 * panoramix.booster(obelix);
		 * panoramix.booster(asterix);
		 * 
		 * 
		 * for (int i = 0; i<3;i++) { asterix.frapper(brutus); }
		 */
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Gaulois chef = abraracourcix;
		Village village = new Village(30, "Le village des Irréductibles", abraracourcix);
		Gaulois asterix = new Gaulois("Astérix", 8);
		village.ajouterVillageois(asterix);
		Gaulois gaulois = village.trouverVillageois(1);
		System.out.println(gaulois);
		gaulois = village.trouverVillageois(2);
		System.out.println(gaulois);
		
		
		
	}

}
