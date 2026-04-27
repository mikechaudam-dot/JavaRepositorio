package moureDev.clases;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Estructuras {

	public static void main(String[] args) {
		// 1 Crea un array con 5 valores e imprime su longitud 
		String[] nombres = {"Alfonso", "Mike", "Mary", "Sergio", "Abael"};
		System.out.println(nombres.length);
		
		// 2 Modifica un de los valores del array e imprimer el valor del indice antes 
		System.out.println(nombres[0]);
		nombres[0] = "Ruben";
		System.out.println(nombres[0]);
		
		// 3 crea un array list vacio 
		ArrayList<Integer> edad = new ArrayList<>();
		
		// 4 Añade 4 valores al arraylist y elimina uno a continuacion  
		edad.add(5);
		edad.add(10);
		edad.add(2);
		edad.add(1);
		System.out.println(edad.toString());
		edad.remove(1);
		System.out.println(edad.toString());
		
		// 5 Crea un hasSet con dos valores diferentes
		HashSet<String> ciudades = new HashSet<>(Set.of("Bogota","Madrid"));
		var ciudadesPe = new HashSet<>(Set.of("Valladolid","Pereira"));
		System.out.println(ciudades);
		System.out.println(ciudadesPe);
		
		// 6 Añade un valor repetido, otro sin repetir al HashSet
		ciudades.add("Bogota");
		ciudades.add("Barcelona");
		System.out.println(ciudades);
		
		// 7 elimina uno de los elementos del HashSet 
		ciudades.remove("Bogota");
		System.out.println(ciudades);
		
		// 8 Crea un HashMap donde la clave sea un nombre y el valor el numero de telefono 
		// añade tres contactos 
		HashMap<String, Integer> dicci = new HashMap<>(); 
		dicci.put("Mickael", 2389240);
		dicci.put("Natalia", 123456);
		dicci.put("Matilde", 5406024);
		
		System.out.println(dicci);
		
		// 9 Modifica un de los contactos y elimina otro 
		dicci.put("Mickael", 7777777);
		dicci.remove("Natalia");
		
		System.out.println(dicci);
		
		// 10 Dado un array transformalo en un ArrayList, a continuacion en un HashSet y
		// Finalmente a un HashMap con clave y valor iguales
		
		String[] transformer = {"Pro switch 1", "Xbox series one", "Spark N5"};
		
		System.out.println(Arrays.toString(transformer));
		
		//Usamos la aslist como argumento para definir el arraylist 
		ArrayList<String> controles = new ArrayList<>(Arrays.asList(transformer));
		System.out.println(controles);
		controles.add("Xbox Pro Master Chief");
		controles.add("Spark N5");
		System.out.println(controles);
		//De ArrayList a HashSet 
		HashSet<String> mandos = new HashSet<>(controles);
		System.out.println(mandos);
		//De HashSet a HashMap
		
		HashMap<String, String > mapaDeMandos = new HashMap<>();
		
		for(String mando : mandos){
			mapaDeMandos.put(mando,mando);
		}
		System.out.println(mapaDeMandos);
		
		
		
		
		
		
		

	}

}
