package personnage;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;

	public String getNom() {
		return nom;
	}

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void parler(String texte) {
		System.out.println((prendreParole() + "\"" + texte + "\""));
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void boirePotion(int forcePotion) {
		effetPotion += forcePotion;
	}

	@Override
	public String toString() {
		return "Astérix";
	}

	public void frapper(Romain romain) {
		String nomRomain = romain.getNom();
		System.out.println(nom + " envoi un grand coup dans la mâchoire de " + nomRomain);
		int forcecoup = force * effetPotion / 3;
		if (effetPotion > 1) {
			effetPotion--;
		}
		romain.recevoirCoup(forcecoup);
	}

	public void setVillage(Village village) {
		this.village = village;
	}

	public static void main(String[] arg) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
	}
}
