package examen2Inmovibilaria;

import java.util.ArrayList;

public class Casa extends Inmueble {
	private int numHabitaciones;
	private int baños;
	private int plantas;
	private ArrayList<Habitacion> habitacion;
	
	public Casa(int id, String direccion, double precioVenta, double superficie, int numHabitaciones, int baños,
			int plantas) {
		super(id, direccion, precioVenta, superficie);
		this.numHabitaciones = numHabitaciones;
		this.baños = baños;
		this.plantas = plantas;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public int getBaños() {
		return baños;
	}

	public int getPlantas() {
		return plantas;
	}

	@Override
	public String toString() {
		return "Casa [ Id =" + getId() + ", Direccion =" + getDireccion()
				+ ", PrecioVenta =" + getPrecioVenta() + ", Superficie =" + getSuperficie() + 
				"numHabitaciones=" + numHabitaciones + ", baños=" + baños + ", plantas=" + plantas + ", habitacion=" + habitacion + ", ]";
	}

	
	
}
	
	
	
	
