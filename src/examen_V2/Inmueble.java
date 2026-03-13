package examen_V2;

public abstract class Inmueble {
	private int id;
	private String direccion;
	private double precioVenta;
	private double m2;
	//Constructor basico
	public Inmueble(int id, String direccion, double precioVenta, double m2) {
		this.id = id;
		this.direccion = direccion;
		this.precioVenta = precioVenta;
		this.m2 = m2;
	}
	//Constructor para habitaciones 
	public Inmueble(double m2) {
		this.m2 = m2;
	}
	@Override
	public String toString() {
		return "Inmueble [id=" + id + ", direccion=" + direccion + ", precioVenta=" + precioVenta + ", m2=" + m2 + "]";
	}
	
	

}
