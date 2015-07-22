package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Query;


import bing.Historia;



@SuppressWarnings("serial")
public class SaveHistoria extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();
		
		int numHistoria= Integer.parseInt(req.getParameter("historia"));
		String paciente = req.getParameter("paciente");
		String admision= req.getParameter("admision");
		String propietario= req.getParameter("propietario");
		String direccion= req.getParameter("direccion");
		int telefono= Integer.parseInt(req.getParameter("telefono"));
		String especie = req.getParameter("especie");
		int edad= Integer.parseInt(req.getParameter("edad"));
		String raza=req.getParameter("raza");
		String sexo=req.getParameter("sexo");
		String vacunacion = req.getParameter("vacunacion");
		String desparacitacion= req.getParameter("desparacitacion");
		String estado=req.getParameter("estado");
		String dietas= req.getParameter("dieta");
		String enfermedades= req.getParameter("enfermedades");
		String observaciones= req.getParameter("observaciones");
		
		
		Historia p = new Historia(numHistoria,paciente,admision,propietario,direccion,telefono,especie,edad,raza,sexo,vacunacion,desparacitacion,estado,dietas,enfermedades,observaciones);
		

		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final javax.jdo.Query q = pm.newQuery(Historia.class);
		pm.makePersistent(p);
		if( req.getParameter("paciente")!=null  ){
		try{
			
			@SuppressWarnings("unchecked")
			List<Historia>  productos = (List<Historia>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("productos", productos);
			RequestDispatcher r = getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/Historial.jsp");		
		   r.forward(req, resp);
		
		}catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		}
		else{
			RequestDispatcher r = getServletContext().getRequestDispatcher("index.html");		
			   r.forward(req, resp);
		}
	}
		
		
}

