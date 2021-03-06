package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bing.Persona;

@SuppressWarnings("serial")
public class BorrarUsuario extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		String username = req.getParameter("username");
		if( req.getParameter("username")!=null){
			
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Persona.class);
			q.setFilter("username == usuarioParam");
			q.declareParameters("String usuarioParam");	
				
			try{
				q.deletePersistentAll(username);
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/usuarioBorrar.jsp")).forward(req,resp);
			
			}catch(Exception e){
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp")).forward(req,resp);
		}		
	}
}