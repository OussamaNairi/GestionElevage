package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Traitementmaladie implements Serializable {
	private int idtraitement;
	private Date date;
	private int fkmedicament;
	private int fkmaladie;
	public Traitementmaladie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Traitementmaladie(Date date, int fkmedicament, int fkmaladie) {
		super();
		this.date = date;
		this.fkmedicament = fkmedicament;
		this.fkmaladie = fkmaladie;
	}
	public int getIdtraitement() {
		return idtraitement;
	}
	public void setIdtraitement(int idtraitement) {
		this.idtraitement = idtraitement;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getFkmedicament() {
		return fkmedicament;
	}
	public void setFkmedicament(int fkmedicament) {
		this.fkmedicament = fkmedicament;
	}
	public int getFkmaladie() {
		return fkmaladie;
	}
	public void setFkmaladie(int fkmaladie) {
		this.fkmaladie = fkmaladie;
	}

}
