package moureDev.clases;

import java.util.ArrayList;
import java.util.Arrays;

public class Funciones {

	public static void main(String[] args) {
		//Aqui llamamos a las funciones
		
		saludoBienvenida();
		saludoPersonal("Mickael");
		System.out.println(resta(10,5));
		cuadrado(10);
		parOImpar(3);
		System.out.println(mayorEdad(18));
		// Para llamar a este ejercicio creamos la cadena y luego se la asignamos
		String[] animales = {"Conejo", "Ardilla", "Pato", "Aguila"};
		System.out.println(longitud(animales));
		double[] numeros = {6.5,7.8,9.1};
		System.out.println(media(numeros));
		System.out.println(factorial(5));
		//Para el ultimo ejercicio debemos declarar el array list
		ArrayList<String> colores = new ArrayList<String>(Arrays.asList("Rojo", "Verde", "Amarillo", "Naranja"));
		recorrer(colores);
		
	}
	// 1- Crea una funcion imprima "Te doy la bienvenida a Java desde cero"
	public static void saludoBienvenida() {
		System.out.println("¡Te doy la bienvenida a Java desde cero!");
	}
	
	// 2 - Crea una funcion que reciba un nombre como parametro y salude a esa persona 
	public static void saludoPersonal(String name) {
		System.out.println("Que pasa chato " + name);
	}
	
	// 3 - Haz que un metodo reciba dos numeros enteros y devuelva una resta 
	public static int resta(int a, int b) {
		return a - b;
	}
	
	// 4 - Crea un metodo que calcule el cuadrado de un numero 
	public static void cuadrado(int a) {
		System.out.println(a + " al cuadrado es: "+ (a * a));
	}
	
	// 5 - Crea una funcion que reciba un numero y diga si es par o impar 
	public static void parOImpar (int a) {
		if(a % 2 == 0) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}
	// 6 - Crea un metodo que reciba la edad y retorne true si es mayor de edaad (y false si es menor de edad)
	//Utilizamos esta opcion mas otima ya que solo estamos evaluando una condicion 
	public static boolean mayorEdad (int a) {
		return a >= 18;
		
		//La opcion clasica:
		/*
		public static boolean mayorEdad (int a){
		if(a <= 18){
		return true;
		else {
		return false
		 */
	}
	// 7 - Implementa una funcion que reciba una cadena y retorne su longitud 
	public static int  longitud(String[] cadena) {
		return cadena.length;
	}
	// 8 - Crea un metodo que reciba un array de enteros y calcule su media 
	public static double media(double[] numeros) {
		double total = 0;
		for(int i = 0; i < numeros.length; i++){
			total += numeros[i];
		} return total / numeros.length;
	}
	// 9 - Escribe un metodo que reciba un numero y retorne su factorial 
	public static int factorial (int num) {
		int factorial = 1;
		for(int i = 1; i <= num; i++) {
			factorial *= i;
		}return factorial;
	}
	// 10 - Crea una funcion que reciba una ArrayList<String> y lo recorra mostrando
	// cade elemento
	public static void recorrer(ArrayList<String> elementos) {
		for(String elemento: elementos) {
			System.out.println(elemento);
		}
	}
	

}
