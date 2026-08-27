package controlador;

import java.util.ArrayList;

import Modelo.chofer;

public class Chofer_controller {
	private ArrayList<chofer> chofer_list;

	public Chofer_controller() {
		this.chofer_list = new ArrayList<>();
	}

	public void agregar_chofer(chofer chofer) {
		this.chofer_list.add(chofer);
	}

	public void quitar_chofer(int id) {
		this.chofer_list.removeIf(chofer -> chofer.getId() == id);
	}

	public chofer buscar_chofer(chofer chofer) {
		for (chofer c : chofer_list)
			if (c.getId() == chofer.getId())
				return c;
		return null;
	}
}