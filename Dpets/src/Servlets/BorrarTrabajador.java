package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bing.Trabajador;

@SuppressWarnings("serial")
public class BorrarTrabajador extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nombre")!=null ){
			String nombre = req.getParameter("nombre");
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Trabajador.class);
			q.setFilter("nombre == nombreParam");
			q.declareParameters("String nombreParam");	
			try{
				q.deletePersistentAll(nombre);
				
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaTrabajador.jsp")).forward(req,resp);
			}catch(Exception e){
					System.out.println(e);
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