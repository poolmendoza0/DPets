package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ControladorExtra extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			RequestDispatcher mandar = null ;
			
			String enviarExtra = request.getParameter("enviarExtra");
			PrintWriter out = response.getWriter();
			
			switch (enviarExtra){
			
			case "Atencion":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Atencion.jsp");
				break;
			case "Aseo":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Aseo.jsp");
				break;
			case "Esterilizar":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Esterilizacion.jsp");
				break;
			case "Inceminacion":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Inceminacion.jsp");
				break;
			case "Cirugia":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Inceminacion.jsp");
				break;
			case "Estilo":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/CambioEstilo.jsp");
				break;
			case "Spa":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Spa.jsp");
				break;
			case "Curiosidades":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
			case "Perro enfermo":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/perroEnfermo.jsp");
				break;
			case "Viaje con mi perro":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/viajeMascota.jsp");
				break;
			case "Por que esterilizar a mi perro":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/perroEsteriliza.jsp");
				break;
			case "Vacuna Perro":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/perroVacunas.jsp");
				break;
				
			case "Gato enfermo":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/gatoEnfermo.jsp");
				break;
			case "Inceminacion gato":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Inceminacion.jsp");
				break;
			case "Esterilizar a mi gato":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Esterilizacion.jsp");
				break;
			case "Costos":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Atencion.jsp");
				break;
			case "Vacuna Gato":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/gatoVacunas.jsp");
				break;
				
			case "Tipos mascota":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
				
			case "Raza perros":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Razasperros.jsp");
				break;
				
			case "Raza gatos":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspExtra/Razasgatos.jsp");
				break;
		
				
				
		
				
			default :
			 	mandar = getServletContext().getRequestDispatcher("/index.html");	
			break;
			}
			mandar.forward(request, response);
			
		
	}
}