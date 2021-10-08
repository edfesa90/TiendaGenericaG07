package tienda.TiendaGenericaG07.controlador;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tienda.TiendaGenericaG07.modelo.Cliente;
import tienda.TiendaGenericaG07.modelo.ClienteDAO;

public class ControladorClientes {
	@RequestMapping("/listarClientes")
	public ArrayList<Cliente> listaDeClientes() {
		ClienteDAO objDAO = new ClienteDAO();
		return objDAO.selectAll();
	}
	
	@PostMapping("/registrarClientes")
	public ArrayList<Cliente> registrarCliente(Cliente persona) {
		ClienteDAO DAO = new ClienteDAO();
		DAO.insert(persona);
		return listaDeClientes();
	}
	
	@PostMapping("/eliminarClientes")
	public boolean borrarCliente(int cedula_cliente) {
		ClienteDAO objDAO = new ClienteDAO();
		return objDAO.delete(cedula_cliente);
	}
	
	@PostMapping("/actualizarClientes")
	public boolean actualizarCliente(Cliente persona) {
		ClienteDAO objDAO = new ClienteDAO();
		return objDAO.update(persona);
	}
	
}
