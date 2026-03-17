package exercism;

public class Lasagna {
	
	public int expectedMinutesInOven(){
		int expectedMinutesInOven = 40;
		return expectedMinutesInOven;
	}
	
	public int remainingMinutesInOven(int minutesInOven) {
		int remainingOven = expectedMinutesInOven() - minutesInOven;
		return remainingOven;
	}
	
	public int preparationTimeInMinutes(int layers){
		int preparationTime = layers * 2;
		return preparationTime;
	}
	
	public int totalTimeInMinutes(int layers, int minutesInOven) {
		int totalWorked = preparationTimeInMinutes(layers) + minutesInOven;
		return totalWorked;
	}
	
	public static void main(String[] args) {
		
		Lasagna lasagna = new Lasagna();
		//Llamamos al metodo de cuanto tiempo deberia estar en el horno
		lasagna.expectedMinutesInOven();
		//Llamamos al metodo de cuanto necesita 
		lasagna.remainingMinutesInOven(10);
		//
		lasagna.preparationTimeInMinutes(5);
		//
		lasagna.totalTimeInMinutes(5,10);
	}
}
