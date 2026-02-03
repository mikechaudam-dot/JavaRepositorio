package Poo;

import java.util.ArrayList;

public class AppPersonasArrayList {

	public static void main(String[] args) {
		
		ArrayList <Persona> personas = new ArrayList<>();
		
		Persona p1 = new Persona("Manolo", 50);
		Persona p2 = new Persona("Mary Carmen",65);
		Persona p3 = new Persona("Ryan Castor", 36);
		
		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		
		System.out.print(personas);
	}

}
