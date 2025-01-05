import java.io.*;
public abstract class Joueur {

	private String nom;
	private Plateau plateau;
	private int frappesTotales;
	private int frappesReussies;
	private int bateauxCoules;
	private Case derniereCaseFrappee;
	private BufferedReader reader;

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * @param plateau
	 */
	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public int getFrappesTotales() {
		return this.frappesTotales;
	}

	/**
	 * 
	 * @param frappesTotales
	 */
	public void setFrappesTotales(int frappesTotales) {
		this.frappesTotales = frappesTotales;
	}

	public int getFrappesReussies() {
		return this.frappesReussies;
	}

	/**
	 * 
	 * @param frappesReussies
	 */
	public void setFrappesReussies(int frappesReussies) {
		this.frappesReussies = frappesReussies;
	}

	public int getBateauxCoules() {
		return this.bateauxCoules;
	}

	/**
	 * 
	 * @param bateauxCoules
	 */
	public void setBateauxCoules(int bateauxCoules) {
		this.bateauxCoules = bateauxCoules;
	}

	public Case getDerniereCaseFrappee() {
		return this.derniereCaseFrappee;
	}

	/**
	 * 
	 * @param derniereCaseFrappee
	 */
	public void setDerniereCaseFrappee(Case derniereCaseFrappee) {
		this.derniereCaseFrappee = derniereCaseFrappee;
	}

	public BufferedReader getReader() {
		return this.reader;
	}

	public Plateau getPlateau() {
		return this.plateau;
	}

	/**
	 * 
	 * @param reader
	 */
	public void setReader(BufferedReader reader) {
		this.reader = reader;
	}

	public void incrementerFrapperTotales() {
		// TODO - implement Joueur.incrementerFrapperTotales
		throw new UnsupportedOperationException();
	}

	public void incrementerFrapperReussies() {
		// TODO - implement Joueur.incrementerFrapperReussies
		throw new UnsupportedOperationException();
	}

	public void incrementerBateauxCoules() {
		// TODO - implement Joueur.incrementerBateauxCoules
		throw new UnsupportedOperationException();
	}

	public String recapStatJoueur() {
		// TODO - implement Joueur.recapStatJoueur
		throw new UnsupportedOperationException();
	}

	protected void placerBateaux() {
		// TODO - implement Joueur.placerBateaux
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Adversaire
	 */
	protected Case tirerSurAdversaire(Joueur Adversaire) {
		// TODO - implement Joueur.tirerSurAdversaire
		throw new UnsupportedOperationException();
	}

	protected void initialiserNom() {
		// TODO - implement Joueur.initialiserNom
		throw new UnsupportedOperationException();
	}

}