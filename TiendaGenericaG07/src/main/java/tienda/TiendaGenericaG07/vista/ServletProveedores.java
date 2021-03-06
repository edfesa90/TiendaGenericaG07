package tienda.TiendaGenericaG07.vista;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tienda.TiendaGenericaG07.controlador.CtrProveedor;
import tienda.TiendaGenericaG07.modelo.Proveedor;


@WebServlet("/ServletProveedores")
public class ServletProveedores extends HttpServlet {
	private static final long serialVersionUID = 1L;      
    
    public ServletProveedores() {
        super();       
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		CtrProveedor ctrl = new CtrProveedor();
		String boton = (String) request.getParameter("accion");
		ArrayList<Proveedor> lista;
		String crear = "Crear";
		String borrar = "Borrar";
		String actualizar = "Actualizar";
		String consultar = "Consultar";
		
		Integer nitproveedor = Integer.parseInt(request.getParameter("nitproveedor")!= null? request.getParameter("nitproveedor"):"");
		String ciudad_proveedor = (String) request.getParameter("ciudad_proveedor")!= null? request.getParameter("ciudad_proveedor"):"";
		String direccion_proveedor = (String) request.getParameter("direccion_proveedor")!= null? request.getParameter("direccion_proveedor"):"";
		String nombre_proveedor = (String) request.getParameter("nombre_proveedor")!= null? request.getParameter("nombre_proveedor"):"";
		String telefono_proveedor = (String) request.getParameter("telefono_proveedor")!= null? request.getParameter("telefono_proveedor"):"";
		
		if (crear.equals(boton)) {
			
			System.out.println(nitproveedor + ciudad_proveedor + direccion_proveedor + nombre_proveedor + telefono_proveedor);
			Proveedor nit = new Proveedor(nitproveedor, ciudad_proveedor, direccion_proveedor, nombre_proveedor, telefono_proveedor);
			lista = ctrl.registrarProveedor(nit);
			
		}else if(borrar.equals(boton)){
			
			ctrl.borrarProveedor(nitproveedor);			
			
		}else if(actualizar.equals(boton)){
			
			System.out.println(nitproveedor + ciudad_proveedor + direccion_proveedor + nombre_proveedor + telefono_proveedor);
			Proveedor nit = new Proveedor(nitproveedor, ciudad_proveedor, direccion_proveedor, nombre_proveedor, telefono_proveedor);
			ctrl.actualizarProveedor(nit);
			
		}else if(consultar.equals(boton)){
			
			Proveedor p = ctrl.listarProveedor(nitproveedor);
			request.setAttribute("objProveedor", p);
			request.getRequestDispatcher("proveedores.jsp").forward(request, response);
			
		}else {
			
		}

		lista = ctrl.listaDeProveedores();
		request.setAttribute("lista", lista);
		
		request.getRequestDispatcher("proveedores.jsp").forward(request, response);
	
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
