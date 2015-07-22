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
import bing.Persona;



@SuppressWarnings("serial")
public class CrearPersona extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		PrintWriter out= resp.getWriter();


		String name = req.getParameter("nombre");
		String last = req.getParameter("apellido");
		int dni = Integer.parseInt(req.getParameter("dni"));
		String username = req.getParameter("username");
		String pass = req.getParameter("pass");
		String adress = req.getParameter("direccion");
		String phone = req.getParameter("telefono");
		String pet = req.getParameter("pet");
		
		
		Persona p =  new Persona (name,last,dni,username,pass,adress,phone,pet);

		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final javax.jdo.Query q = pm.newQuery(Mascota.class);
		pm.makePersistent(p);
	
		try{
			if( req.getParameter("nombre")!=null  ){
			
			@SuppressWarnings("unchecked")
			List<Persona>  personas = (List<Persona>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("personas", personas);
			RequestDispatcher r = getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/confirmar.jsp");		
		    r.forward(req, resp);
		
		}
			else{
				RequestDispatcher r = getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/error.jsp");		
				   r.forward(req, resp);
			}}
		
			catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		
		
	}
		
		
}

