package ejerciciosArrays;

import java.util.Scanner;

import java.util.ArrayList;

public class FirstArrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String matricula;
		
		ArrayList <String> alumnos = new ArrayList<>();
		//Añadir nombres 
		for(int i = 1; i < 6; i ++){
			System.out.println("Ingresa un nombre de alumno: ");
			matricula = sc.nextLine();
			alumnos.add(matricula);
		}
		//Mostrar nombres 
		for(int i = 0; i < alumnos.size();i++) {
			System.out.println("Nuestro alumno No: " + i + " : "+ alumnos.get(i));
		}
	
		sc.close();

	}

}
