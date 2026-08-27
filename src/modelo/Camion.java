package modelo;

public class Camion extends Vehiculo {
	private double limCap;
	private boolean refrigerado;

	public Camion(int identificacion, String marca, String modelo, String estado, double limCap, boolean refrigerado) {
		super(identificacion, marca, modelo, estado);
		this.limCap = limCap;
		this.refrigerado = refrigerado;
	}

	public double getLimCap() {
		return limCap;
	}

	public void setLimCap(double limCap) {
		this.limCap = limCap;
	}

	public boolean isRefrigerado() {
		return refrigerado;
	}

	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

}
