package Modelo;

public class solicitud {
	private int id;
	private double dist_recorrido;
	private String origen;
	private String destino;
	private vehiculo tipo_vehiculo;
	private double precio;
	private cliente cliente;
	private chofer chofer;

	public solicitud(int id, double dist_recorrido, String origen, String destino, vehiculo tipo_vehiculo,
			double precio, Modelo.cliente cliente, Modelo.chofer chofer) {
		super();
		this.id = id;
		this.dist_recorrido = dist_recorrido;
		this.origen = origen;
		this.destino = destino;
		this.tipo_vehiculo = tipo_vehiculo;
		this.precio = precio;
		this.cliente = cliente;
		this.chofer = chofer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getDist_recorrido() {
		return dist_recorrido;
	}

	public void setDist_recorrido(double dist_recorrido) {
		this.dist_recorrido = dist_recorrido;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public vehiculo getTipo_vehiculo() {
		return tipo_vehiculo;
	}

	public void setTipo_vehiculo(vehiculo tipo_vehiculo) {
		this.tipo_vehiculo = tipo_vehiculo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	public chofer getChofer() {
		return chofer;
	}

	public void setChofer(chofer chofer) {
		this.chofer = chofer;
	}

}
