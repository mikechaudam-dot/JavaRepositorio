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

	}

}
