package preparacionExamen;

import java.util.Scanner;

import java.util.Arrays;

public class EdificioLicitacionesMatriz {

	public static void main(String[] args) {
		//declaramos el scanner
		Scanner sc = new Scanner(System.in);
		
		//Declaramos la matriz
		int[][] puntuaciones = new int [3][3]; 
		//Declaramos las variables fuera para entender los resultados del segundo bucle
		int empresaGanador = 0;
		int puntuacionMaxima = 0;
		
		//Para rellenar de manera manual:
		//sitaxis: nombreMatriz[fila][columna] = valor a asigar;
		//puntuaciones[2][1] = 5; 
		
		
		//Cremaos el bucle para rellenar las matrices 
		for(int i = 0; i < puntuaciones.length; i++ ){
			for(int j = 0; j < puntuaciones[i].length; j++) {
				System.out.println("Ingresa la nota en la fila: " + i + " y de la columna: " + j);
				puntuaciones[i][j] = sc.nextInt();
			}
		}
		//Crearemos un segundo for par imprimir la tabla y que se vea cuadrada
		for(int i = 0; i < puntuaciones.length; i ++){
			for (int j = 0; j < puntuaciones[i].length; j ++){
				System.out.print(puntuaciones[i][j] + " | ");
			}
			System.out.println();
		}
		//Estr print muestra la tabla, la matriz
		System.out.println(Arrays.deepToString(puntuaciones));
		//Segundo bucle para su
		
		for(int i = 0; i < 3; i++ ) {
			int total = 0;
			for(int j = 0; j < 3; j++) {
				total += puntuaciones[i][j];	
			}if(total > puntuacionMaxima ){
				puntuacionMaxima = total;
				empresaGanador = i;
			}
			
			System.out.println("La puntuacion total de la empresa: " + i + " es: " + total);			
		}
		
		System.out.println("La empresa " + empresaGanador + " con la puntuacion " + puntuacionMaxima + " es la gandora" );		

		
		sc.close();
	}
	


}
