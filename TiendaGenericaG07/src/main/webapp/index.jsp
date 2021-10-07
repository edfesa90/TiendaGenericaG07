<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos5.css">
	<title>Validación Usuario</title>
</head>
<body>

	<header>
        <h1 class="titulo"> Tienda Generica</h1>
    </header>

	<section class="main">
        <br />
        <h2>Bienvenido a Tienda Generica Grupo 7</h2>
		<br />
		
		<%
        	String mensaje = (String)request.getAttribute("mensaje");
        if (mensaje != null){
        %>
        	<p><%= mensaje %></p>
        <%} %>
                    
        <form action="ServletLogin" method="get">
            <div>

                <label>Usuario:</label>
                <input type="text" placeholder="Escriba el usuario" name="usuario">
                <br />         
                <label>Contraseña:</label>
                <input type="password" placeholder="Escriba la contraseña" name="password">
                <br />      
                <button name="Aceptar" class="acciones">Aceptar</button>
                <button type="reset" name="Cancelar" class="acciones">Cancelar</button>
                
                
            </div>
            
        
    </form>
    </section>

</body>
</html>