package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Alimentationanimal implements Serializable{
	private int idanimal;
	private String nom;
	private String description;
	private Date date;
	private int fkanimal;
	private int fkpersonne;
	private int fkalimentation;
	public Alimentationanimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alimentationanimal(String nom, String description, Date date, int fkanimal, int fkpersonne,
			int fkalimentation) {
		super();
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.fkanimal = fkanimal;
		this.fkpersonne = fkpersonne;
		this.fkalimentation = fkalimentation;
	}
	public int getIdanimal() {
		return idanimal;
	}
	public void setIdanimal(int idanimal) {
		this.idanimal = idanimal;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
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
	public int getFkalimentation() {
		return fkalimentation;
	}
	public void setFkalimentation(int fkalimentation) {
		this.fkalimentation = fkalimentation;
	}

}
