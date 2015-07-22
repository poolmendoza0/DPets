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
public class cambiarContrasenia extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
				PrintWriter out= resp.getWriter();
				String usuariovihuar = req.getParameter("u");
				String c1vihuar = req.getParameter("c1");
				String c2vihuar = req.getParameter("c2");
				
				PersistenceManager pm = PMF.get().getPersistenceManager();
				Query q = pm.newQuery(Persona.class);
				
				List<Persona> personas = (List<Persona>) q.execute("");
				
				for(Persona p: personas){

					if((p.getUsername().equals(usuariovihuar)) && (p.getPass().equals(c1vihuar))){
						p.setPass(c2vihuar);
						//out.println("cambio con exito su contraseña");
						RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/jspUsuario/confirmar.jsp");
						rd.forward(req, resp);
					}
					else{
						
					}
				}
		
	}

}
