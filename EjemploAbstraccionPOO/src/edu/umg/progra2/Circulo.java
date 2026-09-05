package edu.umg.progra2;

public class Circulo extends Figura {

	public double radio = 0.0;
	
	// void: significa que no va a retornar ningun valor la función
	// string, int, double, boolean significa que debe retornar un valor del tipo que estoy declarando
	@Override
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
}
