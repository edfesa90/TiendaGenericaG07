<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos1.css">
	<title>Clientes</title>
</head>
<body>

	<header>
        <div class="titulo">
            <h1><a href="principal.jsp">Tienda Generica</a></h1>
        </div>
        <nav>
            <a href="ServletUsuarios" class="b">◦ Usuarios</a>
            <a href="#" class="b">◦ Clientes</a>
            <a href="proveedores.jsp" class="b">◦ Proveedores</a>
            <a href="productos.jsp" class="b">◦ Productos</a>
            <a href="ventas.jsp" class="b">◦ Ventas</a>
            <a href="reportes.jsp" class="b">◦ Reportes</a>
        </nav>
        <div class="logo"> 
            <img class="logo" src="Estilos css/Imagenes/Imagen1.jpg" alt="Lotipo prueba" />
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Gestión de Clientes Tienda Generica</h2>
        <br />
        <form action="pruebaServlet" method="get">
            <div>
                
                <label>Cedula:</label>
                <input type="text" placeholder="Escriba la cedula" name="cedula" id="cedula" class="cedula">
                <br /> 
                <label>Telefono:</label>
                <input type="text" placeholder="Escriba el Telefono" name="Telefono" id="Telefono" class="Telefono">
                <br />         
                <label>Nombre:</label>
                <input type="text" placeholder="Escriba el Nombre Completo" name="Nombre" id="Nombre" class="Nombre">
                <br /> 
                <label>Correo:</label>
                <input type="text" placeholder="Escriba el Correo" name="Correo" id="Correo" class="Correo">
                <br />      
                <label>Dirección:</label>
                <input type="text" placeholder="Escriba la Dirección" name="Dirección" id="Dirección" class="Dirección">
                <!--<label class="espacio"> . </label>-->
                
                <br />

                <button name="Consultar" class="acciones">Consultar</button>
                <button name="Crear" class="acciones">Crear</button>
                <button name="Actualizar" class="acciones">Actualizar</button>
                <button name="Borrar" class="acciones">Borrar</button>
            </div>
            
        
        </form>

        <section class="datos">
            <h2>Usuarios</h2>
            <br />
            <table class="data">
                <tr>
                    <td class="icon"> <img src="https://img.icons8.com/nolan/64/checked.png"/> </td>
                    <td>Cedula</td>
                    <td>Telefono</td>
                    <td>Nombre</td>
                    <td>Ciudad</td>
                    <td>Dirección</td>
                </tr>
</table>

        </section>
    </section>

    

</body>
</html>