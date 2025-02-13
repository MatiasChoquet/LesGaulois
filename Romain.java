
public class Romain {
	private String nom;
	private int force;

	public String getNom() {
		return nom;
	}
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public void parler(String texte) {
		System.out.println((prendreParole() + "\"" + texte + "\"");
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
}
