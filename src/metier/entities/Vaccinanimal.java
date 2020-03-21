package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Vaccinanimal implements Serializable{
	private int idvaccin;
	private String nom;
	private String description;
	private Date date;
	private int fkanimal;
	private int fkpersonne;
	private int fkvaccin;
	public Vaccinanimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccinanimal(String nom, String description, Date date, int fkanimal, int fkpersonne, int fkvaccin) {
		super();
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.fkanimal = fkanimal;
		this.fkpersonne = fkpersonne;
		this.fkvaccin = fkvaccin;
	}
	public int getIdvaccin() {
		return idvaccin;
	}
	public void setIdvaccin(int idvaccin) {
		this.idvaccin = idvaccin;
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
	public int getFkvaccin() {
		return fkvaccin;
	}
	public void setFkvaccin(int fkvaccin) {
		this.fkvaccin = fkvaccin;
	}

}
