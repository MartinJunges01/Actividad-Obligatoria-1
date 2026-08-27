package modelo;

public class Moto extends Vehiculo {
	private double volCaja;

	public Moto(int identificacion, String marca, String modelo, String estado, double volCaja) {
		super(identificacion, marca, modelo, estado);
		this.volCaja = volCaja;
	}

	public double getVolCaja() {
		return volCaja;
	}

	public void setVolCaja(double volCaja) {
		this.volCaja = volCaja;
	}

	@Override
	public String toString() {
		return super.toString() + " -> Moto [volCaja=" + volCaja + "]";
	}

}
