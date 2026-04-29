package moureDevAbstrac;

public class Composition {

	public static void main(String[] args) {
		// Composición ("tiene un")

        var car = new Car();
        car.on();
    }

    public static class Engine {
    	
    	//Metodo
        public void on() {
            System.out.println("Motor encendido");
        }
    }
    
    //Clase Car, tiene un motor

    public static class Car {

        final private Engine engine = new Engine();

        public void on() {
            engine.on();
        }

	}

}
