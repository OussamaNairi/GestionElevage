package metier.entities;

import java.io.Serializable;

public class Eleveur implements Serializable{
	private int ideleveur;
	private String nomfirme;
	private String adressefirme;
	private String formejuridique;
	private int fkpersonne;
	public Eleveur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eleveur(String nomfirme, String adressefirme, String formejuridique, int fkpersonne) {
		super();
		this.nomfirme = nomfirme;
		this.adressefirme = adressefirme;
		this.formejuridique = formejuridique;
		this.fkpersonne = fkpersonne;
	}
	public int getIdeleveur() {
		return ideleveur;
	}
	public void setIdeleveur(int ideleveur) {
		this.ideleveur = ideleveur;
	}
	public String getNomfirme() {
		return nomfirme;
	}
	public void setNomfirme(String nomfirme) {
		this.nomfirme = nomfirme;
	}
	public String getAdressefirme() {
		return adressefirme;
	}
	public void setAdressefirme(String adressefirme) {
		this.adressefirme = adressefirme;
	}
	public String getFormejuridique() {
		return formejuridique;
	}
	public void setFormejuridique(String formejuridique) {
		this.formejuridique = formejuridique;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}
	

}
