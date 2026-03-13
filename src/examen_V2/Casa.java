package examen_V2;

public final class Casa extends Inmueble {  //Para que putas es el final
	private Habitacion habitacion ;
	private int baños, plantas;
	
	public Casa (int id, String direccion, double precioVenta, double m2, int baños, int plantas) {
		super(id, direccion, precioVenta, m2);
		this.baños = baños;
		this.plantas = plantas;
		
	}
	public Casa (int id, String direccion, double precioVenta, double m2, Habitacion salon, int baños, int plantas) {
		super(id, direccion, precioVenta, m2);
		this.habitacion = new Habitacion("Salon",30,3);
		this.baños = baños;
		this.plantas = plantas;
	}
	@Override
	public String toString() {
		return "Casa [habitacion=" + habitacion + ", baños=" + baños + ", plantas=" + plantas + "]";
	}
	
	
}
