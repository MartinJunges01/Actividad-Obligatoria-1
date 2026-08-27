package modelo;

public class SolicitudPasajeros extends Solicitud {
	private int cantPasajeros;

	public SolicitudPasajeros(int id, double distRecorrido, String origen, String destino, Vehiculo vehiculo,
			Cliente cliente, Chofer chofer, EstadoSolicitud estadoActual, int cantPasajeros) {
		super(id, distRecorrido, origen, destino, vehiculo, cliente, chofer, estadoActual);
		this.cantPasajeros = cantPasajeros;
		this.setPrecio(this.calcularPrecio());
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	@Override
	public double calcularPrecio() {
		return this.getDistRecorrido() * 1.35;
	}

	@Override
	public String toString() {
		return super.toString() + " -> SolicitudPasajeros [cantPasajeros=" + cantPasajeros + "]";
	}
}
