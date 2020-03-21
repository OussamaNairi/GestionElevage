package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Maladie implements Serializable{
	private int idmaladie;
	private String nom;
	private Date date;
	private String description;
	private int fkanimal;
	private int fkpersonne;
	public Maladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Maladie(String nom, Date date, String description, int fkanimal, int fkpersonne) {
		super();
		this.nom = nom;
		this.date = date;
		this.description = description;
		this.fkanimal = fkanimal;
		this.fkpersonne = fkpersonne;
	}
	public int getIdmaladie() {
		return idmaladie;
	}
	public void setIdmaladie(int idmaladie) {
		this.idmaladie = idmaladie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getFkanimal() {
		return fkanimal;
	}
	public void setFkanimal(int fkanimal) {
		this.fkanimal = fkanimal;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}

}
