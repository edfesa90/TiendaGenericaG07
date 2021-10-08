package tienda.TiendaGenericaG07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tienda.TiendaGenericaG07.controlador.CtrProveedor;
import tienda.TiendaGenericaG07.modelo.ProveedorDAO;

@SpringBootApplication
public class TiendaGenericaG07Application {

	public static void main(String[] args) {
		SpringApplication.run(TiendaGenericaG07Application.class, args);
				
	}

}
