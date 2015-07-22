package Servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import bing.Medicina;

@SuppressWarnings("serial")
public class medicinaSave extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nom");
		int cantidad = Integer.parseInt(req.getParameter("can"));
		String doctor = req.getParameter("doc");
		
		Medicina p = new Medicina(nombre,cantidad,doctor);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		
		try{
			pm.makePersistent(p);
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/administrarMedicina.jsp")).forward(req,resp);
		}catch(Exception e){
			System.out.println(e);
			//resp.getWriter().println("Ocurrió un error, <a href='index07.html'>vuelva a intentarlo</a>");
		}finally{
			pm.close();
		}
	}
}