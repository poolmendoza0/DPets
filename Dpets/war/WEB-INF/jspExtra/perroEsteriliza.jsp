<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aseo</title>
  <meta charset="ISO-8859-1">
  
   <link rel="stylesheet" type="text/css" href="/css/extra.css" />
    <link rel="stylesheet" type="text/css" href="/css/menu.css" />
    <link rel="stylesheet" type="text/css" href="/css/estilos.css">
<style>
div { 
  margin-top: 50px; 
  margin-left: 200px; 
  margin-right: 200px; 
  margin-bottom: 50px;
}
</style>
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
				<li><a href="/jsp/iniciar.jsp">Iniciar</a>
				<li><a href="/jsp/registroCliente.jsp">Registrar</a>
			</ul>
		</div>

	</header>

	<nav>
		Perros<br> Gatos<br> Conejos<br> Roedores<br>
		M.exoticas<br> <img
			src="http://4.bp.blogspot.com/-tSlWfVJ8zq8/UJNKo6lcPzI/AAAAAAAAixA/iPwu0hnLD3U/s1600/gatos+y+perros+png+(11).png"
			WIDTH=90 HEIGHT=210>
	</nav>

	<section>
		<div id="seleccionar">
			<ul class="nav">
				<li><a href="/index.html">Inicio</a></li>
				<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Atencion" name="enviarExtra" value="Atencion" class="botonA"></form>
					<ul>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Aseo" name="enviarExtra" value="Aseo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Esterilizar" name="enviarExtra" value="Esterilizar" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Inceminacion" name="enviarExtra" value="Inceminacion" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Cirugia" name="enviarExtra" value="Cirugia" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Estilo" name="enviarExtra" value="Estilo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Spa" name="enviarExtra" value="Spa" class="botonA"></form></li>
					</ul></li>
				<li><a href="/jsp/consulta.jsp">Consultas</a>
				<li><a href="/jsp/sugerencia.jsp">Sugerencias</a>
				<li><a href="/jsp/publicacion.jsp">Publicaciones</a>
				
				<li><a href="/jsp/productos.jsp">Productos</a></li>
				<li><a href="/jsp/trabajadores.jsp">Especialistas</a></li>
			<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Curiosidades" name="enviarExtra" value="Curiosidades" class="botonA"></form>

					<ul>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Mi perro enfermo" name="enviarExtra" value="Mi perro enfermo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="De viaje con mi perro" name="enviarExtra" value="De viaje con mi perro" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Por que esterilizar a mi perro" name="enviarExtra" value="Por que esterilizar a mi perro" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Vacuna Perro" name="enviarExtra" value="Vacuna Perro" class="botonA"></form></li>
						
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Mi gato enfermo" name="enviarExtra" value="Mi gato enfermo" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Inceminacion con mi gato" name="enviarExtra" value="Inceminacion con mi gato" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Por que esterilizar a mi gato" name="enviarExtra" value="Por que esterilizar a mi gato" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Vacuna Gato" name="enviarExtra" value="Vacuna Gato" class="botonA"></form></li>

					</ul></li>

				<li><a href="/jsp/registroMascota.jsp">Registra tu mascota</a></li>
			<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Tipos de mascota" name="enviarExtra" value="Tipos de mascota" class="botonA"></form>
					<ul>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Perros" name="enviarExtra" value="Perros" class="botonA"></form></li>
						<li><form id="form-login" action="controladorExtra" method="post"><input type="submit" id="Gatos" name="enviarExtra" value="Gatos" class="botonA"></form></li>


					</ul></li>

				<li><a href="">Diagramas</a>
					<ul>
						<li><a href="diagrama.jsp">Mapa de sitio</a></li>
						<li><a href="Uml.jsp">UML</a></li>
						<li><a href="Test.jsp">Test case</a></li>
						<li><a href="Proyecto.jsp">Proyecto</a></li>
					</ul></li>

			</ul>

		</div>
	</section>
<br><br><br>
<br><br><br>

<div>
<table bgcolor="white"><tr>
<td><font size=4><h1><center>¿Por qué esterilizar a mi perro?<br><img src="http://www.elcotodecaza.com/sites/default/files/imagecache/thickboxCache/images/20130115-perros-operacion-0.jpg
" WIDTH=950 HEIGHT=700></center></h1>
<p align="justify">
<br>
Esterilizar es una gran idea, hasta ahí estamos todos de acuedo. Pero ¿cuándo? Esta es una
de las preguntas más frecuentes que se hacen los dueños de perros: ¿cuál es la mejor edad
para esterilizar a mi perro? En verdad es una muy buena pregunta, porque el tema tiene
más miga de la que parece.
<br><br>
Al final cada maestrillo tiene su librillo, y diferentes veterinarios te darán opiniones
distintas sobre este tema. Nadie está en posesión de la verdad absoluta, así que te
animamos a que antes de tomar una decisión investigues por tu cuenta en internet y
consultes distintas fuentes. Pero por supuesto, si conoces un buen veterinario en cuyo
criterio confías, es una buenísima idea pedirle consejo a él.
<br><br>
La esterilización de perros es un procedimiento quirúrgico rutinario, rápido, indoloro, con un tiempo de recuperación sorprendente, que consiste en retirar los testículos en los perros y los ovarios, oviductos y útero en las perras.
<br><br>
La esterilización de perros hace muchos años se realizaba únicamente a perros de la calle durante las campañas para el control de población canina y en perros que por razones médicas así lo requerían. Actualmente la educación y concientización, así como el ritmo de vida de los propietarios ha hecho que esta cirugía sea la más común en la práctica veterinaria, además existen criaderos y tiendas de mascotas principalmente de países desarrollados, en los cuales se venden a los cachorros de 3 meses ya esterilizados a personas que quieren al perro como compañero o mascota, esto se hace con el fin de evitar enfermedades, a los criadores de traspatio, las cruzas indiscriminadas y las modas que terminan por arruinar a las razas con perros de mala calidad que se venden a través del periódico a precios ridículos.
<br><br>
<b>Ventajas de esterilizar un perro:</b><br><br>
A menos que tengas un perro de raza de calidad (buen carácter, equilibrado, buena morfología) que desees utilizar en un programa de cría responsable, la mejor opción es sin
duda esterilizar o castrar a tu perro.
<br><br>
Esto ofrece muchas ventajas. La primera y más importante es que evitarás tener camadas indeseadas, y el consiguiente problema de tener que colocar a los cachorros, que muchas veces acaban muertos o abandonados, o pasan a saturar aún más las protectoras y refugios.
<br><br>
</td></tr></table>
</p>
</font>
</div>

<br><br>

</body>
</html>
