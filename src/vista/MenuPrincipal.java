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

		cargarDatosDePrueba();
	}

	private void cargarDatosDePrueba() {
		// Hardcodear objetos para probar
		modelo.Automovil auto = new modelo.Automovil(101, "Toyota", "Corolla", "Activo", 4, 1.5);
		modelo.Moto moto = new modelo.Moto(102, "Honda", "CG 150", "Activo", 0.5);
		modelo.Camion camion = new modelo.Camion(103, "Mercedes", "Atego", "Mantenimiento", 15.0, true);

		vehiculoController.agregarVehiculo(auto);
		vehiculoController.agregarVehiculo(moto);
		vehiculoController.agregarVehiculo(camion);

		modelo.Cliente cliente1 = new modelo.Cliente(1, "Juan Perez");
		modelo.Chofer chofer1 = new modelo.Chofer(2, "Ana Gomez");

		usuarioController.agregarUsuario(cliente1);
		usuarioController.agregarUsuario(chofer1);

		modelo.SolicitudPasajeros solPasajeros = new modelo.SolicitudPasajeros(1001, 15.5, "Centro", "Aeropuerto", auto,
				cliente1, chofer1, modelo.Solicitud.EstadoSolicitud.CONFIRMADA, 2);

		modelo.SolicitudEnvios solEnvios = new modelo.SolicitudEnvios(1002, 45.0, "Almacen A", "Sucursal B", camion,
				cliente1, chofer1, modelo.Solicitud.EstadoSolicitud.EN_CURSO, 10.0, true);

		solicitudController.agregarSolicitud(solPasajeros);
		solicitudController.agregarSolicitud(solEnvios);
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
