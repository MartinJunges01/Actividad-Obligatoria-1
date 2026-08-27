package modelo;

public abstract class Solicitud {
	private int id;
	private double distRecorrido;
	private String origen;
	private String destino;
	private Vehiculo vehiculo;
	private double precio;
	private Cliente cliente;
	private Chofer chofer;

	public enum EstadoSolicitud {
		INICIADA, CONFIRMADA, EN_CURSO, FINALIZADA, CANCELADA
	}

	private EstadoSolicitud estadoActual;

	public Solicitud(int id, double distRecorrido, String origen, String destino, Vehiculo vehiculo, Cliente cliente,
			Chofer chofer, EstadoSolicitud estadoActual) {
		this.id = id;
		this.distRecorrido = distRecorrido;
		this.origen = origen;
		this.destino = destino;
		this.vehiculo = vehiculo;
		this.cliente = cliente;
		this.chofer = chofer;
		this.estadoActual = estadoActual;
		this.precio = this.calcularPrecio();
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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public abstract double calcularPrecio();

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

	public EstadoSolicitud getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(EstadoSolicitud estadoActual) {
		this.estadoActual = estadoActual;
	}

	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", distRecorrido=" + distRecorrido + ", origen=" + origen + ", destino=" + destino
				+ ", vehiculoId=" + (vehiculo != null ? vehiculo.getIdentificacion() : "N/A") 
				+ ", precio=" + precio 
				+ ", clienteId=" + (cliente != null ? cliente.getId() : "N/A") 
				+ ", choferId=" + (chofer != null ? chofer.getId() : "N/A") 
				+ ", estado=" + estadoActual 
				+ ", tipo=" + this.getClass().getSimpleName() + "]";
	}
}
