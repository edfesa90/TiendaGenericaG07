package tienda.TiendaGenericaG07.vista;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tienda.TiendaGenericaG07.controlador.Controlador;
import tienda.TiendaGenericaG07.modelo.Usuario;

@WebServlet("/ServletUsuarios")
public class ServletUsuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletUsuarios() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Controlador ctrl = new Controlador();
		String boton = (String) request.getParameter("accion");
		ArrayList<Usuario> lista;
		String crear = "Crear";
		String borrar = "Borrar";
		String actualizar = "Actualizar";
		String consultar = "Consultar";
		
		if (crear.equals(boton)) {
			Integer Cedula = Integer.parseInt(request.getParameter("Cedula"));
			String Usuario = (String) request.getParameter("Usuario");
			String Nombre = (String) request.getParameter("Nombre");
			String password = (String) request.getParameter("password");
			String Correo = (String) request.getParameter("Correo");
			System.out.println(Cedula + Usuario + Nombre + password + Correo);
			Usuario persona = new Usuario(Cedula, Correo, Nombre, password, Usuario);
			
			lista = ctrl.registrarUsuario(persona);
		}else if(borrar.equals(boton)){
			Integer Cedula = Integer.parseInt(request.getParameter("Cedula"));
			ctrl.borrarUsuario(Cedula);
		}else if(actualizar.equals(boton)){
			Integer Cedula = Integer.parseInt(request.getParameter("Cedula"));
			String Usuario = (String) request.getParameter("Usuario");
			String Nombre = (String) request.getParameter("Nombre");
			String password = (String) request.getParameter("password");
			String Correo = (String) request.getParameter("Correo");
			System.out.println(Cedula + Usuario + Nombre + password + Correo);
			Usuario persona = new Usuario(Cedula, Correo, Nombre, password, Usuario);
			ctrl.actualizarUsuario(persona);
		}/*else if(consultar.equals(boton)){
			Integer Cedula = Integer.parseInt(request.getParameter("Cedula"));
			ctrl.consultarUsuario(Cedula);
		}*/else {
			
		}

		lista = ctrl.listaDeUsuarios();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("usuarios.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
