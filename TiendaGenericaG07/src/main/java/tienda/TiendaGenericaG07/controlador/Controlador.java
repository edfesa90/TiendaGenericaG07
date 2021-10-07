package tienda.TiendaGenericaG07.controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tienda.TiendaGenericaG07.modelo.Usuario;
import tienda.TiendaGenericaG07.modelo.UsuarioDAO;


public class Controlador {
	
	public Boolean autenticacion(String usuario, String password){
		Conexion con = new Conexion();
		Usuario mod = new Usuario();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		String consulta = "SELECT * FROM usuarios U WHERE U.usuario = ? AND U.password = ?";
		try {
			
			ps = con.getConexion().prepareStatement(consulta);
			ps.setString(1, usuario);
			ps.setString(2, password);
			rs = ps.executeQuery();
						
			if(rs.next()) {
				mod = new Usuario();
				//mod.setCedula_usuario(rs.getInt("cedula_usuario"));
				mod.setUsuario(rs.getString("usuario"));
				mod.setPassword(rs.getString("password"));
				System.out.println("Con login");
				return true;
			}else {
				System.out.println("Sin Login");
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping("/listarUsuarios")
	public ArrayList<Usuario> listaDeUsuarios() {
		UsuarioDAO objDAO = new UsuarioDAO();
		return objDAO.selectAll();
	}
	
	@PostMapping("/registrarUsuario")
	public ArrayList<Usuario> registrarUsuario(@RequestBody Usuario persona) {
		UsuarioDAO DAO = new UsuarioDAO();
		DAO.insert(persona);
		return listaDeUsuarios();
	}
	
	public boolean borrarUsuario(int cedula_usuario) {
		UsuarioDAO objDAO = new UsuarioDAO();
		return objDAO.delete(cedula_usuario);
	}
	
	public boolean actualizarUsuario(Usuario persona) {
		UsuarioDAO objDAO = new UsuarioDAO();
		return objDAO.update(persona);
	}
	
	public boolean consultarUsuario(int cedula_usuario) {
		UsuarioDAO objDAO = new UsuarioDAO();
		ArrayList<Usuario> lista = objDAO.selectAll();
		for(Usuario persona : lista) {
			if (persona.getCedula_usuario().equals(cedula_usuario)) {
				borrarUsuario(cedula_usuario);
				return true;
			}
		}
		return false;
		
	}
	

	
}
	
