<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "tienda.TiendaGenericaG07.modelo.Usuario" %>
<%@ page import= "java.util.ArrayList" %>

<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos1.css">
	<title>Usuarios</title>
</head>
<body>

	<header>
        <div class="titulo">
            <h1><a href="principal.jsp">Tienda Generica</a></h1>
        </div>
        <nav>
            <a href="#" class="b">◦ Usuarios</a>
            <a href="clientes.jsp" class="b">◦ Clientes</a>
            <a href="proveedores.jsp" class="b">◦ Proveedores</a>
            <a href="productos.jsp" class="b">◦ Productos</a>
            <a href="ventas.jsp" class="b">◦ Ventas</a>
            <a href="reportes.jsp" class="b">◦ Reportes</a>
        </nav>
        <div class="logo"> 
            
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Gestión de Usuarios Tienda Generica</h2>
        <br />
        <form action="ServletUsuarios" method="get">
            <div>
                
                <label>Cedula:</label>
                <input type="text" placeholder="Escriba la Cedula" name="Cedula" id="Cedula" class="Cedula">
                <br /> 
                <label>Usuario:</label>
                <input type="text" placeholder="Escriba el Usuario" name="Usuario" id="Usuario" class="Usuario">
                <br />         
                <label>Nombre:</label>
                <input type="text" placeholder="Escriba el Nombre" name="Nombre" id="Nombre" class="Nombre">
                <br /> 
                <label>Contraseña:</label>
                <input type="text" placeholder="Escriba la Contraseña" name="password" id="password" class="password">
                <br />      
                <label>Correo:</label>
                <input type="text" placeholder="Escriba el Correo" name="Correo" id="Correo" class="Correo">
                <!--<label class="espacio"> . </label>-->
                
                <br />

                <button type = "submit" name="accion" value="Consultar" class="acciones">Consultar</button>
                <button type = "submit" name="accion" value="Crear" class="acciones">Crear</button>
                <button type = "submit" name="accion" value="Actualizar" class="acciones">Actualizar</button>
                <button type = "submit" name="accion" value="Borrar" class="acciones">Borrar</button>
            </div>
        </form>
        
        <section class="datos">

            <h2>Usuarios</h2>
            <br />
            <table>
		        <thead>
		            <tr>
		            	<th scope="col"><img src="https://img.icons8.com/nolan/64/checked.png"/></th>
		                <th scope="col">Cedula</th>
		                <th scope="col">Usuario</th>
		                <th scope="col">Nombre</th>
		                <th scope="col">Email</th>
		                <th scope="col">Password</th>
		           </tr>
		        </thead>
		        <tbody>
		            <% ArrayList<Usuario> lista = new ArrayList<Usuario>(); 
		            lista = (ArrayList<Usuario>) request.getAttribute("lista");
		            if (lista.size() > 0){
		            	for (Usuario usuario:lista){					
					%>
					<tr>
						<td></td>
		               	<td><%=usuario.getCedula_usuario() %></td>
		               	<td><%=usuario.getUsuario() %></td>
		               	<td><%=usuario.getNombre_usuario() %></td>
		               	<td><%=usuario.getEmail_usuario() %></td>
		               	<td><%=usuario.getPassword() %></td>
		            </tr>
		            <%	}
		            }%>
		        </tbody>
		    </table>

        </section>
        
    </section>

    

</body>
</html>