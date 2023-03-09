package cl.edutecno;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class LibroVenta {
	
	
	String nombreVenta;
	String fechaVenta;
	
	public LibroVenta(String nombreVenta, String fechaVenta) {
		super();
		this.nombreVenta = nombreVenta;
		this.fechaVenta = fechaVenta;
	}
	public String getNombreVenta() {
		return nombreVenta;
	}
	public void setNombreVenta(String nombreVenta) {
		this.nombreVenta = nombreVenta;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	private static void crearDirectorio(String nombreDirectorio) {

		// File directorio = new File("src/"+ nombreDirectorio);//declarando instancia
		// de la clase File (para que quede fijo el /
		File directorio = new File("src" + File.separator + nombreDirectorio);

		if (!directorio.exists()) {
			directorio.mkdir(); // metodo para crear directorio
			System.out.println("Directorio creado");

		} else {
			System.out.println("El directorio existe");

		}

	}

	private void guardarVenta (String nombreDirectorio, String nombreArchivo, Cliente cliente, Vehiculo vehiculo) {
		// TODO Auto-generated method stub

		
		try {
			File archivo = new File("src" + File.separator + nombreDirectorio + File.separator + nombreArchivo + ".txt");
			FileWriter fileWriter = new FileWriter(archivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			if (!archivo.exists()) {
				archivo.createNewFile(); // metodo para crear ARCHIVO
			}
			bufferedWriter.write(vehiculo.getPatente()+ cliente.getEdad()+ getFechaVenta() + getNombreVenta());
				fileWriter.write(vehiculo.getPatente()+ cliente.getEdad()+ getFechaVenta() + getNombreVenta());
				
				bufferedWriter.close();
				fileWriter.close();

			
	} catch (IOException e) {
			e.printStackTrace();// imprime traza del error donde suceddió en el código
			System.out.println("Sucedió un error al intentar crear y escribir en el archivo");
		}
	}
		
//		Crear un directorio con nombre “ficheros” que contará con un archivo donde se
//		guardará la patente del vehículo, la edad del cliente, la fecha de la venta y el nombre
//		de venta. Este método recibe un atributo de tipo Cliente y un atributo de tipo
//		Vehiculo.
		
//		El archivo debe llamarse según el atributo “nombre venta” y tener extensión “.txt”.
//		● Guardar la fecha como número.
//		● Utilizar tantas exception sean necesarias.
//		● Utilizar Try-Catch.


	

}
