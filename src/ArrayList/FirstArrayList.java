package ArrayList;

import java.util.ArrayList;

public class FirstArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> nombres = new ArrayList<>();
		
		nombres.add("Solid Snake");
		nombres.add("Liquid Snake");
		nombres.add("Ocelot");
		nombres.add("Boss");
		nombres.add("Big Boss");
		
		//Bucle for 
		System.out.println("--- Nombres (con indice) ---");
		for(int i = 0; i < nombres.size(); i++) {
			String persona = nombres.get(i);
			System.out.println((i + 1) + "." + persona);
		}
		//For each
		System.out.println("\n-- Nombres (simple)--");
		for (String nombre : nombres) {
			System.out.println("- " + nombre);
		}

	}

}
