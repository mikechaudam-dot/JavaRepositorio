package Poo;


public class SuperHeroe {
	private String nombre;
	private String superPoder;
	private boolean capa;
	
	public SuperHeroe(String nombre, String superPoder) {
		this.nombre = nombre;
		this.superPoder = superPoder;
		this.capa = true;
	}
	
	public void describir() {
		System.out.println("Soy " + nombre + ", mi super poder es " + superPoder);
		if (capa = true) {
			System.out.println(" Y llevo capa");
		}else {
			System.out.println(" Y no llevo capa");
		}
	}
	public void quitarCapa() {
		capa = false;
	}

}
