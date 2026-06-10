package examen2Inmovibilaria;

public class Local extends Inmueble {
	private boolean salidaHumo;

	public Local(int id, String direccion, double precioVenta, double superficie, boolean salidaHumo) {
		super(id, direccion, precioVenta, superficie);
		this.salidaHumo = salidaHumo;
	}

	public boolean isSalidaHumo() {
		return salidaHumo;
	}

	@Override
	public String toString() {
		return "Local [Id =" + getId() + ", Direccion =" + getDireccion()
				+ ", PrecioVenta =" + getPrecioVenta() + ", Superficie()= " + getSuperficie() + " salidaHumo= " + salidaHumo + "]";
	}

	
	
	
	
}
