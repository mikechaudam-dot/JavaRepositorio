package moureDev.clases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;


public class Bucles {

	public static void main(String[] args) {
		//- 1 Imprime los numeros del 1 al 10 usando un while 
		
		int contador = 0;
		
		while (contador < 11) {
			System.out.println(contador);
			contador++;
		}
		System.out.println("---------------");
		
		//-2 Usa un do while para mostrar todos los valores de un ArrayList 
		ArrayList<Integer> indicativos = new ArrayList<>(Arrays.asList(57,60,41,33,67));
		
		int index = 0;
		
		do {
			System.out.println(indicativos.get(index));
			index++;
		}while(index < indicativos.size());
		
		System.out.println("---------------");
		
		//-3 Imprime los multiplos de de 5, del 1 al 50 usando for.
		for(int i = 5; i < 51; i+= 5) {
			if (i % 5 == 0){
				System.out.println(i);
			}

		}
		System.out.println("---------------");
		
		//-4 recorre un array de 5 numeros e imprime la suma total 
		
		int [] numeros = {1,2,3,4,5};
		int total = 0;
		/*
		for(int i = 0; i < numeros.length;i++) {
			total += numeros[i];
		}
		System.out.println(total);
		*/
		for (int n : numeros ){
			total += n;
		}
		System.out.println(total);
		System.out.println("---------------");
		
		//-5 Usa un for para recorrer Array y mostrar sus valores
		for(int i = 0; i < numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("---------------");
		
		//- 6 Usa un for each para recorrer un HashSet y un HashMap
		//-- HashSet
		HashSet<String> barrios = new HashSet<>(Set.of("Delicias","Los Santos","Belen","Rondilla"));
		for (String barrio: barrios){
			System.out.println(barrio);
		}
		//-- HashMap
		HashMap<String, Integer> direcciones = new HashMap<>(Map.of(
				"Ferrocarril",13,
				"Orden de Malta",33,
				"Angel Garcia",93)); 
		
		for(Map.Entry<String, Integer> direccion : direcciones.entrySet()) {
			System.out.println(direccion);
		}
		
		System.out.println("---------------");
		
		// 7 - Imprime los numeros del 10 al 1 descendientemente con un bucle for 
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println("---------------");
		
		// 8 - Usa continue para saltar los multiplos de 3 del 1 al 20
		for(int i = 0; i < 21; i++) {
			if(i % 3 == 0) {
				continue;
			}
			System.out.println("Numeros sin multiplos de 3: " + i);
		}
		
		System.out.println("---------------");
		
		// 9 - Usa break para detener un bucle cuando encuentres un numero negativo 
		ArrayList<Integer> temperatura = new ArrayList<>(Arrays.asList(12,5,8,10,-2,25,33));
		
		for(Integer grados : temperatura) {
			if(grados < 0) {
				break;
			}
			System.out.println(grados);
			
		}
		// 10 - Crea un programa que cree el factorial de un numero dado 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingresa un numero: ");
		int numx = sc.nextInt();
		int factorial = 1;
		
		for(int i = 1; i <= numx ; i++) {
			factorial *= i;
		}
		
		System.out.println("El factorial del numero " + numx + " es: " + factorial);
		
		sc.close();
		
		
	}
}
