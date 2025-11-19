package ejercicios;

import java.util.Scanner;

public class ValidarLetraDni {
	
	final static String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
	//Sub string 
	public static boolean dniValido (String dni){
		String dniSinLetra;
		dniSinLetra = dni.substring(0,8);
		//el length -1 asumimos que estamos buscando el ultimo digito 
		//Si en el futuro cambia la longitud del dni no tengo que tocar el metodo
		char letra = dni.charAt(dni.length()-1);
		System.out.println("el dni entero es: " + dni + " y sin letra "+ dniSinLetra + " La letra es " + letra);
		int dniNumerico = Integer.valueOf(dniSinLetra);
		System.out.println("el DNI en numero es: " + dniNumerico);
		
		char letraBuena;
		int resto = dniNumerico % 23;
		letraBuena=LETRAS.charAt(resto);
		System.out.print("El resto da: " + resto + " y letra buena seria " + letraBuena);
		
		if(letra == letraBuena) {
			return true;		
		}
		return false;
		/*
		if () {
			return true;
		}else {
			return false;
		}
	}
		*/
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe el DNI: ");
		String dni = sc.nextLine();
		dniValido(dni);
		
		// TODO Auto-generated method stub

	}

}
