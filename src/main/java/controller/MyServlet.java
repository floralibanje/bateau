package controller;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Bateau;
import repository.bateauRepo;

/**
 * Servlet implementation class MyServlet
 */

@WebServlet("/heure")//equivalent  un mapping morceau de chemin qui va se rajouter au contexte de notre application
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LocalTime heure= LocalTime.now();
		//Bateau bat = new Bateau("Titanic");
		List<String> bateaux = bateauRepo.findAll();
		response.getWriter()
			.append("<div>Horloge parlante: ")
			.append(heure.toString())//renvoi que du texte
			.append("<div></div>")
			.append(bateaux.toString())
			.append("</div");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
