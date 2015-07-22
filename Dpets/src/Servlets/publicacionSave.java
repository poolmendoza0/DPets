package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import bing.Publicacion;

@SuppressWarnings("serial")
public class publicacionSave extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();

		String nombr = req.getParameter("admin");
		int numer = Integer.parseInt(req.getParameter("nume"));
		String pdoctor = req.getParameter("pdoc");
		String publicacion = req.getParameter("pub");
		
		Publicacion p = new Publicacion(nombr,numer,pdoctor,publicacion);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionVeter.jsp")).forward(req,resp);
		}catch(Exception e){
			System.out.println(e);
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionVeter.jsp")).forward(req,resp);
			}finally{
			pm.close();
		}
	}
}