package examen_V2.calculosEstadisticos;

import java.util.ArrayList;
import java.util.Arrays;

public class AppCalculosEstaadisticos {

	public static void main(String[] args) {
		
		//Instanciamos la muestra 
		//Creacion vacia 
		//ArrayList<Integer> edades = new ArrayList<>(); 
		Muestra muestra1 = new Muestra("Edades estudianes");
		System.out.println(muestra1.toString());
		//Array de enteros 
		Muestra muestra2 = new Muestra("Temperaturas veranoo", new int[]{30,28,41,33});
		System.out.println(muestra2.toString());
		//Array list 
		ArrayList<Integer> notas = new ArrayList<>(Arrays.asList(9,8,6,5,4,6,6)); 
		Muestra muestra3 = new Muestra("Notas de grupo",notas); 
		System.out.println(muestra3.toString());
		
		muestra1.IncorporarDatos(10);
		muestra1.IncorporarDatos(11);
		muestra1.IncorporarDatos(12);
		muestra1.IncorporarDatos(16);
		
		muestra2.IncorporarDatos(35);
		muestra3.IncorporarDatos(10);
		System.out.println();
		System.out.println(muestra1.toString());
		System.out.println(muestra2.toString());
		System.out.println(muestra3.toString());
		
		//Realizamos el calculo de la media aritmetica 
		System.out.println("La media aritmetica de : "+ muestra1.getName() + " es "+ (Calculos.MediaAritmetica(muestra1)));
		
		//Realizamos el calculo de la moda
		System.out.println("La moda de: " + muestra3.getName() + " es " + (Calculos.Moda(muestra3)));
		System.out.println("La moda de: " + muestra2.getName() + " es " + (Calculos.Moda(muestra2)));
	}

}
