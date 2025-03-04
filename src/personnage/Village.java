package personnage;

public class Village {

	private String nom;
	private int nbVillageois = 0;
	private Gaulois[] villageois;
	private Gaulois chef;

	public Village(int nbMax, String nom, Gaulois chef) {
		this.nom = nom;
		this.villageois = new Gaulois[nbMax];
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		this.villageois[nbVillageois] = gaulois;
		nbVillageois++;
		gaulois.setVillage(this);
	}

	public Gaulois trouverVillageois(int indice) {
		if (indice > nbVillageois) {
			System.out.println("Il n'y a pas autant de villageois dans notre village!");
			return null;
		} else {
			return this.villageois[indice-1];
		}

	}

	public void afficherVillage(Village village) {
		for (int i = 0; i < village.nbVillageois; i++) {
			System.out.println(villageois[i]);
		}
	}
	
	public static void main(String[] args) {
		
		
	}
}
