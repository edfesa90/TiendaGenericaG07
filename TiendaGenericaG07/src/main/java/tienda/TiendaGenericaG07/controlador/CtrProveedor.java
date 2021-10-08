package tienda.TiendaGenericaG07.controlador;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import tienda.TiendaGenericaG07.modelo.Proveedor;
import tienda.TiendaGenericaG07.modelo.ProveedorDAO;

public class CtrProveedor {
	
	@RequestMapping("/listarProveedores")
	public ArrayList<Proveedor> listaDeProveedores() {
		ProveedorDAO objDAO = new ProveedorDAO();
		return objDAO.selectAll();
	}
	
	@PostMapping("/registrarProveedor")
	public ArrayList<Proveedor> registrarProveedor(@RequestBody Proveedor nit) {
		ProveedorDAO DAO = new ProveedorDAO();
		DAO.insertProv(nit);
		return listaDeProveedores();
	}
	
	public boolean borrarProveedor(int nitproveedor) {
		ProveedorDAO objDAO = new ProveedorDAO();
		return objDAO.deleteProv(nitproveedor);
	}
	
	public boolean actualizarProveedor(Proveedor nit) {
		ProveedorDAO objDAO = new ProveedorDAO();
		return objDAO.updateProv(nit);
	}
	
	public boolean consultarProveedor(int nit) {
		ProveedorDAO objDAO = new ProveedorDAO();
		ArrayList<Proveedor> lista = objDAO.selectAll();
		for(Proveedor nitProv : lista) {
			if (nitProv.getNitProveedor().equals(nit)) {
				borrarProveedor(nit);
				return true;
			}
		}
		return false;
		
	}
	
	public Proveedor listarProveedor(int nitproveedor) {
		Conexion con =new Conexion();
		 
		try {
			Statement stm = con.getConexion().createStatement();
			String sql = "SELECT * FROM tiendagenerica07.proveedores WHERE nitproveedor = '"+nitproveedor+"'";
			ResultSet rs = stm.executeQuery(sql);
			if(rs.next()) {
				return (new Proveedor(rs.getInt("nitproveedor"),rs.getString("ciudad_proveedor"), rs.getString("direccion_proveedor"), rs.getString("nombre_proveedor"), rs.getString("telefono_proveedor")));
			}	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	

}
