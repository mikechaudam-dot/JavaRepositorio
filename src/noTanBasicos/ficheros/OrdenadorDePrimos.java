package noTanBasicos.ficheros;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenadorDePrimos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("primos.txt");
		Scanner lector = null;
		ArrayList<Integer> primos = new ArrayList<>();
		FileWriter fichero2 = null;
		PrintWriter escritor = null;
		
		try {
			lector = new Scanner(fichero);
			while(lector.hasNextLine()) {
				int primo = lector.nextInt();
				primos.add(primo);
				lector.nextLine();
			}
			System.out.println(primos.toString());
			Collections.sort(primos);
			System.out.println(primos.toString());
			
			
			fichero2 = new FileWriter("primos_ordenados.txt");
			escritor = new PrintWriter(fichero2);

			for(int i : primos) {
				escritor.println(i);
			}
					
		}catch(FileNotFoundException e){
			System.out.println("Fichero no encontrado");
		}catch(IOException e) {
			System.out.println("No se que pasa aqui");
		}
		finally {
			if(lector != null) {
				escritor.close();
			}
		}
		

	}

}
