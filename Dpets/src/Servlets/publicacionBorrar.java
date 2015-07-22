package Servlets;


import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bing.Publicacion;

@SuppressWarnings("serial")
public class publicacionBorrar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nume")!=null ){
			int numer = Integer.parseInt(req.getParameter("nume"));
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Publicacion.class);
			q.setFilter("nume == numeParam");
			q.declareParameters("int numeParam");	
			try{
				q.deletePersistentAll(numer);
				
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionBorrar.jsp")).forward(req,resp);
			}catch(Exception e){
					System.out.println(e);
					(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionBorrar.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionBorrar.jsp")).forward(req,resp);
		}		
	}
}