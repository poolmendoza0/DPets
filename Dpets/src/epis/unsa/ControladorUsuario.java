package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ControladorUsuario extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			RequestDispatcher mandar = null ;
			
			String enviarUsuario = request.getParameter("enviarUsuario");
			//PrintWriter out = response.getWriter();
			
			switch (enviarUsuario){

			
			case "Bienvenido.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/index1.jsp");
				break;
			case "Cerrar.":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
			case "Inicio Usuario.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/index1.jsp");
				break;
				
				
				
			case "Atencion.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Atencion.jsp");
				break;
			case "Aseo.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Aseo.jsp");
				break;
			case "Esterilizar.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Esterilizacion.jsp");
				break;
			case "Inceminacion.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Inceminacion.jsp");
				break;
			case "Estilo.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/CambioEstilo.jsp");
				break;
			case "Spa.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Spa.jsp");
				break;
				
			case "Consultas.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/consulta.jsp");
				break;
				
			case "Sugerencias.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/sugerencia.jsp");
				break;
				
			case "Publicaciones.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/publicacionLista.jsp");
				break;
				
				
			case "Productos.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Productos.jsp");
				break;
				
			case "Costos":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Atencion.jsp");
				break;
				
			case "Calcular":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Productos.jsp");
				break;
				
			case "Curiosidades.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/index1.jsp");
				break;
				
			case "Perro enfermo.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/perroEnfermo.jsp");
				break;
			case "Viaje con mi perro.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/viajeMascota.jsp");
				break;
			case "Vacuna Perro.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/perroVacunas.jsp");
				break;	
			case "Gato enfermo.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/gatoEnfermo.jsp");
				break;
			case "Inceminacion gato.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Inceminacion.jsp");
				break;
			case "Esterilizar a mi gato.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Esterilizacion.jsp");
				break;
			case "Vacuna Gato.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/gatoVacunas.jsp");
				break;
			case "Registro Mascota.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/registroMascota.jsp");
				break;
			case "Tipos mascota.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/index1.jsp");
				break;
				
			case "Raza perros.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Razasperros.jsp");
				break;
			case "Raza gatos.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Razasgatos.jsp");
				break;
			case "Adopcion.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/Adopcion.jsp");
				break;
				
			case "Cambiar password.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/cambiarContrasenia.jsp");
				break;
			case "Actualizacion.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspUsuario/actualizarDatos.jsp");
				break;
			case "Cirugia.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspCliente/index1.jsp");
				break;
				
			default :
			 	mandar = getServletContext().getRequestDispatcher("/index.html");	
			break;
			}
			mandar.forward(request, response);
			

	}
}