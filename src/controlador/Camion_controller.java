package controlador;

import java.util.ArrayList;

import Modelo.camion;

public class Camion_controller {
	private ArrayList<camion> flota_camiones;

	public Camion_controller() {
		this.flota_camiones = new ArrayList<>();
	}

	public void agregar_camion(camion camion) {
		this.flota_camiones.add(camion);
	}

	public void quitar_camion(int id) {
		this.flota_camiones.removeIf(camion -> camion.getIdentificacion() == id);
	}

	public camion buscar_camion(camion camion) {
		for (camion c : flota_camiones)
			if (c.getIdentificacion() == camion.getIdentificacion())
				return c;
		return null;
	}
}
