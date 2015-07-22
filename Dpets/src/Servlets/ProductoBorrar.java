package Servlets;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bing.Producto;

@SuppressWarnings("serial")
public class ProductoBorrar extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/plain");		
		
		if( req.getParameter("nomb")!=null ){
			String producto = req.getParameter("nomb");
			final PersistenceManager pm = PMF.get().getPersistenceManager();
			final Query q = pm.newQuery(Producto.class);
			q.setFilter("nomb == nombParam");
			q.declareParameters("String nombParam");	
			try{
				q.deletePersistentAll(producto);
				
				(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaProducto.jsp")).forward(req,resp);
			}catch(Exception e){
					System.out.println(e);
					(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaProducto.jsp")).forward(req,resp);
			}finally{
				q.closeAll();
				pm.close();
			}			
		}else {		
			(getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaProducto.jsp")).forward(req,resp);
		}		
	}
}