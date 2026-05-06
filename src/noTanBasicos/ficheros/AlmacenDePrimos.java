package noTanBasicos.ficheros;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AlmacenDePrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		FileWriter fichero = null;
		PrintWriter escritor = null;
		Scanner sc = new Scanner(System.in);


		try{
			fichero = new FileWriter("primos.txt");
			escritor = new PrintWriter(fichero);

			while(true) {
				System.out.println("Dame un entero positivo y vemos si es primo, o uno negativo y salimos");
				int num=0;
				try {

					num = sc.nextInt();	

					if(num > 0){
						//Comprobamos si es primo 
						if(esPrimo(num)) {
							escritor.println(num);
						}
					}else {
						System.out.println("Hasta la proxima");
						break;

					}
				}catch(InputMismatchException ex) {
					System.out.println("Ojo no puedes introducir letras");
				} finally {
					sc.nextLine();
				}


			}

		} catch(IOException e){ // La e hac referencia a un objeto de IOException 
			System.out.println("Ha ocurrido un error");
			System.out.println(e.getStackTrace());
		}


		escritor.close();
		sc.close();

	}

	//Funcion para determinar si es primo 
	public static boolean esPrimo(int n) {
		if (n <= 1) {
			return true;
		}else {
			//Solo probamos hasta la raiz cuadrada 
			for(int i = 2; i <= Math.sqrt(n);i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
