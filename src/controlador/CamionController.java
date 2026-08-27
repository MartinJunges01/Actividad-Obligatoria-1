package controlador;

import java.util.ArrayList;

import modelo.Camion;

public class CamionController {
	private ArrayList<Camion> flotaCamiones;

	public CamionController() {
		this.flotaCamiones = new ArrayList<>();
	}

	public void agregarCamion(Camion camion) {
		this.flotaCamiones.add(camion);
	}

	public void quitarCamion(int id) {
		this.flotaCamiones.removeIf(camion -> camion.getIdentificacion() == id);
	}

	public Camion buscarCamion(Camion camion) {
		for (Camion c : flotaCamiones)
			if (c.getIdentificacion() == camion.getIdentificacion())
				return c;
		return null;
	}
}
