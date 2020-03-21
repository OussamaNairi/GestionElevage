package metier.entities;

import java.io.Serializable;

public class Mere implements Serializable {
	private int idmere;
	private int fkmere;
	public Mere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mere(int fkmere) {
		super();
		this.fkmere = fkmere;
	}
	public int getIdmere() {
		return idmere;
	}
	public void setIdmere(int idmere) {
		this.idmere = idmere;
	}
	public int getFkmere() {
		return fkmere;
	}
	public void setFkmere(int fkmere) {
		this.fkmere = fkmere;
	}

}
