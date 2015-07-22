<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="javax.jdo.Query"%>
<%@ page import="bing.Persona"%>
<%@ page import="Servlets.PMF"%>
<%@ page import="java.util.List"%>
<%@ page import ="javax.jdo.PersistenceManager "%>
<% Persona p = (Persona) request.getAttribute("cliente");%>
<%// List<Persona> personas = (List<Persona>)request.getAttribute("");%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Operacion exitosa</title>
  <meta charset="ISO-8859-1">
   <link rel="stylesheet" type="text/css" href="/css/menu.css" />
   <link rel="stylesheet" type="text/css" href="/css/tabla.css" />
   <link rel="stylesheet" type="text/css" href="/css/estilos2.css" />
</head>
<body>


	<header>
	<center>
		<h1>
			<font size=20>D'Pets</font> <font color="gray">....</font> <img
				src="http://www.anipedia.net/images/gifs-animados-gatos-divertidos.gif"
				width=60 height=60> <br>
		</h1>
	</center>

	<div id="iniciar">
			<ul class="nav">

				<li><center>
						<form id="form-login" action="controladorOtros" method="post">
							<input type="submit" id="Iniciar" name="enviarOtros"
								value="Iniciar" class="botonA">
						</form>
					</center>
				<li><center>
						<form id="form-login" action="controladorOtros" method="post">
							<input type="submit" id="Registrate" name="enviarOtros"
								value="Registrate" class="botonA">
						</form>
					</center>
			</ul>
		</div>

	</header>

	<nav> Perros<br>
	Gatos<br>
	Conejos<br>
	Roedores<br>
	M.exoticas<br>
	<img
		src="http://4.bp.blogspot.com/-tSlWfVJ8zq8/UJNKo6lcPzI/AAAAAAAAixA/iPwu0hnLD3U/s1600/gatos+y+perros+png+(11).png"
		WIDTH=90 HEIGHT=210> </nav>
		
		<br>

		<section>
		<div id="seleccionar">
			<ul class="nav">

				<li><center>
						<form id="form-login" action="controladorOtros" method="post">
							<input type="submit" id="Inicio" name="enviarOtros"
								value="Inicio" class="botonA">
						</form>
					</center></li>


				<li><form id="form-login" action="controladorExtra"
						method="post">
						<input type="submit" id="Atencion" name="enviarExtra"
							value="Atencion" class="botonA">
					</form>
					<ul>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Aseo" name="enviarExtra" value="Aseo"
									class="botonA">
							</form></li>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Esterilizar" name="enviarExtra"
									value="Esterilizar" class="botonA">
							</form></li>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Inceminacion" name="enviarExtra"
									value="Inceminacion" class="botonA">
							</form></li>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Estilo" name="enviarExtra"
									value="Estilo" class="botonA">
							</form></li>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Spa" name="enviarExtra" value="Spa"
									class="botonA">
							</form></li>
					</ul></li>

				<li><center>
						<form id="form-login" action="controladorOtros" method="post">
							<input type="submit" id="Productos" name="enviarOtros"
								value="Productos" class="botonA">
						</form>
					</center>



					<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Curiosidades" name="enviarExtra" value="Curiosidades" class="botonA"></form>
					<ul>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Perro enfermo" name="enviarExtra" value="Perro enfermo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Viaje con mi perro" name="enviarExtra" value="Viaje con mi perro" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Vacuna Perro" name="enviarExtra" value="Vacuna Perro" class="botonA"></form></li>
						
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Gato enfermo" name="enviarExtra" value="Gato enfermo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Inceminacion gato" name="enviarExtra" value="Inceminacion gato" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Esterilizar a mi gato" name="enviarExtra" value="Esterilizar a mi gato" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Vacuna Gato" name="enviarExtra" value="Vacuna Gato" class="botonA"></form></li>

					</ul></li>


				<li><form id="form-login" action="controladorExtra"
						method="post">
						<input type="submit" id="Tipos mascota" name="enviarExtra"
							value="Tipos mascota" class="botonA">
					</form>
					<ul>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Raza gatos" name="enviarExtra"
									value="Raza gatos" class="botonA">
							</form></li>
						<li><form id="form-login" action="controladorExtra"
								method="post">
								<input type="submit" id="Raza perros" name="enviarExtra"
									value="Raza perros" class="botonA">
							</form></li>

					</ul></li>


						<li><form id="form-login" action="controladorOtros"
								method="post">
								<input type="submit" id="Recuperar" name="enviarOtros"
									value="Recuperar" class="botonA">
							</form>
						</li>


			

		</div>
	</section>
	
	
	<br>
	<br>
	<br>
	
	<div id="envoltura">
		<div id="contenedor">

			<div id="cabecera">
				<b>Operacion realizada con exito!!!</b><br> <img
					src="http://www.cookieswil.com/media/files/uploads/2014/02/Seguros-para-perros-y-gatos.3-300x225.jpg"
					width="75" height="80">
					
					<% PersistenceManager pm = PMF.get().getPersistenceManager();%>
					<%Query q = pm.newQuery(Persona.class);%>

				
				<center>
				
				<table border = "2" bgcolor="white">
				<tr>
				
				  <td><strong><center>Usuario</center></strong></td>
				  <td><strong><center>Contraseña</center></strong></td>
				</tr>
			<%//List<Persona> persona = (List<Persona>) q.execute(""); %>
			<%//Persona p = (Persona)q.execute(""); %>
			<%//for(Persona p: persona){ %>
				<tr>
				<td><%out.println(p.getUsername());%></td>
				<td><%out.println(p.getPass()); %></td>
				
			<%//}%>
			</tr>
				</table>
				</h2>
				</center>
						<br>
		<br>
					
			</div>
			</div>
			</div>
	<br>
	<br>
	<br>

	<footer> <b>copyright Mayra Medina, Eli Frarfan, Victor
		Arcaya, Pool Mendoza</b>

	<div class="top">

		<footer id="izq"> <a href="" class="toplink" rel="nofollow"><img
			src="http://www.davidhechtkitchens.com/images/button-back-to-top.png">
			<i class=" icon-chevron-sign-up"></i></a> </footer>
	</div>
	</footer>

</body>
</html>