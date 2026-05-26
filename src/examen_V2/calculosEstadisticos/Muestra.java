package examen_V2.calculosEstadisticos;


import java.util.ArrayList;

public class Muestra {
	
	private String name;
	private ArrayList<Integer> datos;
	
	//vacio
	public Muestra(String name) {
		this.name = name;
		this.datos = new ArrayList<>();
	}
	//de array 
	public Muestra(String name, int[] datosRecibidos) {
		this.name = name;
		this.datos = new ArrayList<>();
		for(int dato: datosRecibidos) {
			this.datos.add(dato);
		}
	}
	//Arraylist 
	public Muestra(String name,ArrayList<Integer> datos) {
		this.name = name;
		this.datos = new ArrayList<>(datos);
	}
	
	//Getters 
	public String getName() {
		return name;
	}
	public ArrayList<Integer> getDatos() {
		return datos;
	}
	
	//Metodo de incorporar datos 
		public void IncorporarDatos(int nuevoDato) {
			datos.add(nuevoDato);
		}
		@Override
		public String toString() {
			return "Muestra [name=" + name + ", datos=" + datos + "]";
		}
	
	
}
