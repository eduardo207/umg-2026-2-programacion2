package edu.umg.progra2;

public abstract class Figura {

	String color = "";
	
	// Implementar función de calculo del área
	public abstract double calcularArea();
	
	public void mostrarInformacion() {
		System.out.println("Calculo del área");
		System.out.println("Figura de color: " + color);
		System.out.println("Área de figura: " + calcularArea() + " metros cuadrados.");
	}
	
}
