<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Registro trabajadores</title>
    <meta charset="utf-8">
   <link rel="stylesheet" type="text/css" href="/css/menu.css" />
<link rel="stylesheet" type="text/css" href="/css/estilos.css" />
<link rel="stylesheet" type="text/css" href="/css/tabla.css" />
<link rel="stylesheet" type="text/css" href="/css/Admin.css" />
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
 
<div id="registrar">

</div> <!-- fin opcion-->
 
    <div id="envoltura">
        <div id="contenedor">
 
            <div id="cabecera" >
                <img src="https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQfnLNcGt5ygKLfQg8i--HcqbKH7gA20de24NHTT-J3G1HykHOpI_4DqcWnBA" width="75" height="80">
            </div>
 
                <div id="cuerpo">
                <form id="form-login" action="savetrabajador" method="post" autocomplete="off">
                    
                    <p><label >Nombres :</label></p>
                        <input name="nombre" type="text"  placeholder="Nombres Completos" autofocus="" required=""></p>	
					<p><label >Correo:</label></p>
                         <input name="correo" type="text"  placeholder="ejemplo@gmail.com" autofocus="" required=""></p>
					<p><label >Direccion:</label></p>
                         <input name="direccion" type="text"  placeholder="direccion" autofocus="" required=""></p>	
					<p><label >Telefono:</label></p>
                         <input name="telefono" type="number"  placeholder="telefono" autofocus="" required=""></p>		
							          
					<p><label >Especialidad:</label></p>
                    	<select id="especialidad" name="especialidad" >
							<option value="Inmunologia">Inmunologia</option>
							<option value="Estilistas">Estilistas</option>
							<option value="Etologo">Etologo</option>
							<option value="comportamiento animal">comportamiento animal</option>
							<option value="Dermatologia">Dermatologia</option>
							<option value="farmacologia">farmacologia</option>
							<option value="parasitologia">parasitologia</option>
							<option value="seguridad alimentaria">seguridad alimentaria</option>
							<option value="virologia animal">virologia animal</option>
							
						
					</select>
       
 
                    <p id="bot"><input type="submit" value="Registrar" class="boton"></p>
                </form>
            </div>
 
            <div id="pie"></div>
        </div>
    </div>
	
	

</body>
 
</html>