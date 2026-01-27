package Poo;

public class AppEdificios {

	public static void main(String[] args) {
		
		Edificio edificio1 = new Edificio ("Torre central", 0,10 );
		Edificio edificio2 = new Edificio ("Parking Subterraneo", -3,0);
		
		//edificio1.ordenarSubida(5);
		//edificio1.ordenarSubida(8);
		edificio2.ordenBajada(2);
		edificio2.ordenarSubida(1);
		edificio2.ordenBajada(5);
	}

}
