package modelo;

public abstract class Vehiculo {
	private int identificacion;
	private String marca;
	private String modelo;
	private String estado;

	public Vehiculo(int identificacion, String marca, String modelo, String estado) {
		super();
		this.identificacion = identificacion;
		this.marca = marca;
		this.modelo = modelo;
		this.estado = estado;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Vehiculo [identificacion=" + identificacion + ", marca=" + marca + ", modelo=" + modelo + ", estado="
				+ estado + ", tipo=" + this.getClass().getSimpleName() + "]";
	}
}
