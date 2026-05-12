package examenV1Repaso;

import java.util.Scanner;

public class ArreglandoErrores {


	//Constante para salir del bucle
    private static final int OPCION_SALIR = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre y apellido: ");
        String entrada = scanner.nextLine().trim();
        
        //Nada más empezar están vacíos. Que es distinto que no inicializados
        String nombre = "";
        String apellido = "";

        int posicionPrimerEspacio = entrada.indexOf(' ');

        if (posicionPrimerEspacio == -1) {
            nombre = entrada;
        }else{
            nombre = entrada.substring(0, posicionPrimerEspacio);
            //Por si ha separdo el nombre del apellido con más de un espacio
            apellido = entrada.substring(posicionPrimerEspacio + 2).trim();
        }
        
        scanner.nextLine(); // Limpiar el buffer por lo que pueda ocurrir
        
        System.out.println ("Bienvenido/a: " + nombre + " " + apellido);

        int opcion = 0;

        while (opcion != OPCION_SALIR) {
            
            mostrarMenu();
            
            System.out.print("Elige una opción: ");


            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer por lo que pueda ocurrir

            switch (opcion) {
                case 1:
                	mostrarIniciales(nombre, apellido);
                case 2:
                	mostrarMayusculas(apellido, nombre);
                case 3:
                    generarNick(nombre, apellido);
                case OPCION_SALIR:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    // Si la opción no era válida (o si la entrada no fue un número)
                    if (opcion != 0) { // Para no mostrar el mensaje si ya mostramos el de "no es un número"
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                    }
            }
        }
        
        scanner.close();
    }

    // --- MÉTODOS AUXILIARES ---
    
    public static void mostrarMenu() {
        System.out.println("\n--- MENÚ DE OPCIONES ---");
        System.out.println("1. Mostrar iniciales.");
        System.out.println("2. Mostrar nombre y apellido en mayúsculas.");
        System.out.println("3. Generar nick de usuario.");
        System.out.println(OPCION_SALIR + ". Salir.");
    }

    public static void mostrarIniciales(String nombre, String apellido) {
        if (!nombre.isEmpty() && !apellido.isEmpty()) {
            System.out.println("Iniciales: " + nombre.charAt(0) + "." + apellido.charAt(0) + ".");
        } else {
            System.out.println("Nombre o apellido incompletos, no se pueden mostrar iniciales.");
        }
    }
    
    public static void mostrarMayusculas(String nombre, String apellido) {
        if (!nombre.isEmpty()) {
            System.out.println("En mayúsculas: " + nombre.toUpperCase() + " " + apellido.toLowerCase());
        } else {
            System.out.println("El nombre está vacío.");
        }
    }

    public static void generarNick(String nombre, String apellido) {
        if (nombre.length() <= 3 && apellido.length() <= 3) {
            StringBuilder nickBuilder = new StringBuilder();
            nickBuilder.append(nombre.substring(1, 3));
            nickBuilder.append(apellido.substring(1, 3));
            System.out.println("Nick generado: " + nickBuilder.toString().toLowerCase());
        } else {
            System.out.println("Nombre o apellido demasiado cortos para generar un nick (se requieren 3 letras en cada uno).");
        
    }
}
}
