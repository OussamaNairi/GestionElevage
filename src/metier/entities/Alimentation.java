package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Alimentation implements Serializable {
	private int idalimentation;
	private String description;
	private Date datedebut;
	private Date datefin;
	private int frequence;
	private String unite;
	private int stock;
	private int fkpersonne;
	public Alimentation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alimentation(int idalimentation, String description, Date datedebut, Date datefin, int frequence,
			String unite, int stock, int fkpersonne) {
		super();
		this.idalimentation = idalimentation;
		this.description = description;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.frequence = frequence;
		this.unite = unite;
		this.stock = stock;
		this.fkpersonne = fkpersonne;
	}
	public int getIdalimentation() {
		return idalimentation;
	}
	public void setIdalimentation(int idalimentation) {
		this.idalimentation = idalimentation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
