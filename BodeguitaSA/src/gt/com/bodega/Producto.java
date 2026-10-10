package gt.com.bodega;

public class Producto {

	private String 	titulo 	= "";
	private double	precio 	= 0.0;
	private int	 	peso 	= 0;
	private int 	stock 	= 0;
	
	public Producto(String titulo, double precio, int peso, int stock) {
		this.setTitulo(titulo);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setStock(stock);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio < 0)
			this.precio = 0;
		else
			this.precio = precio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		if(peso < 0)
			this.peso = 0;
		else
			this.peso = peso;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		if(stock < 0 ) 
			this.stock = 0;
		else
			this.stock = stock;
	}
}
