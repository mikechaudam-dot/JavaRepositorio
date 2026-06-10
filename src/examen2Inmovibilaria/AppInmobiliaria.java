package examen2Inmovibilaria;

public class AppInmobiliaria {

	public static void main(String[] args) {
		
		//Instnciamos los locales comerciales 
		Local local1 = new Local(011,"calle a",60.000,100,true);
		Local local2 = new Local(012,"calle b",800.000,100,true);
		
		System.out.println(local1.toString());
		System.out.println(local2.toString());
		
		//Instanciamos las primeras casas e inmuebles
		Casa casa1 = new Casa(001, "Calle x", 120.000,50,3,2,2);
		Casa casa2 = new Casa(002, "Calle y", 90.000,30,2,2,2);
		
		System.out.println(casa1.toString());
		System.out.println(casa2.toString());
		
		//Instaciamos habitaciones 
		Habitacion habi1 = new Habitacion(10.0, 1, "dormitorio");
		Habitacion habi2 = new Habitacion(15.0, 2, "despacho");
		
		System.out.println(habi1.toString());
		System.out.println(habi2.toString());
		
	}

}
