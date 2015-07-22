package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import bing.Persona;

@SuppressWarnings("serial")
public class Recuperar extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query q = pm.newQuery(Persona.class);

		String nombre = req.getParameter("nombreusuario");
		int ndni = Integer.parseInt(req.getParameter("numerodni"));

		
		List<Persona> personas = (List<Persona>) q.execute("");
		
		for(Persona p: personas){

			if((p.getUsername().equals(nombre)) && (p.getDni()==(ndni))){
				//out.println(p.getUsername());
				//out.println(p.getPass());
				req.setAttribute("cliente", p);
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/Contrasenia.jsp");
				rd.forward(req, resp);
			}
		}
		
	}
	
}