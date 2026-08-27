package modelo;

public class SolicitudEnvios extends Solicitud {
	private double capNecesaria;
	private boolean refNecesaria;

	public SolicitudEnvios(int id, double distRecorrido, String origen, String destino, Vehiculo vehiculo,
			Cliente cliente, Chofer chofer, EstadoSolicitud estadoActual, double capNecesaria,
			boolean refNecesaria) {
		super(id, distRecorrido, origen, destino, vehiculo, cliente, chofer, estadoActual);
		this.capNecesaria = capNecesaria;
		this.refNecesaria = refNecesaria;
		this.setPrecio(this.calcularPrecio());
	}

	public double getCapNecesaria() {
		return capNecesaria;
	}

	public void setCapNecesaria(double capNecesaria) {
		this.capNecesaria = capNecesaria;
	}

	public boolean isRefNecesaria() {
		return refNecesaria;
	}

	public void setRefNecesaria(boolean refNecesaria) {
		this.refNecesaria = refNecesaria;
	}

	@Override
	public double calcularPrecio() {
		if (this.isRefNecesaria()) {
			return this.getDistRecorrido() * 1.5;
		}
		return this.getDistRecorrido() * 1.25;
	}

	@Override
	public String toString() {
		return super.toString() + " -> SolicitudEnvios [capNecesaria=" + capNecesaria + ", refNecesaria=" + refNecesaria + "]";
	}
}
