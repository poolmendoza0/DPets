package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import bing.Adopcion;

@SuppressWarnings("serial")
public class SaveAdopcion extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String especie = req.getParameter("especie");
		int edad = Integer.parseInt(req.getParameter("edad"));
		String sexo = req.getParameter("sexo");
		String descripcion = req.getParameter("descripcion");
		String mensaje = req.getParameter("mensaje");
		
		Adopcion p = new Adopcion(nombre,apellido,especie,edad,sexo,descripcion,mensaje);
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