package cl.edutecno;

public class LibroDeVenta {

	private Tienda nombreTienda; 
	private double montoVendido; 
	private Vehiculo tipoVehiculo;
	
	
	public LibroDeVenta(Tienda nombreTienda, double montoVendido, Vehiculo tipoVehiculo) {
		super();
		this.nombreTienda = nombreTienda;
		this.montoVendido = montoVendido;
		this.tipoVehiculo = tipoVehiculo;
	}
	public Tienda getNombreTienda() {
		return nombreTienda;
	}
	public void setNombreTienda(Tienda nombreTienda) {
		this.nombreTienda = nombreTienda;
	}
	public double getMontoVendido() {
		return montoVendido;
	}
	public void setMontoVendido(double montoVendido) {
		this.montoVendido = montoVendido;
	}
	public Vehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}
	public void setTipoVehiculo(Vehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	} 
	
	
	
	
	
}
