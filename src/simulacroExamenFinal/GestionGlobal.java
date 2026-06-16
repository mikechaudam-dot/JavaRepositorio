package simulacroExamenFinal;

import java.util.ArrayList;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class GestionGlobal {
	
	ArrayList<Vehiculo> flota = new ArrayList<>();
	
	// Primer Metodo 
	public static void registroCarga(Vehiculo v, int cargaAñadida) throws CapacidadExcedidaException{
		double cargaActual = 0;
		//Comparamos la capacidad de carga actual la que se añade con respecto al vehiculo instanciado
		if(cargaActual + cargaAñadida <= v.getCapacidad_carga()) {
			cargaActual += cargaAñadida;
		}else {
			throw new CapacidadExcedidaException("Capacida exedida");
		}
	}
	
	// Segundo metodo 
	public void generarInformeGestiones() {
		
		File miFichero = new File("Registo_emisiones.txt");
		PrintWriter escritor = null;
		double umbralPermitido = 7.0;
		
		try {
			escritor = new PrintWriter(miFichero);
			
			for(Vehiculo v : flota) {
				double impacto = v.calcularImpactoCarbono();
				
				if (impacto > umbralPermitido) {
					escritor.print("Vehiculo Matricula " + v.getMatricula() + " - Impacto " + impacto);
				}
			}
			
			//Recorrer todos los vehiculos de la flota
		}catch (FileNotFoundException e) {
			System.out.println("Error no se pudo crear el archivo de registro.");
		}finally {
			//Nos aseguramos de cerrar siempre el fichero, de lo contrario no escribira 
			if(escritor != null) {
				escritor.close();
			}
			System.out.println("Auditoria de flota terminada");
		}
	}
	
	public void busquedaEficiencia() {
		double mayorAutonomia = 0;
		Furgo_elec furgonetaGanadora = null; //Variable para recordar el objeto ganador 
		
		for(Vehiculo v:flota ) {
			if(v instanceof Furgo_elec) {
				
				//Castero tratamos temporalmente a v como la furgoneta que es
				Furgo_elec f = (Furgo_elec) v;
				//Realizamos la comparacion 
				if(f.getPorcentaje_bateria() > mayorAutonomia) {
					mayorAutonomia = f.getPorcentaje_bateria();
					furgonetaGanadora = f;
				}
			}
		}
		// Imprimimos fuera del bucle usando el objeto que guardo el ganador 
		if(furgonetaGanadora != null ) {
			System.out.println("La furgoneta con mayor autonomia es: " + furgonetaGanadora.getMatricula() + 
					"Con el conductor " + furgonetaGanadora.getConductor_asignado().getNombre());
		}else {
			System.out.println("No hay furgonetas electricas en la flota. ");
		}
	}
}
