package web;

import java.util.ArrayList;

import java.util.List;

import metier.entities.Animal;


public class AnimalModel {
	
	private String motCle;
	private List<Animal> animals = new ArrayList<Animal>();
	
	
	
	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setanimals(List<Animal> animals) {
		this.animals = animals;
	}

}
