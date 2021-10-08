package tienda.TiendaGenericaG07.vista;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tienda.TiendaGenericaG07.controlador.Controlador;
import tienda.TiendaGenericaG07.controlador.ControladorClientes;
import tienda.TiendaGenericaG07.modelo.Cliente;

@WebServlet("/ServletClientes")
public class ServletClientes extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletClientes() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ControladorClientes ctrl = new ControladorClientes();
		String boton = (String) request.getParameter("accion");
		ArrayList<Cliente> lista;
		String crear = "Crear";
		String borrar = "Borrar";
		String actualizar = "Actualizar";
		
		if (crear.equals(boton)) {
			Integer cedula_cliente = Integer.parseInt(request.getParameter("cedula"));
			String direccion_cliente = (String) request.getParameter("Direccion");
			String email_cliente = (String) request.getParameter("Correo");
			String nombre_cliente = (String) request.getParameter("Nombre");
			String telefono_cliente = (String) request.getParameter("Telefono");
			System.out.println(cedula_cliente + direccion_cliente + email_cliente + nombre_cliente + telefono_cliente);
			Cliente persona = new Cliente(cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente);
			
			lista = ctrl.registrarCliente(persona);
		}else if(borrar.equals(boton)){
			Integer cedula_cliente = Integer.parseInt(request.getParameter("cedula"));
			ctrl.borrarCliente(cedula_cliente);
		}else if(actualizar.equals(boton)){
			Integer cedula_cliente = Integer.parseInt(request.getParameter("cedula"));
			String direccion_cliente = (String) request.getParameter("Direccion");
			String email_cliente = (String) request.getParameter("Correo");
			String nombre_cliente = (String) request.getParameter("Nombre");
			String telefono_cliente = (String) request.getParameter("Telefono");
			System.out.println(cedula_cliente + direccion_cliente + email_cliente + nombre_cliente + telefono_cliente);
			Cliente persona = new Cliente(cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente);
			ctrl.actualizarCliente(persona);
		}

		lista = ctrl.listaDeClientes();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("clientes.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
