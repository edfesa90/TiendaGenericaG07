<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos4.css">
	<title>Usuarios</title>
</head>
<body>

	<header>
        <div class="titulo">
            
        </div>
        <nav>
            <a href="ServletUsuarios" class="b">◦ Usuarios</a>
            <a href="clientes.jsp" class="b">◦ Clientes</a>
            <a href="proveedores.jsp" class="b">◦ Proveedores</a>
            <a href="productos.jsp" class="b">◦ Productos</a>
            <a href="ventas.jsp" class="b">◦ Ventas</a>
            <a href="#" class="b">◦ Reportes</a>
        </nav>
        <div class="logo"> 
            <img class="logo" src="Estilos css/Imagenes/Imagen1.jpg" alt="Lotipo prueba" />
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Reportes Tienda Generica</h2>
        <br />
        <form action="pruebaServlet" method="get">
                <button name="Usuarios" class="acciones">Listado de Usuarios</button>
                <br />
                <button name="Clientes" class="acciones">Listado de Clientes</button>
                <br />
                <button name="Ventas" class="acciones">Ventas por Cliente</button>
        </form>

        </section>


    

</body>
</html>