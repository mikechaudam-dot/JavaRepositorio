package moureDev.clases;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1 Crea una variable con el resultado de cada operacion aritmetica 
				int suma = 10 + 7;
				int resta = 10 - 7;
				double multi = 10 * 7;
				double divi = 10 / 7;
				double modu = 10 % 7;
				
				//2 Crea una variable para cada tipo de operacion de asignacion
				int a = 5;
				a += a;
				System.out.println(a);
				
				int b = 6;
				b -= b; //Esto seria lo equivalente a b = b - b;
				System.out.println(b);
				
				double c = 7;
				c *= c;
				System.out.println(c);
				
				double d = 8;
				d /= d;
				System.out.println(d);
				
				double e = 9;
				e %= e;
				System.out.println(e);
				
				//3 Imprime tres comparaciones verdaderas con diferentes operadores de comparacion
				System.out.println(5 > 3);
				System.out.println(6 < 10);
				System.out.println(10 == 10);
				//4 Imprime tres comparaciones falsas con diferentes operadores de comparacion 
				System.out.println(5 > 6);
				System.out.println(10 < 6);
				System.out.println(10 != 10);
				
				//5 Utiliza el operador logico and 
				System.out.println("Los primeros numeros son mayores? " + (c > a && c > b));
				System.out.println("Segunda vuelta Los primeros numeros son mayores? " + (e > a && e > b));

				//6 Utiliza el operador logico or 
				System.out.println("Alguna varible es mayor que 0? "+ (b > 0 || e > 0));
				System.out.println("Segunda vuelta, alguna varible es mayor que 0? "+ (b > 0 || d > 0));
				
				//7 Combina ambos operadores logicos 
				//"El acceso VIP a la discoteca"
				int edad = 17;
				boolean tieneEntrada = false;
				boolean esHijoDelDueño = true;
				boolean estaEnListaNegra = false;
				
				System.out.println("Puedes ingresar a la zona VIP? " + ( ((edad >= 18 && tieneEntrada) || esHijoDelDueño ) && !estaEnListaNegra));
				//refactorizamos para organizarlo un poco mejor
				//8 Añade una negacion, ya lo hemos realizado  
				boolean cumpleRequisitos = (edad >= 18 && tieneEntrada) || esHijoDelDueño;
				boolean puedePasar = cumpleRequisitos && !estaEnListaNegra;
				System.out.println("¿acceso consedido? " + puedePasar);
				
				//9 Imprime 3 ejemplos de uso de operadores unarios 
				int num1 = 5;
				int num2 = 5;
				boolean esPrimavera = true;
				boolean esInvierno = false;
				//incremento y decremento 
				System.out.println(num1++);
				System.out.println(num1--);
				System.out.println(num1);
				//Cambio de signo 
				System.out.println(-num2);
				System.out.println(+num2);
				//Complemento logico
				System.out.println(!esPrimavera);
				System.out.println(!esInvierno);
				//10 Crea un ejercicio que integre todas los operadores 
				int pisoActual = 2;
				int pisoDestino = 2;
				int cargaActual = 400;
				int capacidadMaxima = 300;
				boolean botonEmergenciaPresionado = false;
				boolean puertaCerrada = true;
				boolean modoMantenimiento = true;
				// Variable unica para mover el ascensor 
				boolean puedeMoverse = false;
				//Regla A seguridad fisica 
				puedeMoverse = ((((cargaActual < capacidadMaxima && puertaCerrada) && !botonEmergenciaPresionado) && pisoActual != pisoDestino)) || 
						modoMantenimiento && puertaCerrada;
				System.out.println("Puede moverse el asensor? " + puedeMoverse);
				//Operadores unarios y de asignacion  
				cargaActual += 100;
				cargaActual += 100;
				cargaActual += 100;
				cargaActual += 100;
				System.out.println("El elevador pesa: " + cargaActual);
				pisoActual ++;
				pisoActual ++;
				System.out.println("El piso actual es: " + pisoActual);
				puedeMoverse = ((((cargaActual < capacidadMaxima && puertaCerrada) && !botonEmergenciaPresionado) && pisoActual != pisoDestino)) || 
						modoMantenimiento && puertaCerrada;
				System.out.println("Puede moverse el asensor? " + puedeMoverse);
			
			}

}
