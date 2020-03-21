package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Technique implements Serializable{
	private int idtechnique;
	private String typeentre;
	private String typesortie;
	private Date dateentre;
	private Date datesortie;
	private int prixachat;
	private int prixvente;
	private int fkanimal;
	public Technique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Technique(String typeentre, String typesortie, Date dateentre, Date datesortie, int prixachat, int prixvente,
			int fkanimal) {
		super();
		this.typeentre = typeentre;
		this.typesortie = typesortie;
		this.dateentre = dateentre;
		this.datesortie = datesortie;
		this.prixachat = prixachat;
		this.prixvente = prixvente;
		this.fkanimal = fkanimal;
	}
	public int getIdtechnique() {
		return idtechnique;
	}
	public void setIdtechnique(int idtechnique) {
		this.idtechnique = idtechnique;
	}
	public String getTypeentre() {
		return typeentre;
	}
	public void setTypeentre(String typeentre) {
		this.typeentre = typeentre;
	}
	public String getTypesortie() {
		return typesortie;
	}
	public void setTypesortie(String typesortie) {
		this.typesortie = typesortie;
	}
	public Date getDateentre() {
		return dateentre;
	}
	public void setDateentre(Date dateentre) {
		this.dateentre = dateentre;
	}
	public Date getDatesortie() {
		return datesortie;
	}
	public void setDatesortie(Date datesortie) {
		this.datesortie = datesortie;
	}
	public int getPrixachat() {
		return prixachat;
	}
	public void setPrixachat(int prixachat) {
		this.prixachat = prixachat;
	}
	public int getPrixvente() {
		return prixvente;
	}
	public void setPrixvente(int prixvente) {
		this.prixvente = prixvente;
	}
	public int getFkanimal() {
		return fkanimal;
	}
	public void setFkanimal(int fkanimal) {
		this.fkanimal = fkanimal;
	}

}
