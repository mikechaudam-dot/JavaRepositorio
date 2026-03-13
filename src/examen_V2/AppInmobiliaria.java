package examen_V2;

import java.util.ArrayList;

public class AppInmobiliaria {

	public static void main(String[] args) {
		
		Inmueble local1 = new LocalComercial(10,"Calle mayor", 120000,80.0,true);
		Inmueble casa1 = new Casa(202,"Av del parque 12",350000,200.0,2,2);
		Habitacion habi1 = new Habitacion("Estudio",10,5);
		
		//Creamos el ArrayList para guardar los inmuebles y guardarlos directamente alli.
		ArrayList<Inmueble> catalogo = new ArrayList<>();
		
		System.out.println(local1);
		System.out.println(casa1);
		System.out.println(habi1);
		
		

	}

}
