package metier.entities;

import java.io.Serializable;

public class Veterinaire implements Serializable{
	private int idveterinaire;
	private String type;
	private String matricule;
	private int prixconsultation;
	private int fkpersonne;
	public Veterinaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Veterinaire(String type, String matricule, int prixconsultation, int fkpersonne) {
		super();
		this.type = type;
		this.matricule = matricule;
		this.prixconsultation = prixconsultation;
		this.fkpersonne = fkpersonne;
	}
	public int getIdveterinaire() {
		return idveterinaire;
	}
	public void setIdveterinaire(int idveterinaire) {
		this.idveterinaire = idveterinaire;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public int getPrixconsultation() {
		return prixconsultation;
	}
	public void setPrixconsultation(int prixconsultation) {
		this.prixconsultation = prixconsultation;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}

}
