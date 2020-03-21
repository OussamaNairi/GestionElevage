package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Vaccin implements Serializable{
	private int idvaccin;
	private String nom;
	private Date datedebut;
	private Date datefin;
	private String description;
	private int stock;
	private int fkpersonne;
	public Vaccin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vaccin(String nom, Date datedebut, Date datefin, String description, int stock, int fkpersonne) {
		super();
		this.nom = nom;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.description = description;
		this.stock = stock;
		this.fkpersonne = fkpersonne;
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
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
