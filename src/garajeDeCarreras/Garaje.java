package garajeDeCarreras;

public class Garaje {

	public static void main(String[] args) {
		
		Engine electrico = new Engine(100.0,"Electrico"); 
		
		RacingCar corvete = new RacingCar("corvete", electrico, 100);
		
		corvete.getEngine().start();

	}

}
