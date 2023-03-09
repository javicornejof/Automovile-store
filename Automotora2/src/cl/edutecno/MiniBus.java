package cl.edutecno;

public class MiniBus extends Bus {
	private String tipoViaje;
	
	public MiniBus(String color, String patente, int cantidadAsientos, String tipoViaje) {
		super(color, patente, cantidadAsientos);
		this.tipoViaje= tipoViaje;

		
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	@Override
	public String toString() {
		return "MiniBus [tipoViaje=" + tipoViaje + ", cantidadAsientos=" + cantidadAsientos + ", color=" + color
				+ ", patente=" + patente + "]";

	}


	
	
	
}
	
	
	

