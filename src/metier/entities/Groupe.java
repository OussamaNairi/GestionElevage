package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Groupe implements Serializable{
	private int idgroupe;
	private String nom;
	private String description;
	private Date datecreation;
	private String typealimentation;
	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Groupe(String nom, String description, Date datecreation, String typealimentation) {
		super();
		this.nom = nom;
		this.description = description;
		this.datecreation = datecreation;
		this.typealimentation = typealimentation;
	}
	public int getIdgroupe() {
		return idgroupe;
	}
	public void setIdgroupe(int idgroupe) {
		this.idgroupe = idgroupe;
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
	public Date getDatecreation() {
		return datecreation;
	}
	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	public String getTypealimentation() {
		return typealimentation;
	}
	public void setTypealimentation(String typealimentation) {
		this.typealimentation = typealimentation;
	}
	

}
