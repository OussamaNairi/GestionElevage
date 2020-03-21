package dao;

import java.util.List;
import metier.entities.Animal;

public interface IAnimalDao {

	public Animal save(Animal a);

	public List<Animal> animalsParMC(String mc);

	
	public Animal getAnimal(Long id);

	public Animal update(Animal a);

	public void deleteAnimal(Long id);

}
