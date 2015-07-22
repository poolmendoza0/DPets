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
import bing.Producto;



@SuppressWarnings("serial")
public class ProductoSave extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		
		PrintWriter out= resp.getWriter();

		
		String nombre = req.getParameter("nombre");
	
		int cantidad = Integer.parseInt(req.getParameter("cantidad"));
		int costo = Integer.parseInt(req.getParameter("costo"));
		
		Producto p = new Producto(nombre,cantidad,costo);

		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final javax.jdo.Query q = pm.newQuery(Producto.class);
		pm.makePersistent(p);
	
		try{
			if( req.getParameter("nombre")!=null  ){
			@SuppressWarnings("unchecked")
			List<Producto>  productos = (List<Producto>) q.execute();
			pm.makePersistent(p);
			req.setAttribute("productos", productos);
			//RequestDispatcher r = getServletContext().getRequestDispatcher("/jsp/confirmar.jsp");	
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/productosBase.jsp")).forward(req,resp);

		   
			}
			
			else{
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/productosBase.jsp")).forward(req,resp);

			}
		
		}catch(Exception e){
			System.out.println(e);
		}finally{
			q.closeAll();
			
		}
		}
	
	}