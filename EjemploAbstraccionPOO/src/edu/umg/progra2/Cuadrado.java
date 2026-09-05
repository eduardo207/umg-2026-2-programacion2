package edu.umg.progra2;

public class Cuadrado extends Figura {

	public double lado = 0.0;
	
	// void: significa que no va a retornar ningun valor la función
	// string, int, double, boolean significa que debe retornar un valor del tipo que estoy declarando
	public double calcularArea() {
		return lado * lado;
	}
}