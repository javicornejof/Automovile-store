package cl.edutecno;

public class Taxi {

	private int valorPasaje; 
	


public Taxi() {
		super();
		// TODO Auto-generated constructor stub
	}


public int getValorPasaje() {
	return valorPasaje;
}


public int setValorPasaje(int valorPasaje) {
	this.valorPasaje = valorPasaje;
	int vuelto=0;
	int pasaje = 0;
	if ( pasaje >= getValorPasaje()) {
		vuelto = pasaje- getValorPasaje();
		
		return vuelto;
	} else {
		System.out.println("Pago insuficiente");
		return pasaje;
		
	}
}


}
