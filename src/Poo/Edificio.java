package Poo;

public class Edificio {
	private String nombre;
	private int pisoMaximo;
	private int pisoMinimo;
	//Composicion: utiliza la clase Asensor como una pieza de su propia estructura 
	private  Asensor asensor;
	
	public Edificio(String nombre, int pisoMinimo, int pisoMaximo) {
		this.nombre = nombre;
		this.pisoMinimo = pisoMinimo;
		this.pisoMaximo = pisoMaximo;
		//Esto asegura que un edificio nunca nazca sin un asensor
		this.asensor = new Asensor();
	}
	
	public void ordenarSubida(int cuantos) {
		//Coreccion del profesor 
		System.out.println("\n[SISTEMA " + nombre + "]: Peticion de subir " + cuantos + " pisos ");
		//Codigo realizado por yotas 
		int piso = asensor.getpisoActual(); //Aqui se cumple la regla de encapsulacion, con esto el edificio sabe donde esta en ascensor
		if (piso + cuantos <= pisoMaximo) {
			//Esto es lo que se llama delegar responsabilidades: cada objeto se encarga de lo que sabe hacer
			//Aqui cumpliendo la condicion anterior le pasa el trabajo al asensor
			asensor.subir(cuantos);
		}else {
			System.out.print("ERROR: No podemos subir tanto, chocaríamos con el tejado");
		}
	}
	
	public void ordenBajada(int cuantos) {
		//Coreccion del profesor 
		System.out.println("\n[SISTEMA " + nombre + "]: Petición de bajar " + cuantos + " pisos ");
		//Codigo realizado por yotas pelotas 
		int piso = asensor.getpisoActual();
		if (piso - cuantos >= pisoMinimo) {
			asensor.bajar(cuantos);
		}else {
			System.out.print("ERROR: No hay tantos sótanos en este edificio");
		}
	}
}
