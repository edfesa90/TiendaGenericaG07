package tienda.TiendaGenericaG07.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import tienda.TiendaGenericaG07.controlador.Conexion;


public class ProveedorDAO {
	
	public boolean insertProv(Proveedor prov) {
		
		Conexion con = new Conexion();
		String sql = "INSERT INTO proveedores (nitproveedor, ciudad_proveedor, direccion_proveedor, nombre_proveedor_ telefono_proveedor) VALUES (?,?,?,?,?)";
		try {		
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setInt(1, prov.getNitProveedor());
			ps.setString(2, prov.getCiudad_proveedor());
			ps.setString(3, prov.getDireccion_proveedor());
			ps.setString(4, prov.getNombre_proveeedor());
			ps.setString(5, prov.getTelefono_proveedor());
			if (ps.executeUpdate() == 1) {
				return true;
			}else {
				System.out.println("Error al registrar usuario");
			}			
			con.desconectar();			
		}catch (SQLException e) {			
			e.printStackTrace();
		}
		
		return false;				
	}
	
	public ArrayList<Proveedor> selectAll(){
		ArrayList<Proveedor> lista = new ArrayList<Proveedor>();
		String sql = "SELECT * FROM tiendagenerica07.proveedores;";
		
		try {
			Conexion con = new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			Proveedor tablaProveedores;
			while (rs.next()) {
				tablaProveedores = new Proveedor(rs.getInt("nitproveedor"),rs.getString("ciudad_proveedor"), rs.getString("direccion_proveedor"), rs.getString("nombre_proveedor"), rs.getString("telefono_proveedor"));
				lista.add(tablaProveedores);
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
	
	public boolean updateProv(Proveedor prov){
		String sql = "UPDATE tiendagenerica07.proveedores SET ciudad_proveedor = ?, direccion_proveedor = ?, nombre_proveedor = ?, telefono_proveedor = ? WHERE nitproveedor= ?;";			
		try {
			Conexion con =new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setString(1, prov.getCiudad_proveedor());
			ps.setString(2, prov.getDireccion_proveedor());
			ps.setString(3, prov.getNombre_proveeedor());
			ps.setString(4, prov.getTelefono_proveedor());
			ps.setInt(5, prov.getNitProveedor());
			if(ps.executeUpdate() == 1){
				System.out.println("Usuario Actualizado");
				return true;
				
			}else {
				System.out.println("No se ha podido Actualizar");
			}
			con.desconectar();
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public boolean deleteProv(int nitProveedor){		
		String sql = "DELETE FROM tiendagenerica07.proveedores WHERE nitproveedor = ?;";
		try {
			Conexion con =new Conexion();
			PreparedStatement ps = con.getConexion().prepareStatement(sql);
			ps.setInt(1, nitProveedor);
			if (ps.executeUpdate()== 1) {
				System.out.println("Resgistro Eliminado");
				return true;
				
			}else {
				System.out.println("Resgistro NO se ha Eliminado");
			}
			con.desconectar();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
