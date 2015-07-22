package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bing.Medicina;

@SuppressWarnings("serial")
public class medicinaBorrar extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nom")!=null ){
			String nombre = req.getParameter("nom");
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Medicina.class);
			q.setFilter("nom == nomParam");
			q.declareParameters("String nomParam");	
			try{
				q.deletePersistentAll(nombre);
				
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaMedicamentos.jsp")).forward(req,resp);
			}catch(Exception e){
					System.out.println(e);
					(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaMedicamentos.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaMedicamentos.jsp")).forward(req,resp);
		}		
	}
}