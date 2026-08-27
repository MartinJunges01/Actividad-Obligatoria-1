package controlador;

import java.util.ArrayList;

import modelo.Solicitud;
import vista.SolicitudVista;

public class SolicitudController {
	private ArrayList<Solicitud> solicitudesList = new ArrayList<>();
	private SolicitudVista vista;

	public SolicitudController(SolicitudVista vista) {
		this.vista = vista;
	}

	public void agregarSolicitud(Solicitud solicitud) {
		this.solicitudesList.add(solicitud);
		vista.mostrarMensaje("Solicitud agregada con exito.");
	}

	public void quitarSolicitud(int id) {
		boolean removido = this.solicitudesList.removeIf(solicitud -> solicitud.getId() == id);
		if(removido) {
			vista.mostrarMensaje("Solicitud eliminada.");
		} else {
			vista.mostrarMensaje("Solicitud no encontrada.");
		}
	}

	public Solicitud buscarSolicitud(int id) {
		for (Solicitud s : solicitudesList) {
			if (s.getId() == id) {
				return s;
			}
		}
		vista.mostrarMensaje("Solicitud no encontrada.");
		return null;
	}
	
	public void mostrarSolicitudes() {
		vista.mostrarSolicitudes(this.solicitudesList);
	}
	
	public void mostrarDetalleSolicitud(int id) {
		Solicitud s = buscarSolicitud(id);
		if (s != null) {
			vista.mostrarDetalleSolicitud(s);
		}
	}
}
