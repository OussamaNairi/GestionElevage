package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Quantitelait implements Serializable{
	private int idlait;
	private Date date;
	private int quantite;
	private String etat;
	private int laitcollecter;
	private int laitdetruire;
	private int fkanimal;
	public Quantitelait() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Quantitelait(Date date, int quantite, String etat, int laitcollecter, int laitdetruire, int fkanimal) {
		super();
		this.date = date;
		this.quantite = quantite;
		this.etat = etat;
		this.laitcollecter = laitcollecter;
		this.laitdetruire = laitdetruire;
		this.fkanimal = fkanimal;
	}
	public int getIdlait() {
		return idlait;
	}
	public void setIdlait(int idlait) {
		this.idlait = idlait;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public int getLaitcollecter() {
		return laitcollecter;
	}
	public void setLaitcollecter(int laitcollecter) {
		this.laitcollecter = laitcollecter;
	}
	public int getLaitdetruire() {
		return laitdetruire;
	}
	public void setLaitdetruire(int laitdetruire) {
		this.laitdetruire = laitdetruire;
	}
	public int getFkanimal() {
		return fkanimal;
	}
	public void setFkanimal(int fkanimal) {
		this.fkanimal = fkanimal;
	}

}
