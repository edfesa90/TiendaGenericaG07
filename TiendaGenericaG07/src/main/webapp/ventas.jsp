<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="Estilos css/Estilos3.css">
	<title>Usuarios</title>
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
            <a href="productos.jsp" class="b">◦ Productos</a>
            <a href="" class="b">◦ Ventas</a>
            <a href="reportes.jsp" class="b">◦ Reportes</a>
        </nav>
        <div class="logo"> 
            
        </div>
    </header>

	<section class="main">
        <br />
        <h2>Gestión de Usuarios Tienda Generica</h2>
        <br />
        <form action="pruebaServlet" method="get" class="padre">
            <table>
                <tr>
                    <td>
                        <label>Cedula:</label>
                        <input type="text" placeholder="Escriba la Cedula" name="Cedula" id="Cedula" class="Cedula">
                        <button name="Consultar" class="acciones">Consultar</button>
                    </td>
                    <td><label>Cliente:</label></td>
                    <td><input type="text" name="Cliente" id="Cliente" class="Cliente"></td>
                    <td><label>Consec.</label></td>
                    <td><input type="text" name="Consecutivo" id="Consecutivo" class="Consecutivo"></td>
                </tr>
            </table>

            <table class="segunda">
                <tr>
                    <td><label class="edit">Codigo Producto</label></td>
                    <td><label class="edit">Nombre Producto</label></td>
                    <td class="mas"><label class="Canti">Cant</label></td>
                    <td><label class="edit">Valor Total</label></td>
                </tr>

                <tr>
                    <td>
                        <input type="text" placeholder="Escriba codigo" name="Cedula" id="Cedula" class="Cedula">
                        <button name="Consultar" class="acciones">Consultar</button>
                    </td>
                    <td><input type="text" name="Nombre prod" id="Producto" class="Producto"></td>
                    <td class="mas"><input type="text" name="Cant" id="Cant" class="Cant"></td>
                    <td><input type="text" name="Valor" id="Valor" class="Valor"></td>
                </tr>    
                
                <tr>
                    <td>
                        <input type="text" placeholder="Escriba codigo" name="Cedula" id="Cedula" class="Cedula">
                        <button name="Consultar" class="acciones">Consultar</button>
                    </td>
                    <td><input type="text" name="Nombre prod" id="Producto" class="Producto"></td>
                    <td class="mas"><input type="text" name="Cant" id="Cant" class="Cant"></td>
                    <td><input type="text" name="Valor" id="Valor" class="Valor"></td>
                </tr>

                <tr>
                    <td>
                        <input type="text" placeholder="Escriba codigo" name="Cedula" id="Cedula" class="Cedula">
                        <button name="Consultar" class="acciones">Consultar</button>
                    </td>
                        <td><input type="text" name="Nombre prod" id="Producto" class="Producto"></td>
                        <td class="mas"><input type="text" name="Cant" id="Cant" class="Cant"></td>
                        <td><input type="text" name="Valor" id="Valor" class="Valor"></td>
                </tr>
            </table>


            <table class="tercera">
                <tr>
                    <td><label>Total Venta:</label></td>
                    <td><input type="text" name="Venta" id="Venta" class="Venta"></td>
                    
                </tr>
                <tr>
                    <td><label>Total IVA:</label></td>
                    <td><input type="text" name="IVA" id="IVA" class="IVA"></td>
                </tr>
                <tr>
                    <td><label>Total con IVA:</label></td>
                    <td><input type="text" name="Total" id="Total" class="Total"></td>
                    
                </tr>
			</table>
			
            <button name="Confirmar" class="Confirmar">Confirmar</button>
        </form>

    </section>

    

</body>
</html>