package metier.entities;

import java.io.Serializable;

public class Batiment implements Serializable{
	private int idbatiment;
	private String nom;
	private int nombre;
	public Batiment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Batiment(String nom, int nombre) {
		super();
		this.nom = nom;
		this.nombre = nombre;
	}
	public int getIdbatiment() {
		return idbatiment;
	}
	public void setIdbatiment(int idbatiment) {
		this.idbatiment = idbatiment;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

}
