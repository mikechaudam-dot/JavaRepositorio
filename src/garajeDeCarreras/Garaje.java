package garajeDeCarreras;

import java.util.ArrayList;

public class Garaje {

	public static void main(String[] args) {
		
		//Instanciamos los dos objetos
		Engine electrico = new Engine(100.0,"Electrico"); 
		Engine mecanico = new Engine(160.0,"V8");
		
		RacingCar corvete = new RacingCar("corvete", electrico, 100);
		Truck troca = new Truck("Mack",mecanico,80);
		//accedemos al metodo start del engine 
		corvete.getEngine().start();
		
		System.out.println(corvete.acelerate());
		System.out.println(corvete.acelerate());
		System.out.println(corvete.acelerate(50));
		
		ArrayList<Vehicle> coches = new ArrayList<Vehicle>();
		
		coches.add(corvete);

	}

}
