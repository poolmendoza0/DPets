 package Servlets;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import bing.Consulta;

@SuppressWarnings("serial")
public class SaveConsulta extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException{
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		
		String correo = req.getParameter("correo");
		String consulta = req.getParameter("consulta");
		
		Consulta p = new Consulta(nombre,apellido,correo,consulta);
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query q = pm.newQuery(Consulta.class);
		pm.makePersistent(p);
		
		try{
			if( req.getParameter("nombre")!=null  ){
			
			@SuppressWarnings("unchecked")
			List<Consulta> consultas = (List<Consulta>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("consultas", consultas);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/confirmar.jsp");
			rd.forward(req, resp);
			}
			
			else{
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/jsp/error.jsp");
				rd.forward(req, resp);
			}
		
		}catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		
	
	}
		
		
}