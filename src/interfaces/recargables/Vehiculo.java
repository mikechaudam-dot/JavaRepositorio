package interfaces.recargables;

public class Vehiculo {
	
	private String color;
	private String combustible;
	private TipoVehiculo tipo;
	
	
	public Vehiculo(String color, String combustible, TipoVehiculo tipo) {
		super();
		this.color = color;
		this.combustible = combustible;
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public String getCombustible() {
		return combustible;
	}


	public TipoVehiculo getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", combustible=" + combustible + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
