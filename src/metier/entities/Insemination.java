package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Insemination implements Serializable{
	private int idinsemination;
	private Date date;
	private Date dateresultat;
	private String resultat;
	private int fkanimal;
	public Insemination() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Insemination(Date date, Date dateresultat, String resultat, int fkanimal) {
		super();
		this.date = date;
		this.dateresultat = dateresultat;
		this.resultat = resultat;
		this.fkanimal = fkanimal;
	}
	public int getIdinsemination() {
		return idinsemination;
	}
	public void setIdinsemination(int idinsemination) {
		this.idinsemination = idinsemination;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getDateresultat() {
		return dateresultat;
	}
	public void setDateresultat(Date dateresultat) {
		this.dateresultat = dateresultat;
	}
	public String getResultat() {
		return resultat;
	}
	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	public int getFkanimal() {
		return fkanimal;
	}
	public void setFkanimal(int fkanimal) {
		this.fkanimal = fkanimal;
	}

}
