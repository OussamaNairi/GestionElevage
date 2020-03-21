package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Medicament implements Serializable{
	private int idmedicament;
	private String nom;
	private Date datedebut;
	private Date datefin;
	private String description;
	private int frequence;
	private String unite;
	private int stock;
	private int fkpersonne;
	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicament(String nom, Date datedebut, Date datefin, String description, int frequence, String unite,
			int stock, int fkpersonne) {
		super();
		this.nom = nom;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.description = description;
		this.frequence = frequence;
		this.unite = unite;
		this.stock = stock;
		this.fkpersonne = fkpersonne;
	}
	public int getIdmedicament() {
		return idmedicament;
	}
	public void setIdmedicament(int idmedicament) {
		this.idmedicament = idmedicament;
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
	public int getFrequence() {
		return frequence;
	}
	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
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
