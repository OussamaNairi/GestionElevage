package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Poids implements Serializable{
	private int idpoids;
	private int valeur;
	private Date date;
	private int ecart;
	private int fkanimal;
	public Poids() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Poids(int valeur, Date date, int ecart, int fkanimal) {
		super();
		this.valeur = valeur;
		this.date = date;
		this.ecart = ecart;
		this.fkanimal = fkanimal;
	}
	public int getIdpoids() {
		return idpoids;
	}
	public void setIdpoids(int idpoids) {
		this.idpoids = idpoids;
	}
	public int getValeur() {
		return valeur;
	}
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getEcart() {
		return ecart;
	}
	public void setEcart(int ecart) {
		this.ecart = ecart;
	}
	public int getFkanimal() {
		return fkanimal;
	}
	public void setFkanimal(int fkanimal) {
		this.fkanimal = fkanimal;
	}

}
