package gt.edu.umg;

public class Main {

	/**
		Ejemplo de COLA
		Cola de clientes
	*/
	// Declaración del arreglo simple
	String[] colaDeClientes = new String[5];
	
	// Variable para el control del tope de la pila
	int inicio = 0;
	int fin = 0;
	
	public static void main(String[] args) {
		
		// Instanciación del objeto main
		Main cola = new Main();
		
		System.out.println("Los clientes estan llegando:");
		cola.offer("Ana");
		cola.offer("Jerson");
		cola.offer("Andrea");
		cola.offer("Eliza");
		
		System.out.println("Los clientes se estan atendiendo");
		cola.poll();
		cola.poll();
		cola.poll();
		cola.poll();
	}
	
	public void offer(String nombreCliente) {
		System.out.println("Llego el cliente: " + nombreCliente);
		colaDeClientes[fin++] = nombreCliente;
	}
	
	public String poll() {
		System.out.println("Se atendio al cliente: " + colaDeClientes[inicio]);
		String clienteAtendido = colaDeClientes[inicio];
		colaDeClientes[inicio] = null;
		inicio++;
		return clienteAtendido;
	}
	
}
