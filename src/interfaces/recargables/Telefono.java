package interfaces.recargables;

public class Telefono implements Recargable {
	private String marca;
	private String modelo;
	
	
	public Telefono(String marca, String modelo) {
		super();
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
	
	
	
}
