package dao;

import metier.entities.Animal;

public class TestDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       AnimalDaoImpl dao=new AnimalDaoImpl();
      
       Animal a1=dao.save(new Animal("TN5041280","COW 102",7,3, "F", "Tunisinne", "Laitier", 3, 1));
      
      //System.out.println(a1.toString());
  
      
	}

}
