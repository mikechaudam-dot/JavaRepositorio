package ejerciciosArrays;

import java.util.ArrayList;

import java.util.Scanner;

public class TamanoArrayList {

	public static void main(String[] args) {
		
		ArrayList <Integer> numeros = new ArrayList<>();
		int numeros1;
		Scanner sc = new Scanner (System.in);
		do {
			System.out.println("Ingresa varios numeros hasta que escribas -1: ");
			numeros1 = sc.nextInt();
			numeros.add(numeros1);
		}while(numeros1 >= 0); {
			//Borramos el numero -1
			numeros.remove(Integer.valueOf(-1));
			//Se muestra el numero de elementos
			System.out.println("El numero de elementos es: " + numeros.size());
			//Se muestra el primre elemento y el ultimoelemento
			System.out.println("El primer elemento es: " + numeros.get(0) + " El ultimo elemto es: " + numeros.get(numeros.size()-1));
		}
		//if(numeros1 >= 0) {
		//numeros.add(numeros1);
		

	}

}
