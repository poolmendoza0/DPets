
package epis.unsa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Controlador extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
			RequestDispatcher mandar = null ;
			
			String enviar = request.getParameter("enviar");
			PrintWriter out = response.getWriter();
			
			switch (enviar){
			
			
			case "Bienvenido.":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
			case "Cerrar.":
				mandar=getServletContext().getRequestDispatcher("/index.html");
				break;
			case "Medicamento":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
			case "Inicio":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
			case "Administrar":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/administrarMedicina.jsp");
				break;
				
			case "Regresar Admin":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
				
			case "Publicaciones":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
				
				
			case "Diagramas":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/indiceAdmin.jsp");
				break;
				
			case "Publica":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionVeter.jsp");
				break;
				
			case "Borrar Publicacion":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/publicacionBorrar.jsp");
				break;
			case "Lista Medicina":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaMedicamentos.jsp");
				break;
				
			case "Lista Usuarios":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaPersona.jsp");
				break;
				
				
			case "Lista Sugerencias":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaSugerencia.jsp");
				break;
				
			case "Consultas Realizadas":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaConsulta.jsp");
				break;
				
			case "Producto Base":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/productosBase.jsp");
				break;
				
			case "Lista Producto":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaProducto.jsp");
				break;
				
			case "Lista Mascota":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaMascota.jsp");
				break;
				
			case "Lista Adoptantes":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaAdopcion.jsp");
				break;
				
			case "Historia":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/Historial.jsp");
				break;
				
			case "Lista Historia":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/HistoriaLista.jsp");
				break;
				
			case "Especialistas":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/trabajadores.jsp");
				break;
				
			case "Especialista Lista":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/listaTrabajador.jsp");
				break;
				
			case "Borrar Usuarios":
				mandar=getServletContext().getRequestDispatcher("/WEB-INF/jspAdmin/usuarioBorrar.jsp");
				break;
			default :
			 	mandar = getServletContext().getRequestDispatcher("/index.html");	
			break;
			}
			mandar.forward(request, response);
			
		
	}
}