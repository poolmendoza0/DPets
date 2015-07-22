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
public class actualizarDatos extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
				PrintWriter out= resp.getWriter();
				String usua = req.getParameter("us");
				String contr = req.getParameter("co");
				String direc = req.getParameter("di");
				String telef = req.getParameter("te");
				
				PersistenceManager pm = PMF.get().getPersistenceManager();
				Query q = pm.newQuery(Persona.class);
				
				List<Persona> personas = (List<Persona>) q.execute("");
				
				for(Persona p: personas){

					if((p.getUsername().equals(usua)) && (p.getPass().equals(contr))){
						p.setAdress(direc);
						p.setPhone(telef);
						//out.println("cambio con exito su direccion");
						RequestDispatcher rd = req.getRequestDispatcher("WEB-INF/jspUsuario/confirmar.jsp");
						rd.forward(req, resp);
					}
					else{
						//out.println("su usuario o contraseña esta mal escrito o no existe");
					}
				}
		
	}

}
