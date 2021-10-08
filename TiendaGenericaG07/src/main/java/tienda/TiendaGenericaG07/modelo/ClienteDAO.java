package tienda.TiendaGenericaG07.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tienda.TiendaGenericaG07.controlador.Conexion;


public class ClienteDAO {
	
	public boolean insert (Cliente mod) {
		boolean flag = false;
		Conexion con = new Conexion();
		String sql = "INSERT INTO clientes (cedula_cliente, direccion_cliente, email_cliente, nombre_cliente, telefono_cliente) VALUES (?,?,?,?,?)";
				
		try {
			
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setInt(1, mod.getCedula_cliente());
			ps.setString(2, mod.getDireccion_cliente());
			ps.setString(3, mod.getEmail_cliente());
			ps.setString(4, mod.getNombre_cliente());
			ps.setString(5, mod.getTelefono_cliente());
			if (ps.executeUpdate() == 1) {
				flag = true;
			}else {
				System.out.println("Error al registrar cliente");
			}			
			con.desconectar();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}
	
	
	public ArrayList<Cliente> selectAll(){
		ArrayList<Cliente> lista = new ArrayList<Cliente>();
		String sql = "SELECT * FROM tiendagenerica07.clientes;";
		
		try {
			Conexion con = new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			Cliente tablaClientes;
			while (rs.next()) {
				tablaClientes = new Cliente(rs.getInt("cedula_cliente"),rs.getString("direccion_cliente"), rs.getString("email_cliente"), rs.getString("nombre_cliente"), rs.getString("telefono_cliente"));
				lista.add(tablaClientes);
			}
			
			if (lista.size()< 0) {
				System.out.println("No hay ningun registro");
			}
			con.desconectar();			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println(lista);
		return lista;
		
	}
	
	public boolean update(Cliente mod){
		boolean flag =false;
		String sql = "UPDATE tiendagenerica07.clientes SET direccion_cliente = ?, email_cliente = ?, nombre_cliente = ?, telefono_cliente = ? WHERE cedula_cliente= ?;";			
		try {
			Conexion con =new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setString(1, mod.getDireccion_cliente());
			ps.setString(2, mod.getEmail_cliente());
			ps.setString(3, mod.getNombre_cliente());
			ps.setString(4, mod.getTelefono_cliente());
			ps.setInt(5, mod.getCedula_cliente());
			if(ps.executeUpdate() == 1){
				flag = true;
				System.out.println("Usuario Actualizado");
			}else {
				System.out.println("No se ha podido Actualizar");
			}
			con.desconectar();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean delete(int cedula_usuario){
		Boolean flag = false;
		String sql = "DELETE FROM tiendagenerica07.clientes WHERE cedula_cliente = ?;";
		try {
			Conexion con =new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setInt(1, cedula_usuario);
			if (ps.executeUpdate()== 1) {
				flag = true;
				System.out.println("Resgistro Eliminado");
			}else {
				System.out.println("Resgistro NO se ha Eliminado");
			}
			con.desconectar();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return flag;
	}


}
