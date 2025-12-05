package laboratorios;

public class LaboratorioDebug {

	public static void main(String[] args) {
		System.out.println("-- Calculadora de factorial ---");
		int numero = 10;
		int resultado;
		
		System.out.println("Calculando el factorial de " + numero);
		
		//Llamamos al metodo que tiene el error 
		resultado = calcularFactorial(numero);
		
		System.out.println("El resultado (incorrecto) es: " + resultado);

	}
	
	/**
	 * intenta caalcular el factorial de un numero n (n!).
	 * Contiene un erro logico
	 */
	public static int calcularFactorial(int n) {
		int factorial = 1; // es correcto comenzaer en 0 para una multiplicacion
		
		// El bucle multiplica 
		for(int i = 1; i <= n;i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}
