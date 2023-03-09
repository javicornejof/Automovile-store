package cl.edutecno;

public class Tienda {
	private Vendedor vendedor;
	private Cliente cliente; 
	private int Stock;

	
	public Tienda(Vendedor vendedor, Cliente cliente, int stock) {
		super();
		this.vendedor = vendedor;
		this.cliente = cliente;
		this.Stock = stock;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}
	
	public String existestock() {
		
		return "La cantidad de stock es: " + getStock();
	}
	}
	
	

