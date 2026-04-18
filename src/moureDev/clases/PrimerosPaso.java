package moureDev.clases;

public class PrimerosPaso {

	public static void main(String[] args) {
		
	//1 Imprime unmensaje que diga tu nombre en vez de hola mundo 
		System.out.println("Mickael");
	//2 Imprime dos lineas, hola y mundo con un solo print ln
		System.out.println("Hola \nmundo");
	//3 Añade un comentario de lo que hace cada linea del programa
		//La linea 8 imprime mi nombre
		//La linea 10 imprime el mensaje hola mundo en dos lineas la frase se separa con \n
	//4 Crea un comentario en varias lineas.
		/* Este es el inicio de todo como pogramador
		 * ya es muy tarde para dejar este camino 
		 * siento que estoy apunto de llegar a mi primer 
		 * trabajo hay que seguir remando por que la playa esta lejos aun 
		 * lo bueno es que ahora estoy mas fuerte
		 */
	//5 Imprime tu edad, color favorito y ciudad, usaremos variables para identificar los tipos de datos
		int edad = 34;
		String color = "Azul";
		String ciudad = "Valladolid";
		System.out.println("Edad: \t" + edad + "\nColor: \t"+ color + "\nCiudad: " + ciudad);
	//6 Explora los diferentes systen.XXXX.println. mas alla de out. 
		System.err.println(edad);
		//System.in.available
	//7 Utiiza varios print para imprimir una frase 
		System.out.print("soy el mejor programador ");
		System.out.print("mi nombre es Mickael");
		System.out.println(" y me gusta los videojuegos");
	//8 Imprime un simbolo ASCII
		System.out.println("\\-->");
		String robot = """
		      [o_o]
       /|   |\\
        | _ |
       /     \\
				""";
		System.out.print(robot);
	//9 Intenta ejecutar el programa sin el metodo main 
		//Como se esperaba nos muestra error y nos indica que no se ha encontrado el metodo principal
		//Y nos indica que lo definamos y nos indica el como definirlo 
		
	//10 Intenta cambiar el nombre del archivo y mirar que pasa
		//Realize el cmabio del nombre del archivo y por ende se cambia de manera "automatica" el de la clase
		//Ya que estasdeben ser iguales.
	
	}

}
