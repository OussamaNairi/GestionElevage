package metier.entities;

import java.io.Serializable;

public class Administrateur implements Serializable{
	
	private int idadministrateur;
	private String role;
	private String description;
	private int kfpersonne;
	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Administrateur(String role, String description, int kfpersonne) {
		super();
		
		this.role = role;
		this.description = description;
		this.kfpersonne = kfpersonne;
	}
	public int getIdadministrateur() {
		return idadministrateur;
	}
	public void setIdadministrateur(int idadministrateur) {
		this.idadministrateur = idadministrateur;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getKfpersonne() {
		return kfpersonne;
	}
	public void setKfpersonne(int kfpersonne) {
		this.kfpersonne = kfpersonne;
	}

}
