package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Query;

import bing.Mascota;



@SuppressWarnings("serial")
public class SaveMascota extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();

		String nombre = req.getParameter("nombre");
		
		String especie= req.getParameter("especie");
		String edad=req.getParameter("edad");
		String sexo = req.getParameter("sexo");
		String mensaje = req.getParameter("mensaje");
		String dueño=req.getParameter("dueño");
		
		Mascota p = new Mascota(nombre,especie,edad,sexo,mensaje,dueño);

		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final javax.jdo.Query q = pm.newQuery(Mascota.class);
		pm.makePersistent(p);
		if( req.getParameter("nombre")!=null  ){
		try{
			
			@SuppressWarnings("unchecked")
			List<Mascota>  mascotas = (List<Mascota>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("mascotas", mascotas);
			RequestDispatcher r = getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/confirmar.jsp");		
		   r.forward(req, resp);
		
		}catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		}
		else{
			RequestDispatcher r = getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/error.jsp");		
			   r.forward(req, resp);
		}
	}
		
		
}