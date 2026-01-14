package Poo;

public class AppTermometro {

	public static void main(String[] args) {
		Termometro termSalon = new Termometro(400, "Infrarojo");
		
		System.out.print("En el salon hace " + termSalon.getTemperatura()+ " grados, segun el termometro de " + termSalon.getTipo());
		
		termSalon.setTemperatura(2000);
		System.out.println("En el salon hace " + termSalon.getTemperatura() + " grados");
	}

}
