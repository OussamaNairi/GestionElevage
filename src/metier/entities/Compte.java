package metier.entities;

import java.io.Serializable;
import java.util.Date;

public class Compte implements Serializable{
	private int idcompte;
	private String username;
	private String password;
	private Date dateinscription;
	private int fkpersonne;
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String username, String password, Date dateinscription, int fkpersonne) {
		super();
		this.username = username;
		this.password = password;
		this.dateinscription = dateinscription;
		this.fkpersonne = fkpersonne;
	}
	public int getIdcompte() {
		return idcompte;
	}
	public void setIdcompte(int idcompte) {
		this.idcompte = idcompte;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateinscription() {
		return dateinscription;
	}
	public void setDateinscription(Date dateinscription) {
		this.dateinscription = dateinscription;
	}
	public int getFkpersonne() {
		return fkpersonne;
	}
	public void setFkpersonne(int fkpersonne) {
		this.fkpersonne = fkpersonne;
	}

}
