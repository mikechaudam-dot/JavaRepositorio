package moureDev.clases;

public class Strings {

	public static void main(String[] args) {
		//1. Concatena dos cadenas de texto 
		String nombre = "Mickael";
		String apellido = "Reyes";
		
		String nameComplete = nombre + apellido;
		System.out.println(nameComplete);
		System.out.println("Hola estrellitas" + " la tierra los saluda ");
		
		//2 Muestras la longitud de una cadena de texto
		System.out.println(nameComplete.length());
		//3 Muestra el primer y ultimo caracter de un String 
		System.out.println("Primer caracter " + nameComplete.charAt(0));
		System.out.println("Ultimo caracter: " + nameComplete.charAt(nameComplete.length()-1));
		//4 Convierte a mayuscula y minuscula un String
		nombre = nombre.toUpperCase();
		System.out.println("A mayusculas " + nombre);
		nombre = nombre.toLowerCase();
		System.out.println("A minusculas " + nombre);
		//5 Compruebla si una cadena de texto tiene una palabra 
		String frase = " La derecha solo para hacerme la paja ";
		System.out.println(frase.contains("derecha"));
		//6 Formatea un String con un entero 
		String nata = "Natalia";
		int edad = 32;
		double nota = 4.5;
		String mensaje = String.format("Hola %s, feliz cumpleaños numero %d, en el examen tienes nota: %.1f", nata, edad, nota);
		System.out.println(mensaje);
		//7 Elimina los espacios en blanco al principio y al final 
		System.out.println(frase);
		frase = frase.trim();
		System.out.println(frase);
		//8 Sustituye todo los espacios en blanco de un String 
		frase = frase.replace(" ","");
		System.out.println(frase);
		//9 Comprueba si dos strings son iguales 
		String ciudad = "Valladolid";
		String capitalCyL = "Valladolid";
		System.out.println(ciudad.equals(capitalCyL));
		//10 Comprueba si dos strings tienen la misma longitud 
		System.out.println(ciudad.length() == frase.length());
	}
}
