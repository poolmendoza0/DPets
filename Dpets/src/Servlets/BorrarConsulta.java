package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bing.Consulta;


@SuppressWarnings("serial")
public class BorrarConsulta extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		String nombre = req.getParameter("nombre");
		if( req.getParameter("nombre")!=null){
			
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Consulta.class);
			q.setFilter("nombre == nombreParam");
			q.declareParameters("int nombreParam");	
				
			try{
				q.deletePersistentAll(nombre);
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaConsulta.jsp")).forward(req,resp);
			
			}catch(Exception e){
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaConsulta.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaConsulta.jsp")).forward(req,resp);
		}		
	}
}