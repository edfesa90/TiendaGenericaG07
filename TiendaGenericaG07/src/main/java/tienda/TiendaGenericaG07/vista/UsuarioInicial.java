package tienda.TiendaGenericaG07.vista;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tienda.TiendaGenericaG07.modelo.Usuario;
import tienda.TiendaGenericaG07.modelo.UsuarioDAO;


@WebServlet("/UsuarioInicial")
public class UsuarioInicial extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UsuarioInicial() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
			
		int cedula_usuario = Integer.parseInt(request.getParameter("cedula_usuario"));
		String email_usuario = request.getParameter("email_usuario");
		String nombre_usuario = request.getParameter("nombre_usuario");
		String password = request.getParameter("password");
		String usuario = request.getParameter("usuario");
		
		UsuarioDAO ud = new UsuarioDAO();
		Usuario mod = new Usuario(cedula_usuario, email_usuario,nombre_usuario,password,usuario);
		
		ud.insert(mod);
		if(mod != null) {
			response.sendRedirect("principal.jsp");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
