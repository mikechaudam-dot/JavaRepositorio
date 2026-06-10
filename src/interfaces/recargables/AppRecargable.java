package interfaces.recargables;

import java.util.ArrayList;

public class AppRecargable {

	public static void main(String[] args) {
		
		TelefonoInteligente movil1 = new TelefonoInteligente("MI","X10",true,"android",50);
		System.out.println(movil1.toString());
		
		CocheElectrico coche1 = new CocheElectrico("Rojo", "Electri", TipoVehiculo.COCHE, true,30);
		System.out.println(coche1.toString());
		
		Linterna lin1 = new Linterna("led", "20W",10);
		System.out.println(lin1.toString());
		
		
		//Creamos los arraylist y añadimos los dispositivos 
		ArrayList <Recargable> dispositivos = new ArrayList<>();
		dispositivos.add(coche1);
		dispositivos.add(movil1);
		dispositivos.add(lin1);
		
		public void supervisarEnergia(Recargable r) {
			System.out.println("Nivel de bateria de el dispositivo " + r + " es " + obtenerNivelBateria);
		}
	}

}
