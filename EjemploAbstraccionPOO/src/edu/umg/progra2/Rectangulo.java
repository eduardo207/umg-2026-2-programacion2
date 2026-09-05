package edu.umg.progra2;

public class Rectangulo extends Figura{

	public double base = 0.0;
	public double altura = 0.0;
	
	// void: significa que no va a retornar ningun valor la función
	// string, int, double, boolean significa que debe retornar un valor del tipo que estoy declarando
	public double calcularArea() {
		return base * altura;
	}
}
