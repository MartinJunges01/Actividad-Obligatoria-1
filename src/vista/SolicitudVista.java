package vista;

import java.util.List;
import modelo.Solicitud;

public class SolicitudVista {

	public void mostrarMensaje(String mensaje) {
		System.out.println("[SISTEMA] " + mensaje);
	}

	public void mostrarSolicitudes(List<Solicitud> solicitudes) {
		System.out.println("=== Lista de Solicitudes ===");
		if (solicitudes.isEmpty()) {
			System.out.println("No hay solicitudes registradas.");
		} else {
			for (Solicitud s : solicitudes) {
				System.out.println(s.toString());
			}
		}
	}

	public void mostrarDetalleSolicitud(Solicitud solicitud) {
		System.out.println("=== Detalle de la Solicitud ===");
		System.out.println(solicitud.toString());
	}
}
