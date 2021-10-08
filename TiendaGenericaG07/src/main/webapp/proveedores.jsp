<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@page import="tienda.TiendaGenericaG07.modelo.Proveedor"%>
    <%@ page import= "java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos1.css">
	<title>Proveedores</title>
</head>
<body>

	<%
	Proveedor p = new Proveedor(0,"","","","");
	if (request.getAttribute("objProveedor") != null){
		p = (Proveedor)request.getAttribute("objProveedor");
	}
	%>
	
	
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
        <h2>Gestión de Proveedores Tienda Generica</h2>
        <br />

        <form action="./ServletProveedores" method="get">
            <div>
                <label>NIT:</label>
                <input type="text" placeholder="Escriba el NIT del proveedor" name="nitproveedor" id="NIT" class="NIT" value ="<%=p.getNitProveedor()%>">
                <br /> 
                <label>Telefono:</label>
                <input type="text" placeholder="Escriba el Telefono" name="telefono_proveedor" id="Telefono" class="Telefono" value ="<%=p.getTelefono_proveedor()%>">
                <br />
                <label>Nombre:</label>
                <input type="text" placeholder="Escriba el Nombre del proveedor" name="nombre_proveedor" id="Nombre" class="Nombre"value ="<%=p.getNombre_proveeedor()%>">
                <br /> 
                <label>Ciudad:</label>
                <input type="text" placeholder="Escriba la Ciudad" name="ciudad_proveedor" id="Ciudad" class="Ciudad"value ="<%=p.getCiudad_proveedor()%>">
                <br /> 
                <label>Dirección:</label>
                <input type="text" placeholder="Escriba la Dirección" name="direccion_proveedor" id="Dirección" class="Dirección" value ="<%=p.getDireccion_proveedor()%>">
                <!--<label class="espacio"> . </label>-->
                <br />
                <button type = "submit" name="accion" value="Consultar" class="acciones">Consultar</button>
                <button type = "submit" name="accion" value="Crear" class="acciones">Crear</button>
                <button type = "submit" name="accion" value="Actualizar" class="acciones">Actualizar</button>
                <button type = "submit" name="accion" value="Borrar" class="acciones">Borrar</button>
            </div>
        </form>

        <section class="datos">
            <h2>Proveedores</h2>
            <br />
            <table>
            <thead>
                <tr>
                    <th scope="col"><img src="https://img.icons8.com/nolan/64/checked.png"/></th>
		                <th scope="col">NIT</th>
		                <th scope="col">Nombre</th>
		                <th scope="col">Ciudad</th>
		                <th scope="col">Telefono</th>
		                <th scope="col">Direccion</th>                    
                </tr>
                </thead>
                
                
              
                
</table>


        </section>
    </section>
</body>
</html>