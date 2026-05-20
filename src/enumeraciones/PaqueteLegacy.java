package enumeraciones;

public class PaqueteLegacy {
	private String estado;
	private String nombre;
	private String id;
	
	
	public PaqueteLegacy(String estado, String nombre, String id) {
		//Esto es la mala practica 
		this.estado = estado;
		this.nombre = nombre;
		this.id = id;
	}


	public String getEstado() {
		return estado;
	}


	public String getNombre() {
		return nombre;
	}


	public String getId() {
		return id;
	}
	
	
	
	
}
