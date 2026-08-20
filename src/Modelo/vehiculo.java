package Modelo;

public class vehiculo {
	private int identificacion;
	private String marca;
	private String modelo;
	private String estado;

	public vehiculo(int identificacion, String marca, String modelo, String estado) {
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
}
