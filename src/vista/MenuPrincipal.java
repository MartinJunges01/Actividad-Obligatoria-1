package vista;

import java.util.Scanner;

import controlador.SolicitudController;
import controlador.UsuarioController;
import controlador.VehiculoController;

public class MenuPrincipal {
	private VehiculoController vehiculoController;
	private UsuarioController usuarioController;
	private SolicitudController solicitudController;
	private Scanner scanner;

	public MenuPrincipal() {
		this.vehiculoController = new VehiculoController(new VehiculoVista());
		this.usuarioController = new UsuarioController(new UsuarioVista());
		this.solicitudController = new SolicitudController(new SolicitudVista());
		this.scanner = new Scanner(System.in);
	}

	public void iniciar() {
		int opcion = -1;
		while (opcion != 0) {
			System.out.println("=== SISTEMA DE LOGISTICA Y TRANSPORTE ===");
			System.out.println("1. Gestionar Vehiculos");
			System.out.println("2. Gestionar Usuarios");
			System.out.println("3. Gestionar Solicitudes");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opcion: ");
			
			try {
				opcion = Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Opcion invalida.");
				continue;
			}

			switch (opcion) {
			case 1:
				System.out.println("Mostrando flota...");
				vehiculoController.mostrarFlota();
				break;
			case 2:
				System.out.println("Mostrando usuarios...");
				usuarioController.mostrarUsuarios();
				break;
			case 3:
				System.out.println("Mostrando solicitudes...");
				solicitudController.mostrarSolicitudes();
				break;
			case 0:
				System.out.println("Saliendo del sistema...");
				break;
			default:
				System.out.println("Opcion no valida.");
			}
			System.out.println();
		}
		scanner.close();
	}

	public static void main(String[] args) {
		MenuPrincipal menu = new MenuPrincipal();
		menu.iniciar();
	}
}
