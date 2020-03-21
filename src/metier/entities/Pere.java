package metier.entities;

import java.io.Serializable;

public class Pere implements Serializable {
	private int idpere;
	private int fkidpere;
	public Pere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pere(int fkidpere) {
		super();
		this.fkidpere = fkidpere;
	}
	public int getIdpere() {
		return idpere;
	}
	public void setIdpere(int idpere) {
		this.idpere = idpere;
	}
	public int getFkidpere() {
		return fkidpere;
	}
	public void setFkidpere(int fkidpere) {
		this.fkidpere = fkidpere;
	}

}
