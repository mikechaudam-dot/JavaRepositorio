package interfaces.recargables;

public interface Recargable {
	
	static void cargar () {
		System.out.println("El dispositivo se esta cargando");
	};
	
	static int obtenerNivelBateria();

}
