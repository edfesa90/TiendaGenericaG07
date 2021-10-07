<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos2.css">
	<title>Productos</title>
</head>
<body>

	<header>
        <div class="titulo">
            <h1><a href="principal.jsp">Tienda Generica</a></h1>
        </div>
        <nav>
            <a href="ServletUsuarios" class="b">◦ Usuarios</a>
            <a href="clientes.jsp" class="b">◦ Clientes</a>
            <a href="proveedores.jsp" class="b">◦ Proveedores</a>
            <a href="#" class="b">◦ Productos</a>
            <a href="ventas.jsp" class="b">◦ Ventas</a>
            <a href="reportes.jsp" class="b">◦ Reportes</a>
        </nav>
        <div class="logo"> 
        	
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Subir Productos</h2>
        <br />
        <form action="pruebaServlet" method="get" enctype="multipart/form-data">
            <div>
                
                <label>Nombre del Archivo:</label>
                <input type="file" name="archivo" class="archivo"/>
                
                <br />
                <button name="Borrar" class="acciones">Cargar</button>
                
            </div>
            
        
        </form>

    </section>

    

</body>
</html>