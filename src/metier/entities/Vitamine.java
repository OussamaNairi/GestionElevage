package metier.entities;

import java.io.Serializable;

public class Vitamine implements Serializable{
	private int idvitamine;
    private String nom;
    private String traitement;
    private int stock;
    private int fkpersonne;
	public Vitamine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vitamine(String nom, String traitement, int stock, int fkpersonne) {
		super();
		this.nom = nom;
		this.traitement = traitement;
		this.stock = stock;
		this.fkpersonne = fkpersonne;
	}
	public int getIdvitamine() {
		return idvitamine;
	}
	public void setIdvitamine(int idvitamine) {
		this.idvitamine = idvitamine;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTraitement() {
		return traitement;
	}
	public void setTraitement(String traitement) {
		this.traitement = traitement;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}
}
