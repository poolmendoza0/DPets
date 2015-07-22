package Servlets;

import java.io.IOException;
import bing.Trabajador;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class SaveTrabajador extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		String correo = req.getParameter("correo");
		String direccion = req.getParameter("direccion");
		int  telefono = Integer.parseInt(req.getParameter("telefono"));
		String especialidad = req.getParameter("especialidad");
		Trabajador p = new Trabajador(nombre,correo,direccion,telefono,especialidad);
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query q = pm.newQuery(Trabajador.class);
		pm.makePersistent(p);
	
		try{
			if( req.getParameter("nombre")!=null  ){
			@SuppressWarnings("unchecked")
			List<Trabajador> trabajadores = (List<Trabajador>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("trabajadores", trabajadores);
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/trabajadores.jsp");
			rd.forward(req, resp);
		
		}
			else{
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/trabajadores.jsp");
				rd.forward(req, resp);	
				}
		}
			catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		
	
	}
		
		
}