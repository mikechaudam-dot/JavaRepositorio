package examen2Inmovibilaria;

public abstract class Inmueble {
	private int id;
	private String direccion;
	private double precioVenta;
	private double superficie;
	
	//Creacion de constructor
	public Inmueble(int id, String direccion, double precioVenta, double superficie) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.superficie = superficie;
	}

	public int getId() {
		return id;
	}

	public String getDireccion() {
		return direccion;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public double getSuperficie() {
		return superficie;
	}

	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", direccion=" + direccion + ", precioVenta=" + precioVenta + ", superficie="
				+ superficie + "]";
	}
	
	
	
	
	
	

}
