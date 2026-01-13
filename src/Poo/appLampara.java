package Poo;

public class appLampara {

	public static void main(String[] args) {
		
		LamparaJava lampara1 = new LamparaJava("Rojo", "Philips");
		LamparaJava lampara2 = new LamparaJava("Blanco", "Ikea");
		
		lampara1.estado();
		lampara1.encender();
		lampara1.estado();
		
		lampara2.estado();
		lampara2.encender();
		lampara2.estado();
		

	}

}
