package gt.edu.umg;

public class Main {

	/**
		Ejemplo de PILA
		Pila de platos
	*/
	// Declaración del arreglo simple
	String[] pilaDePlatos = new String[5];
	
	// Variable para el control del tope de la pila
	int tope = -1;
	
	public static void main(String[] args) {
		
		// Instanciación del objeto main
		Main pila = new Main();
		
		System.out.println("Apilando platos 1, 2, 3 y 4");
		// Simil de apilar platos (Simil de la función push)
		pila.push("Plato número 1");
		pila.push("Plato número 2");
		pila.push("Plato número 3");
		pila.push("Plato número 4");
		
		System.out.println("Desapilando platos con función pop");
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
		System.out.println(pila.pop());
	}
	
	public void push(String elemento) {
		pilaDePlatos[++tope] = elemento;
	}
	
	public String pop() {
		String elementoTope = pilaDePlatos[tope];
		pilaDePlatos[tope] = null;
		tope--;
		return elementoTope;
	}
}
