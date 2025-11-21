package ejercicios;

import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numero;
		int vidas = 3;
		//for (int i=1; 1<=20;i++){
		int numeroPensado = (int) (Math.random()*100);
		System.out.println("He pensado el numero: " + numeroPensado);
		
		System.out.println("He pensado un numeor, a ver si adivinas");
		
		do {
			System.out.println("Prueeba");
			numero=sc.nextInt();
			if(numero<numeroPensado) {
				System.out.println("Fallaste es mayor");
			}else if(numero > numeroPensado) {
				System.out.print("Fallaste es menor");
			}else {
				System.out.print("Acertaste");
			}				
		}
		while (numero!=numeroPensado);

}
	
}	
