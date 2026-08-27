package modelo;

public class Automovil extends Vehiculo {
	private int capAsientos;
	private double volEquipaje;

	public Automovil(int identificacion, String marca, String modelo, String estado, int capAsientos,
			double volEquipaje) {
		super(identificacion, marca, modelo, estado);
		this.capAsientos = capAsientos;
		this.volEquipaje = volEquipaje;
	}

	public int getCapAsientos() {
		return capAsientos;
	}

	public void setCapAsientos(int capAsientos) {
		this.capAsientos = capAsientos;
	}

	public double getVolEquipaje() {
		return volEquipaje;
	}

	public void setVolEquipaje(double volEquipaje) {
		this.volEquipaje = volEquipaje;
	}

}
