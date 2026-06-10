package interfaces.recargables;

import java.util.ArrayList;


public class AppRecargable {

	public static void main(String[] args) {
		
		TelefonoInteligente movil1 = new TelefonoInteligente("MI","X10",true,"android",50);
		System.out.println(movil1.toString());
		
		CocheElectrico coche1 = new CocheElectrico("Rojo", "Electri", TipoVehiculo.COCHE, true,4);
		System.out.println(coche1.toString());
		
		Linterna lin1 = new Linterna("led", "20W",10);
		System.out.println(lin1.toString());
		
		
		//Creamos los arraylist y añadimos los dispositivos 
		ArrayList <Recargable> dispositivos = new ArrayList<>();
		dispositivos.add(coche1);
		dispositivos.add(movil1);
		dispositivos.add(lin1);
		supervisarEnergia(lin1);
		supervisarEnergia(coche1);
		coche1.cargar();
		supervisarEnergia(coche1);
		
	}
	
	public static void supervisarEnergia(Recargable r) {
		System.out.println("La bateria tiene un nivel de: " + r.obtenerNivelBateria()+ " %");
	}

}
