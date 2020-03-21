package web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;

import dao.IAnimalDao;
import dao.AnimalDaoImpl;
import metier.entities.Animal;

public class ControleurServlet extends HttpServlet{
 private IAnimalDao metier;
 @Override
 public void init() throws ServletException {
	 
	 metier=new AnimalDaoImpl();
 }
 protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	 String path=request.getServletPath();
	 if(path.contentEquals("/index.php"))
	 {
		 request.getRequestDispatcher("Animals.jsp").forward(request, response);

	 }
	 else if(path.equals("/chercher.php")) {
		 
		 String motCle=request.getParameter("motCle");
		 AnimalModel model=new AnimalModel();
		 model.setMotCle(motCle);
		 List<Animal> animals=metier.animalsParMC("%"+motCle+"%");
		 model.setanimals(animals);
		 request.setAttribute("model", model);
		 request.getRequestDispatcher("Animals.jsp").forward(request, response);
	 }
	 else if(path.equals("/Saisie.php")) {
		request.setAttribute("animal", new Animal());
		 request.getRequestDispatcher("SaisieAnimal.jsp").forward(request, response);

	 }
    else if(path.equals("/SaveAnimal.php")&& (request.getMethod().equals("POST"))) {
    	
		String matricule=request.getParameter("matricule") ;
		String nom=request.getParameter("nom");
		int poids=Integer.parseInt(request.getParameter("poids"));
		int nombreenfant=Integer.parseInt(request.getParameter("nombreenfant"));
		String sexe=request.getParameter("sexe");
		String race=request.getParameter("race");
		String type=request.getParameter("type");
		int nombrelactation=Integer.parseInt(request.getParameter("nombrelactation"));
		int nombrevelage=Integer.parseInt(request.getParameter("nombrevelage"));
		Animal a=metier.save(new Animal(matricule,nom,poids,nombreenfant,sexe,race,type,nombrelactation,nombrevelage));
		request.setAttribute("animal", a);
		request.getRequestDispatcher("Confirmation.jsp").forward(request, response);

	 }
    else if (path.equals("/Supprime.php")) {
    	
    	Long id=Long.parseLong(request.getParameter("id"));
    	metier.deleteAnimal(id);
		 //request.getRequestDispatcher("Animals.jsp").forward(request, response);
         response.sendRedirect("chercher.php?motCle=");
    }
 else if (path.equals("/Edit.php")) {
    	
    	Long id=Long.parseLong(request.getParameter("id"));
    	Animal a=metier.getAnimal(id);
		request.setAttribute("animal", a);
		request.getRequestDispatcher("EditAnimal.jsp").forward(request, response);

    }
 else if(path.equals("/UpdateAnimal.php")&& (request.getMethod().equals("POST"))) {
		Long id=Long.parseLong(request.getParameter("id"));
		String matricule=request.getParameter("matricule") ;
		String nom=request.getParameter("nom");
		int poids=Integer.parseInt(request.getParameter("poids"));
		int nombreenfant=Integer.parseInt(request.getParameter("nombreenfant"));
		String sexe=request.getParameter("sexe");
		String race=request.getParameter("race");
		String type=request.getParameter("type");
		int nombrelactation=Integer.parseInt(request.getParameter("nombrelactation"));
		int nombrevelage=Integer.parseInt(request.getParameter("nombrevelage"));
	Animal a=new Animal(matricule,nom,poids,nombreenfant,sexe,race,type,nombrelactation,nombrevelage);
		a.setId(id);
		metier.update(a);
		
		request.setAttribute("animal", a);
		request.getRequestDispatcher("Confirmation.jsp").forward(request, response);

	 }
	 else {
		 
		 response.sendError(Response.SC_NOT_FOUND);
	 }
 }
	 protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
	 doGet(request,response);
	 }
}

