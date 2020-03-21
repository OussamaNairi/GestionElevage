package metier.entities;

import java.io.Serializable;



public class Animal implements Serializable{
  private Long id;
  private String matricule;
  private String nom;
  private int poids;
  private int nombreenfant;
  private String sexe;
  private String race;
  private String type;
  private int nombrelactation;
  private int nombrevelage;
public Animal() {
	super();
	// TODO Auto-generated constructor stub
}

public Animal(String matricule, String nom, int poids, int nombreenfant, String sexe, String race, String type,
		int nombrelactation, int nombrevelage) {
	super();
	this.matricule = matricule;
	this.nom = nom;
	this.poids = poids;
	this.nombreenfant = nombreenfant;
	this.sexe = sexe;
	this.race = race;
	this.type = type;
	this.nombrelactation = nombrelactation;
	this.nombrevelage = nombrevelage;
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMatricule() {
	return matricule;
}
public void setMatricule(String matricule) {
	this.matricule = matricule;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getPoids() {
	return poids;
}
public void setPoids(int poids) {
	this.poids = poids;
}
public int getNombreenfant() {
	return nombreenfant;
}
public void setNombreenfant(int nombreenfant) {
	this.nombreenfant = nombreenfant;
}
public String getSexe() {
	return sexe;
}
public void setSexe(String sexe) {
	this.sexe = sexe;
}
public String getRace() {
	return race;
}
public void setRace(String race) {
	this.race = race;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getNombrelactation() {
	return nombrelactation;
}
public void setNombrelactation(int nombrelactation) {
	this.nombrelactation = nombrelactation;
}
public int getNombrevelage() {
	return nombrevelage;
}
public void setNombrevelage(int nombrevelage) {
	this.nombrevelage = nombrevelage;
}


@Override
public String toString() {
	return "Animal [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", poids=" + poids + ", nombreenfant="
			+ nombreenfant + ", sexe=" + sexe + ", race=" + race + ", type=" + type + ", nombrelactation="
			+ nombrelactation + ", nombrevelage=" + nombrevelage + "]";
}

  

}