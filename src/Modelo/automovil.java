package Modelo;

public class automovil extends vehiculo {
	private int cap_asientos;
	private double vol_equipaje;

	public automovil(int identificacion, String marca, String modelo, String estado, int cap_asientos,
			double vol_equipaje) {
		super(identificacion, marca, modelo, estado);
		this.cap_asientos = cap_asientos;
		this.vol_equipaje = vol_equipaje;
	}

	public int getCap_asientos() {
		return cap_asientos;
	}

	public void setCap_asientos(int cap_asientos) {
		this.cap_asientos = cap_asientos;
	}

	public double getVol_equipaje() {
		return vol_equipaje;
	}

	public void setVol_equipaje(double vol_equipaje) {
		this.vol_equipaje = vol_equipaje;
	}

}
