package metier.entities;

import java.io.Serializable;

public class Partenaire implements Serializable{
	private int idpartenaire;
	private String nomsociete;
	private String adressephysique;
	private String description;
	private int fkpersonne;
	public Partenaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Partenaire(String nomsociete, String adressephysique, String description, int fkpersonne) {
		super();
		this.nomsociete = nomsociete;
		this.adressephysique = adressephysique;
		this.description = description;
		this.fkpersonne = fkpersonne;
	}
	public int getIdpartenaire() {
		return idpartenaire;
	}
	public void setIdpartenaire(int idpartenaire) {
		this.idpartenaire = idpartenaire;
	}
	public String getNomsociete() {
		return nomsociete;
	}
	public void setNomsociete(String nomsociete) {
		this.nomsociete = nomsociete;
	}
	public String getAdressephysique() {
		return adressephysique;
	}
	public void setAdressephysique(String adressephysique) {
		this.adressephysique = adressephysique;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}

}
