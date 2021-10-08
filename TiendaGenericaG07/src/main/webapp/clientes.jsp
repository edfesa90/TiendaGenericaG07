<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import= "tienda.TiendaGenericaG07.modelo.Cliente" %>
<%@ page import= "java.util.ArrayList" %>
    
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
            <a href="ServletUsuarios" class="b">- Usuarios</a>
            <a href="#" class="b">- Clientes</a>
            <a href="ServletProveedores" class="b">- Proveedores</a>
            <a href="productos.jsp" class="b">- Productos</a>
            <a href="ventas.jsp" class="b">- Ventas</a>
            <a href="reportes.jsp" class="b">- Reportes</a>
        </nav>
        <div class="logo"> 
            <a href="index.jsp" class="b">Cerrar Sesion</a>
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Gestión de Clientes Tienda Generica</h2>
        <br />
        <form action="ServletClientes" method="get">
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
                <input type="text" placeholder="Escriba la Dirección" name="Direccion" id="Direccion" class="Direccion">
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
		                <th scope="col">Telefono</th>
		                <th scope="col">Nombre</th>
		                <th scope="col">Correo</th>
		                <th scope="col">Dirección</th>
		           </tr>
		        </thead>
		        <tbody>
		            <% ArrayList<Cliente> lista = new ArrayList<Cliente>(); 
		            lista = (ArrayList<Cliente>) request.getAttribute("lista");
		            if (lista.size() > 0){
		            	for (Cliente persona:lista){					
					%>
					<tr>
						<td></td>
		               	<td><%=persona.getCedula_cliente() %></td>
		               	<td><%=persona.getTelefono_cliente() %></td>
		               	<td><%=persona.getNombre_cliente() %></td>
		               	<td><%=persona.getEmail_cliente() %></td>
		               	<td><%=persona.getDireccion_cliente() %></td>
		            </tr>
		            <%	}
		            }%>
		        </tbody>
		    </table>

        </section>
    </section>

    

</body>
</html>