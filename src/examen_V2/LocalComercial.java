package examen_V2;

public class LocalComercial extends Inmueble {
	private boolean salidaHumo;
	
	public LocalComercial(int id, String direccion, double precioVenta, double m2, boolean salidaHumo){
		super(id, direccion, precioVenta, m2);
		this.salidaHumo = salidaHumo;
		
	}

	

}
