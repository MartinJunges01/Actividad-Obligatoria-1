package modelo;

public class Solicitud {
	private int id;
	private double distRecorrido;
	private String origen;
	private String destino;
	private Vehiculo tipoVehiculo;
	private double precio;
	private Cliente cliente;
	private Chofer chofer;

	public Solicitud(int id, double distRecorrido, String origen, String destino, Vehiculo tipoVehiculo,
			double precio, Cliente cliente, Chofer chofer) {
		super();
		this.id = id;
		this.distRecorrido = distRecorrido;
		this.origen = origen;
		this.destino = destino;
		this.tipoVehiculo = tipoVehiculo;
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

	public double getDistRecorrido() {
		return distRecorrido;
	}

	public void setDistRecorrido(double distRecorrido) {
		this.distRecorrido = distRecorrido;
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

	public Vehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(Vehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Chofer getChofer() {
		return chofer;
	}

	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}

}
