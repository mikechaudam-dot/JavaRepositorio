package examen_V2.calculosEstadisticos;

public class Calculos {
	
	//Metodo media 
	public static double MediaAritmetica(Muestra a) {
		double media = 0;
		double suma = 0;
		for(int i: a.getDatos()) {
			suma += i;
		}
		media = suma / a.getDatos().size();
		return media;
	}
	//Metodo moda 
	public static int Moda(Muestra a){
		int moda = 0;
		int repeticionesMax = 0;
		for(int i = 0; i < a.getDatos().size(); i++) {
			int repeticiones = 0;
			for(int j = 0; j < a.getDatos().size();j++) {
				if(a.getDatos().get(i) == a.getDatos().get(j)){
					repeticiones ++;
				}
				if(repeticiones > repeticionesMax) {
					moda = a.getDatos().get(i);
					repeticionesMax = repeticiones;
				}
		}
	}if (repeticionesMax <= 1) {
		System.out.println("No hay moda por que ningun numero esta mas de una vez");
	}
		return moda;
	}
	
	
}
