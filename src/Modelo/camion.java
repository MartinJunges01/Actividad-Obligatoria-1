package Modelo;

public class camion extends vehiculo {
	private double lim_cap;
	private boolean refrigerado;

	public camion(int identificacion, String marca, String modelo, String estado, double lim_cap, boolean refrigerado) {
		super(identificacion, marca, modelo, estado);
		this.lim_cap = lim_cap;
		this.refrigerado = refrigerado;
	}

	public double getLim_cap() {
		return lim_cap;
	}

	public void setLim_cap(double lim_cap) {
		this.lim_cap = lim_cap;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

}
