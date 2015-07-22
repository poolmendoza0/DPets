<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Registro mascota</title>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/> 
<link rel="stylesheet" type="text/css" href="/css/menu.css" />
<link rel="stylesheet" type="text/css" href="/css/estilos3.css" />
<link rel="stylesheet" type="text/css" href="/css/Admin.css" />

<link rel="stylesheet" type="text/css" href="E:/1VEMP/css/Admin.css" />
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

	<div id="registrar"></div>
	<!-- fin opcion-->

	<div id="envoltura">
		<div id="contenedor">

			<div id="cabecera">
			<b>Registro historia de mascota</b><br>
				<img
					src="http://www.cookieswil.com/media/files/uploads/2014/02/Seguros-para-perros-y-gatos.3-300x225.jpg"
					width="75" height="80">
			</div>

			<div id="cuerpo">
				<form id="form-login" action="/saveHistoria" method="post"
					autocomplete="off">
					<!--A saber, el atributo for funciona como el id.-->
					<!--ejemplo <label for="usuario">Usuario:</label>-->
					<!--required es nuevo en html5, si el campo está vacío te avisa, pero cuidado, no valida la información-->
				<table border="2">
				<tr>
				<td>
					<table>
					<tr>
						<td><label>N de historia :</label>
						<br>
					<input name="historia" type="number" placeholder="num historia"
						autofocus="" required="">
						</td>
						<td>
						<label>Nombre paciente :</label>
						<br>
					<input name="paciente" type="text" placeholder="paciente"
						autofocus="" required="">
						</td>
						<td>
						<label>Dia de admision:</label>
						<br>
					<input name="admision" type="date" placeholder="admision"
						autofocus="" required="">
					</td>
					</tr>
					</table>
				</td>
				</tr>
				<tr>
				<td>
					<table>
					<tr>
					<td>
						<br><label>Propietario:</label><br><br>
						<label>Direccion:</label><br><br>
						<label>Telefono:</label><br><br>
					</td>
					<td>
					<input name="propietario" type="text" placeholder="propietario"
						autofocus="" required="">
					<br>
						
					<input name="direccion" type="text" placeholder="direccion"
						autofocus="" required="">
					<br>

					<input name="telefono" type="number" placeholder="telefono"
						autofocus="" required="">
					</td>
					</tr>
					</table>
				</td>
				</tr>
				<tr>
				<td>	
						<table>
						<tr>
						<td>
						<label>Reseña</label>
						</td>
						<td>
						</tr>
						<tr>
						</td>
						<td>
					
						<label>Especie:</label>
					<select name="especie">
						<option value="perro">Perro</option>
						<option value="gato">Gato</option>
						<option value="roedores">roedores</option>
						<option value="aves">aves</option>
						<option value="peces">peces</option>
						<option value="reptiles">reptiles</option>
						<option value="anfibios">anfibios</option>

					</select>
					<br>
						<label>De Raza:</label>
					<input name="raza" type="text" placeholder="raza"
						autofocus="" required="">
						</td>
				</td>
				<td>
						<td>
						
						<label>Sexo:</label>
					<select name="sexo">
						<option value="macho">Macho</option>
						<option value="hembra">Hembra</option>

					</select>		
						<br>
					
						<label>Edad:</label>
					
					<input name="edad" type="number" placeholder="edad"
						autofocus="" required="">
					</td>
					</tr>
					</table>


				</td>
				</tr>
				<tr>
				<td>
						<table>
						<tr>
						<td>Historia</td>
						<td></td>
						</tr>
						<tr>
						<td>
						<label>Vacunaciones:</label>
						<br>
						<textarea name="vacunacion" class="input" rows="7" cols="21" placeholder="SI/NO Fecha/Productos"></textarea>
						</td>
						<td>
						<label>Desparacitacion:</label>
						<br>
						<textarea name="desparacitacion" class="input" rows="7" cols="21"placeholder="SI/NO Fecha/Productos"></textarea>
						</td>
						<td>
						<label>Estado reproductivo:</label>
						<br>
						<textarea name="estado" class="input" rows="7" cols="21" placeholder="Estado reproductivo"></textarea>
						</td>
						<td>
						<label> Dieta:</label>
						<br>
						<textarea name="dieta" class="input" rows="7" cols="20" placeholder="Dieta"></textarea>
						</td>
						</tr>
						</table>
						
				</td>
				</tr>
				<tr>
				<td>
						
						<label>Enfermedades o procedimientos Anteriores:</label>
						<br>
						<textarea name="enfermedades" class=
						"input" rows="7" cols="95"></textarea>
				
				</td>
				</tr>
				<tr>
				<td>	
						
						<label>Observacines:</label>
						<br>
						<textarea name="observaciones" class="input" rows="7" cols="95"></textarea>
				</tr>
				</td>
				</table>				
					<center>
						<p id="bot">
							<input type="submit" name="submit" value="Enviar" class="boton"
								autofocus="" required="">
					</center>
					</p>
				</form>
			</div>
			<!--fin cuerpo-->

			<div id="pie">Registro</div>
		</div>
		<!-- fin contenedor -->
		<br>
		<br>
	</div>
	<!--fin envoltura-->
<h1><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</h1>
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