package personnage;

public class Druide {
	private String nom;
	private int force;
	private Chaudron chaudron = new Chaudron();
	
	public Druide(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println((prendreParole() + "\"" + texte + "\""));
	}
	
	private String prendreParole() {
		return "Le Druide " + nom + " : ";
	}
	
	public String getNom() {
		return nom;
	}
	
	public void fabriquerPotion(int quantite, int forcePotion) {
		System.out.println(prendreParole() + "J'ai concocté " + quantite + " potion(s) magique(s). Elle(s) a(ont) une force de " + forcePotion);
		chaudron.remplirChaudron(3, 4);
	}
	
	public void booster(Gaulois gaulois) {
		String nom = gaulois.getNom();
		if (chaudron.resterPotion()) {
			if ("Obélix".equals(nom)) {
				parler("Non " + nom + "  Non ! Et tu le sais très bien !");
			}else {
				int forcePotion = chaudron.prendreLouche();
				gaulois.boirePotion(forcePotion);
				parler("Tiens " + nom + " tu prendrais bien un peu de potion");
			}
			
		}else {
			parler("Désolé je n'ai plus aucune goutte de potion");
		}
	}
}
