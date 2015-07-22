package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ControladorOtros extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			RequestDispatcher mandar = null ;
			
			String enviarOtros = request.getParameter("enviarOtros");
			
			switch (enviarOtros){

			case "Iniciar":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/iniciar.jsp");
				break;
				
			case "Registrate":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/registroCliente.jsp");
				break;
				
			case "Registrar":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/registroMascota.jsp");
				break;
			
			case "Inicio":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
				
			case "Productos":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/Productos.jsp");
				break;
				


			case "Proyecto":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
				
			case "Calcular":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/Productos.jsp");
				break;
			case "Diagramas":
				mandar=getServletContext().getRequestDispatcher("/mapa.jsp");
				break;
			case "Mapa":
				mandar=getServletContext().getRequestDispatcher("/uml.jsp");
				break;

			case "Recuperar":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/recuperar.jsp");
				break;

				
			default :
			 	mandar = getServletContext().getRequestDispatcher("/index.html");	
			break;
			}
			mandar.forward(request, response);
			
		
	}
}