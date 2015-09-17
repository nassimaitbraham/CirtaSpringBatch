package com.aitech.cirta.model;

/**
 * Model representant la table des user
 * 
 * @author Nassim AIT BRAHAM
 *
 */
public class Users {

	/**
	 *
	 * Attribut ( Varriables d'instance)
	 */

	private int id;
	private String nom;
	private String prenom;
	private String addresse;

	/**
	 * 
	 * Getters et Setters
	 * 
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	/**
	 * Methode toString pour afficher une description de l'objet
	 * 
	 * @return String
	 */
	public String toString() {

		return " [id = " + id + " , Nom = " + nom + " , Prenom = " + prenom + " , addresse = " + addresse + "]";
	}

}
