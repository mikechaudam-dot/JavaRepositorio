package examen_V2;

public class Casa extends Inmueble {
	private Habitacion salon;
	private int baños, plantas;
	
	public Casa (int id, String direccion, double precioVenta, double m2, int baños, int plantas) {
		super(id, direccion, precioVenta, m2);
		this.baños = baños;
		this.plantas = plantas;
		
	}
	public Casa (int id, String direccion, double precioVenta, double m2, Habitacion salon, int baños, int plantas) {
		super(id, direccion, precioVenta, m2);
		Habitacion salon = new Habitacion("Salon",30,3);
		this.baños = baños;
		this.plantas = plantas;
	}
	
	
	//public void agregarHabitacion() {
	//	this.habitaciones ++;
	//}
	
	
	
	
}
