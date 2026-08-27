package controlador;

import java.util.ArrayList;

import modelo.Chofer;

public class ChoferController {
	private ArrayList<Chofer> choferList;

	public ChoferController() {
		this.choferList = new ArrayList<>();
	}

	public void agregarChofer(Chofer chofer) {
		this.choferList.add(chofer);
	}

	public void quitarChofer(int id) {
		this.choferList.removeIf(chofer -> chofer.getId() == id);
	}

	public Chofer buscarChofer(Chofer chofer) {
		for (Chofer c : choferList)
			if (c.getId() == chofer.getId())
				return c;
		return null;
	}
}