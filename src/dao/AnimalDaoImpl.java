package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.Animal;

public class AnimalDaoImpl implements IAnimalDao {
	
	private static final String INSERT_SQL="INSERT INTO animal (matricule,nom,poids,nombreenfant,sexe,race,type,nombrelactation,nombrevelage) VALUES (?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_SQL="SELECT MAX(ID) AS MAXID FROM animal";
	private static final String SELECTFROM_SQL="SELECT * FROM animal WHERE nom LIKE ?";
	private static final String SELECTFROMANIMAL_SQL="SELECT * FROM animal WHERE ID=?";
	private static final String UPDATE_SQL="UPDATE animal SET matricule=?,nom=?,poids=?,nombreenfant=?,sexe=?,race=?,type=?,nombrelactation=?,nombrevelage=? WHERE ID=?";
	private static final String DELETE_SQL="DELETE FROM animal WHERE ID=?";

	@Override
	public Animal save(Animal a) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(INSERT_SQL);
			ps.setString(1, a.getMatricule());
			ps.setString(2, a.getNom());
			ps.setInt(3, a.getPoids());
			ps.setInt(4, a.getNombreenfant());
			ps.setString(5, a.getSexe());
			ps.setString(6, a.getRace());
			ps.setString(7, a.getType());
			ps.setInt(8, a.getNombrelactation());
			ps.setInt(9, a.getNombrevelage());
			ps.executeUpdate();
		PreparedStatement ps2=connection.prepareStatement(SELECT_SQL);
			ResultSet rs=ps2.executeQuery();
			if(rs.next()) {
				a.setId(rs.getLong("MAXID"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public List<Animal> animalsParMC(String mc) {
		List <Animal> animals=new ArrayList<Animal>();
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(SELECTFROM_SQL);
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Animal a=new Animal();
				a.setId(rs.getLong("id"));
				a.setMatricule(rs.getString("matricule"));
				a.setNom(rs.getString("nom"));
				a.setPoids(rs.getInt("poids"));
				a.setNombreenfant(rs.getInt("nombreenfant"));
				a.setSexe(rs.getString("sexe"));
				a.setRace(rs.getString("race"));
				a.setType(rs.getString("type"));
				a.setNombrelactation(rs.getInt("nombrelactation"));
				a.setNombrevelage(rs.getInt("nombrevelage"));
				animals.add(a);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return animals;
	}

	@Override
	public Animal getAnimal(Long id) {
		Animal a=null;
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(SELECTFROMANIMAL_SQL);
			ps.setLong(1, id);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
			a=new Animal();
			a.setId(rs.getLong("id"));
			a.setMatricule(rs.getString("matricule"));
			a.setNom(rs.getString("nom"));
			a.setPoids(rs.getInt("poids"));
			a.setNombreenfant(rs.getInt("nombreenfant"));
			a.setSexe(rs.getString("sexe"));
			a.setRace(rs.getString("race"));
			a.setType(rs.getString("type"));
			a.setNombrelactation(rs.getInt("nombrelactation"));
			a.setNombrevelage(rs.getInt("nombrevelage"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return a;
	}
	

	@Override
	public Animal update(Animal a) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(UPDATE_SQL);
			ps.setString(1, a.getMatricule());
			ps.setString(2, a.getNom());
			ps.setInt(3, a.getPoids());
			ps.setInt(4, a.getNombreenfant());
			ps.setString(5, a.getSexe());
			ps.setString(6, a.getRace());
			ps.setString(7, a.getType());
			ps.setInt(8, a.getNombrelactation());
			ps.setInt(9, a.getNombrevelage());
			ps.setLong(10, a.getId());
			ps.executeUpdate();
		
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public void deleteAnimal(Long id) {
		// TODO Auto-generated method stub
		Connection connection=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=connection.prepareStatement(DELETE_SQL);
			ps.setLong(1,id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
