//Ejercicios variables y constantes 
package moureDev.clases;

public class Ejercicios2 {

	public static void main(String[] args) {
		
		//1 Declarar una variable tipo String y asignarle tu nombre 
		String nombre = "Mickael";
		
		//2 Crea una varible del tipo int y asignale tu edad.
		double edad = 34;
		
		//3 Crea una varible con tu altura en metros
		double altura = 1.60;
		
		//4 Declara una variable de tipo boolean que indique si te gusta programar
		boolean meGustaProgramar = true;
		
		//5 Declara una constante con tu email 
		
		final String EMAIL = "Mickaelreyesc@gmail.com";
		
		//6 Crea una variable de tipo char y guardale tu inicial
		char inicial = 'm';
		
		//7 Declara una variable de tipo String con tu localidad y a continuacion cambia el valor 
		// y vuelve a imprimirla 
		String localidad = "Valladolid";
		System.out.println(localidad);
		//Cambio el valor 
		localidad = "Bogota";
		System.out.println(localidad);
		//8 Crea una variable int llamada a, otra b, e imprime la suma de ambas
		int a = 10;
		int b = 20;
		System.out.println((a + b));
		//9 Imprime el tipo de variables creadas anteriormente
		//utilizamos los metodos de getClass y getSimpleName, para el string no hay problema 
		//ya que en si esto es un oobjeto
		System.out.println((nombre).getClass().getSimpleName());
		//Para los primitivos se debe "convertir" el primitivo en un objeto de la siguiente manera
		System.out.println(((Object)edad).getClass().getSimpleName());
		//10 Intenta declarar una variable sin inicializarla y luego 
		//int c = ;
		//System.out.println(c);
		//Al tratar de imprimairla sale el siguiente error: Type mismatch: cannot convert from void to int

	}

}
