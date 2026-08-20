package Modelo;

public class moto extends vehiculo {
	private double vol_caja;

	public moto(int identificacion, String marca, String modelo, String estado, double vol_caja) {
		super(identificacion, marca, modelo, estado);
		this.vol_caja = vol_caja;
	}

	public double getVol_caja() {
		return vol_caja;
	}

	public void setVol_caja(double vol_caja) {
		this.vol_caja = vol_caja;
	}

}
