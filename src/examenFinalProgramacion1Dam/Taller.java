package examenFinalProgramacion1Dam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Taller {
	
	private double precioHora;
	//Historial intervenciones realizadas
	ArrayList<Intervencion> historialIngreso = new ArrayList<>();
	
	

	public Taller(double precioHora, ArrayList<Intervencion> historialIngreso) {
		super();
		this.precioHora = precioHora;
		this.historialIngreso = historialIngreso;
	}
	

	public double getPrecioHora() {
		return precioHora;
	}


	public ArrayList<Intervencion> getHistorialIngreso() {
		return historialIngreso;
	}



	public void resgitroIntervenciones(Intervencion objetos ) {
		historialIngreso.add(objetos);
	}
		
	
	public double costeBase(Intervencion i){
		double VariablecosteBase = 0;
		return VariablecosteBase;
	}
	
	public double costeFinal(Intervencion i){
		double VariableCosteFinal = 0;
		return VariableCosteFinal;
	}
	
    public void ConsultaHistorial(Intervencion elementoBuscado) {
    	File miFicheroMultiFix = new File("informe_IDENTIFICADOR.txt");
		PrintWriter escritor = null;
		
		try {
			escritor = new PrintWriter(miFicheroMultiFix);
			
			for(Intervencion i: historialIngreso){
				if(elementoBuscado == i){
					escritor.print("Identificador del elemento " + i.getElemento1() + "averia: " + i.getDescripcionAveria() + " costo total " + i.getCostoPiezas());
				}
			}
		}catch(FileNotFoundException e){
			System.out.println("Elemento no encontrado");
		}finally {
			if(escritor != null) {
				escritor.close();
			}
			System.out.println("Busqueda de objetos terminada");
		}
		
		
	}
	
}


