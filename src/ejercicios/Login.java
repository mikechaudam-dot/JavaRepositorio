package ejercicios;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contrasena;
		
		System.out.print("Ingresa el usuario: ");
		String usuario = scan.nextLine();
		
		System.out.print("Ingresa la contraseña numerica: ");
		contrasena = scan.nextInt();
		
		if (usuario.equals("admin") && contrasena == 1234) {
			System.out.print("Acceso concedido");
		}else {
			System.out.print("Acceso denegado");
		}
		scan.close();
	}
}
