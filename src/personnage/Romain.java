package personnage;

public class Romain {
	private String nom;
	private int force = 5;

	public String getNom() {
		return nom;
	}

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public void recevoirCoup(int coup) {
		force -= coup;
		if (force < 1) {
			System.out.println(prendreParole() + "J'abandonne !");
		} else {
			System.out.println(prendreParole() + "A�e !");
		}
	}

	public void parler(String texte) {
		System.out.println((prendreParole() + "\"" + texte + "\""));
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
}
