package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import bing.Sugerencia;

@SuppressWarnings("serial")
public class sugerenciaSave extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("apd");
		int numero = Integer.parseInt(req.getParameter("num"));
		String sdoctor = req.getParameter("sdoc");
		String sugiere = req.getParameter("sug");
		
		Sugerencia p = new Sugerencia(nombre,numero,sdoctor,sugiere);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			(getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/confirmar.jsp")).forward(req, resp);
			
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrió un error, <a href='index07.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}