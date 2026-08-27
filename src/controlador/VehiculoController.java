package controlador;

import java.util.ArrayList;

import modelo.Vehiculo;
import vista.VehiculoVista;

public class VehiculoController {
	private ArrayList<Vehiculo> flota = new ArrayList<>();
	private VehiculoVista vista;

	public VehiculoController(VehiculoVista vista) {
		this.vista = vista;
	}

	public void agregarVehiculo(Vehiculo vehiculo) {
		this.flota.add(vehiculo);
		vista.mostrarMensaje("Vehiculo agregado con exito.");
	}

	public void quitarVehiculo(int id) {
		boolean removido = this.flota.removeIf(vehiculo -> vehiculo.getIdentificacion() == id);
		if(removido) {
			vista.mostrarMensaje("Vehiculo eliminado.");
		} else {
			vista.mostrarMensaje("Vehiculo no encontrado.");
		}
	}

	public Vehiculo buscarVehiculo(int id) {
		for (Vehiculo v : flota) {
			if (v.getIdentificacion() == id) {
				return v;
			}
		}
		vista.mostrarMensaje("Vehiculo no encontrado.");
		return null;
	}
	
	public void mostrarFlota() {
		vista.mostrarFlota(this.flota);
	}
	
	public void mostrarDetalleVehiculo(int id) {
		Vehiculo v = buscarVehiculo(id);
		if (v != null) {
			vista.mostrarDetalleVehiculo(v);
		}
	}
}
