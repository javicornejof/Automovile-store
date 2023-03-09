package cl.edutecno;

public class Bus extends Vehiculo {

	int cantidadAsientos = 0;

	public  Bus(String color, String patente, int cantidadAsientos) {
		super(color, patente);
		this.cantidadAsientos = cantidadAsientos;
	}

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}

	public int asientosDisponibles() {
		int cantidadAsientosDisponibles = 0;
		return cantidadAsientosDisponibles;

	}
}
