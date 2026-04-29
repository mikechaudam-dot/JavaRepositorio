package garajeDeCarreras;

public class Garaje {

	public static void main(String[] args) {
		
		//Instanciamos los dos objetos
		Engine electrico = new Engine(100.0,"Electrico"); 
		RacingCar corvete = new RacingCar("corvete", electrico, 100);
		//accedemos al metodo start del engine 
		corvete.getEngine().start();

	}

}
