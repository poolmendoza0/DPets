package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import bing.Sugerencia;

@SuppressWarnings("serial")
public class sugerenciaBorrar extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("num")!=null ){
			int numero = Integer.parseInt(req.getParameter("num"));
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Sugerencia.class);
			q.setFilter("num == numParam");
			q.declareParameters("int numParam");	
			try{
				q.deletePersistentAll(numero);
				
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaSugerencia.jsp")).forward(req,resp);
			}catch(Exception e){
					System.out.println(e);
					(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaSugerencia.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaSugerencia.jsp")).forward(req,resp);
		}		
	}
}