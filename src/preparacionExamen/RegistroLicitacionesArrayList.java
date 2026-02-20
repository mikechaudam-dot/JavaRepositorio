package preparacionExamen;

import java.util.Scanner;

import java.util.ArrayList;

public class RegistroLicitacionesArrayList {

	public static void main(String[] args) {
		// Creamos el scanner y lo declaramos
		Scanner sc = new Scanner(System.in);
		//La variable codigo es la que ingresaremos para llenar la tabla
		String codigo;
		//Variable para hacer la comparacion 
		String busqueda;
		// Declaramos el arrayList
		ArrayList<String> licitaciones = new ArrayList<>();
		// Creamos el bucle for para añadir las tres licitaciones
		for (int i = 0; i < 3; i++) {
			System.out.println("Ingresa el codigo de una licitaccion");
			codigo = sc.nextLine();
			licitaciones.add(codigo);
		}
		// Declaramos veriable funcionara como bandera
		boolean encontrado = false;
		// Comprobamos que las licitaciones esten:
		System.out.println("¿Que licitacion buscas?");
		busqueda = sc.nextLine();
		//Utilizamos el for each
		for (String licitacion : licitaciones) {
			if (busqueda.equalsIgnoreCase(licitacion)) {
				encontrado = true;
				break;
			}
		}

		if (encontrado) {
			licitaciones.remove(busqueda);
			System.out.println("La licitacion " + busqueda + " eliminada, quedan " + licitaciones.size());
		} else {
			System.out.println("La licitacion con codigo: " + busqueda + " NO esta en la lista");
		}
		sc.close();

	}

}
