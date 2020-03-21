package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Vitamineanimal implements Serializable{
	private int idvitamine;
	private String nom;
	private String description;
	private Date date;
	private int fkanimal;
	private int fkpersonne;
	private int fkvitamine;
	public Vitamineanimal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vitamineanimal(String nom, String description, Date date, int fkanimal, int fkpersonne, int fkvitamine) {
		super();
		this.nom = nom;
		this.description = description;
		this.date = date;
		this.fkanimal = fkanimal;
		this.fkpersonne = fkpersonne;
		this.fkvitamine = fkvitamine;
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
	public int getFkvitamine() {
		return fkvitamine;
	}
	public void setFkvitamine(int fkvitamine) {
		this.fkvitamine = fkvitamine;
	}

}
