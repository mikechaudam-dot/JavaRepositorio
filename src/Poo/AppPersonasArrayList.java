package Poo;

import java.util.Scanner;

import java.util.ArrayList;

public class AppPersonasArrayList {

	static Scanner sc = new Scanner(System.in);

	// public static boolean existePersona(ArrayList<Persona> pers) {

	// }

	public static void agregarPersona(ArrayList<Persona> pers) {
		String nombre;
		int edad;

		System.out.println("¿Como te llamas ?");
		nombre = sc.nextLine();

		System.out.println("¿Y cuantos años tienes ?");
		edad = sc.nextInt();
		sc.nextLine();

		Persona per = new Persona(nombre, edad);
		if (pers.contains(per)) {
			System.out.println("Esa persona ya existe");
		} else {
			pers.add(per);
		}
	}

	public static void eliminarPersona(ArrayList<Persona> pers) {
		String persona;

		System.out.println("Ingresa un nombre para eliminar: ");
		persona = sc.nextLine();

		for (int i = 0; i < pers.size(); i++) {
			if (pers.get(i).getNombre().equals(persona)) {
				pers.remove(i);
				break;
			}
		}
	}

	public static void mostrarPersonas(ArrayList<Persona> pers) {
		for (Persona persona : pers) {
			System.out.println(persona.toString());
		}

	}

	public static void main(String[] args) {

		ArrayList<Persona> personas = new ArrayList<>();
		int opcion;

		do {

			System.out.println("Hola, que te gustaria hacer?: ");
			System.out.println("1-Añadir a una persona");
			System.out.println("2-Eliminar una persona");
			System.out.println("3-Mostrar el listado de personas");
			System.out.println("4-Salir");

			System.out.println("¿que eliges?");
			opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {
			case 1:
				agregarPersona(personas);
				break;
			case 2:
				eliminarPersona(personas);
				break;
			case 3:
				mostrarPersonas(personas);
				break;
			case 4:
				System.out.println("Hasta luego");
			default:
				System.out.println("Elige una opcion valida");
			}

		} while (opcion != 4);

		// Otra forma de mostrarlos
		for (Persona persona : personas) {
			System.out.println("Soy " + persona.getNombre() + " y tengo" + persona.getEdad() + " años");

			System.out.println(persona.toString());
		}

		// Ahora solo los mayores de edad
		for (int i = 0; i < personas.size(); i++) {
			if (personas.get(i).getEdad() >= 18) {
				System.out.println(personas.get(i).toString());
			}
		}

		// Lo mismo que lo anterior pero con for-each
		for (Persona persona : personas) {
			if (persona.getEdad() >= 18) {
				System.out.println(persona.toString());
			}
		}
	}
}
