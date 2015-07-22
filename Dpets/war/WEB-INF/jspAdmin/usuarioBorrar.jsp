<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page import ="javax.jdo.Query"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="bing.Persona"%>
<%@ page import="Servlets.PMF"%>
<%@ page import="java.util.List"%>
<%@ page import ="javax.jdo.PersistenceManager "%>
<% List<Persona> personas = (List<Persona>)request.getAttribute("personas");%>

			
				
<!DOCTYPE html>
<html lang="es">
<head>
<title>Administrador</title>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/css/menu.css" />
<link rel="stylesheet" type="text/css" href="/css/estilos.css" />
<link rel="stylesheet" type="text/css" href="/css/Admin.css" />
<link rel="stylesheet" type="text/css" href="/css/tabla.css" />
</head>

<body>
	<header>
		<center>
			<h1>
				<font size=20>D'Pets - Administrador</font> <font color="gray">....</font>
				<img
					src="http://www.anipedia.net/images/gifs-animados-gatos-divertidos.gif"
					width=60 height=60> <br>
			</h1>
		</center>

		<div id="iniciar">
			<ul class="nav">
			<li><center>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Bienvenido." name="enviar"
								value="Bienvenido." class="botonA">
						</form>
					</center></li>
				<li><center>
						<form id="form-login" action="controladorUsuario" method="post">
							<input type="submit" id="Cerrar." name="enviarUsuario"
								value="Cerrar." class="botonA">
						</form>
					</center></li>
			</ul>
		</div>

	</header>

	<nav>
		Perros<br> Gatos<br> Conejos<br> Roedores<br>
		M.exoticas<br> <img
			src="http://4.bp.blogspot.com/-tSlWfVJ8zq8/UJNKo6lcPzI/AAAAAAAAixA/iPwu0hnLD3U/s1600/gatos+y+perros+png+(11).png"
			WIDTH=90 HEIGHT=210>
	</nav>
	<br>
	<br>

	<section>
		<div id="seleccionar">
			<ul class="nav">
				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/imagenologia.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Inicio" name="enviar" value="Inicio"
								class="botonA">
						</form>
					</center></li>
				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Medicamento" name="enviar"
								value="Medicamento" class="botonA">
						</form>
					</center>
					<ul>
						<li><center>
								<form id="form-login" action="controlador" method="post">
									<input type="submit" id="Administrar" name="enviar"
										value="Administrar" class="botonA">
								</form>
							</center></li>

						<li><center>
								<form id="form-login" action="controlador" method="post">
									<input type="submit" id="Lista Medicina" name="enviar"
										value="Lista Medicina" class="botonA">
								</form>
							</center></li>

					</ul></li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/imagenologia.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Lista Sugerencias" name="enviar"
								value="Lista Sugerencias" class="botonA">
						</form>
					</center></li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/cirugia.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Producto Base" name="enviar"
								value="Producto Base" class="botonA">
						</form>
					</center>
					<ul>
						<li><center>
								<form id="form-login" action="controlador" method="post">
									<input type="submit" id="Lista Producto" name="enviar"
										value="Lista Producto" class="botonA">
								</form>
							</center></li>
					</ul></li>
				</li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/consulta.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Publicaciones" name="enviar"
								value="Publicaciones" class="botonA">
						</form>
					</center>
					<ul>
						<li><center>
								<form id="form-login" action="controlador" method="post">
									<input type="submit" id="Publica" name="enviar" value="Publica"
										class="botonA">
								</form>
							</center></li>

						<li><center>
								<form id="form-login" action="controlador" method="post">
									<input type="submit" id="Borrar Publicacion" name="enviar"
										value="Borrar Publicacion" class="botonA">
								</form>
							</center></li>

					</ul></li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/imagenologia.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Lista Mascota" name="enviar"
								value="Lista Mascota" class="botonA">
						</form>
					</center></li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Consultas Realizadas" name="enviar"
								value="Consultas Realizadas" class="botonA">
						</form>
					</center></li>

				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Lista Usuarios" name="enviar"
								value="Lista Usuarios" class="botonA">
						</form>
					</center>
					<ul>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Borrar Usuarios" name="enviar"
								value="Borrar Usuarios" class="botonA">
						</form>
					</ul>
					</li>
				<li><center>
					<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/imagenologia.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Especialistas" name="enviar"
								value="Especialistas" class="botonA">
						</form>
					</center>
					<ul>
					
						<li><center>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Especialista Lista" name="enviar"
								value="Especialista Lista" class="botonA">
						</form>
					</center></li>
					</ul>
					</li>
				<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Lista Adoptantes" name="enviar"
								value="Lista Adoptantes" class="botonA">
						</form>
					</center></li>							
					
					<li><center>
						<img
							src="http://www.veterinariadelbosque.com/images/clinica/iconos/medicina-interna.png"
							width="25" height="25"><br>
						<form id="form-login" action="controlador" method="post">
							<input type="submit" id="Historia" name="enviar"
								value="Historia" class="botonA">
						</form>
					</center>
					<ul>
						<li><center>
								<form id="form-login" action="controlador" method="post">
								<input type="submit" id="Lista Historia" name="enviar"
								value="Lista Historia" class="botonA">
								</form>
							</center></li>
					</ul></li>
				</li>


		</div>
	</section>
		
		<br><br><br>
		<br><br><br>
		<br><br><br>

<% PersistenceManager pm = PMF.get().getPersistenceManager();%>
		<%Query q = pm.newQuery(Persona.class);
				%>


				<div id="envoltura">
		<div id="contenedor">

			<div id="cabecera">
				<b>Borrar usuario</b><br> <img
					src="http://www.cookieswil.com/media/files/uploads/2014/02/Seguros-para-perros-y-gatos.3-300x225.jpg"
					width="75" height="80">
			</div>

			<div id="cuerpo">
				<form action="/borrarUsuario" id="form-login" method="post">
					
					<p>
						<label>Eliminar:</label>
					</p>
					<input name="username" type="text" id="username" size = "20" placeholder="username" value= ""
						autofocus="" required="">
					</p>
			
					<p id="bot">
						<input type="submit" id="submit" name="submit" value="Eliminar"
							class="boton">
					</p>
				</form>
			</div>
			<!--fin cuerpo-->

			<div id="pie">Eliminar</div>
		</div>
		<!-- fin contenedor -->
		<br>
		<br>
		      
	    <br>
		<br>
	</div>
	<!--fin envoltura-->	
</div>

	<footer>
		<b>copyright Mayra Medina, Eli Frarfan, Victor Arcaya, Pool
			Mendoza</b>

		<div class="top">

			<footer id="izq">
				<a href="" class="toplink" rel="nofollow"><img
					src="http://www.davidhechtkitchens.com/images/button-back-to-top.png">
					<i class=" icon-chevron-sign-up"></i></a>
			</footer>
		</div>
	</footer>



</body>
</html>