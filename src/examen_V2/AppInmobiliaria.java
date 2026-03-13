package examen_V2;

public class AppInmobiliaria {

	public static void main(String[] args) {
		
		Inmueble local1 = new LocalComercial(10,"Calle mayor", 120000,80.0,true);
		Inmueble casa1 = new Casa(202,"Av del parque 12",350000,200.0,2,2);
		
		
		System.out.println(local1);
		System.out.println(casa1);
		//System.out.println(habi);
		
		

	}

}
