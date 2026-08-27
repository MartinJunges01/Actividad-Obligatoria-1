package vista;

import java.util.List;
import modelo.Vehiculo;

public class VehiculoVista {

	public void mostrarMensaje(String mensaje) {
		System.out.println("[SISTEMA] " + mensaje);
	}

	public void mostrarFlota(List<Vehiculo> flota) {
		System.out.println("=== Flota de Vehiculos ===");
		if (flota.isEmpty()) {
			System.out.println("No hay vehiculos registrados.");
		} else {
			for (Vehiculo v : flota) {
				System.out.println(v.toString());
			}
		}
	}

	public void mostrarDetalleVehiculo(Vehiculo vehiculo) {
		System.out.println("=== Detalle del Vehiculo ===");
		System.out.println(vehiculo.toString());
	}
}
