package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Personne implements Serializable{
	private int idpersonne;
	private String nom;
	private String prenom;
	private Date datenaissance;
	private String telephone;
	private String adresse;
	private String email;
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Personne(String nom, String prenom, Date datenaissance, String telephone, String adresse, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
	}
	public int getIdpersonne() {
		return idpersonne;
	}
	public void setIdpersonne(int idpersonne) {
		this.idpersonne = idpersonne;
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
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
