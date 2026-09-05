package edu.umg.progra2;

// Clase  general o abstracta (Figura)
// Clases especificas Circulo, Cuadrado 

public class Main {

	// Que se implemente el calculo del área de un circulo, un rectangulo y un cuadrado.
	// A cada elemento se le debe asignar un color especifico
	public static void main(String args[]) {
		System.out.println("Ejemplo POO Abstracción");
		/*
		//Calculo del area de nuestra primer figura tipo circulo
		System.out.println("Calculo del área de un circulo");
		Circulo circulo1 = new Circulo();
		circulo1.color = "Azul";
		circulo1.radio = 12.5;
		double resultado = circulo1.calcularArea();
		System.out.println("El circulo color: " + circulo1.color + " tiene un área de: " + resultado + " metros cuadrados");
		
		//Calculo de área para un cuadrado
		System.out.println();
		System.out.println("Calculo del área de un cuadrado");
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.colorCuadrado = "Rojo";
		cuadrado1.lado = 25;
		double resultadoCuadrado = cuadrado1.obtenerArea();
		System.out.println("El cuadrado color: " + cuadrado1.colorCuadrado + " tiene un área de: " + resultadoCuadrado + " metros cuadrados");
		
		//Calculo de área de un rectangulo
		System.out.println();
		System.out.println("Calculo del área de un rectangulo");
		Rectangulo rect1 = new Rectangulo();
		rect1.colorFigura = "Verde";
		rect1.base = 25;
		rect1.altura = 10;
		double areaRectangulo = rect1.getArea();
		System.out.println("El rectangulo color: " + rect1.colorFigura + " tiene un área de: " + areaRectangulo + " metros cuadrados");
		*/
		
		//Calculo del area de nuestra primer figura tipo circulo
		System.out.println("Calculo del área de un circulo");
		Circulo circulo1 = new Circulo();
		circulo1.color = "Azul";
		circulo1.radio = 12.5;
		circulo1.calcularArea();
		circulo1.mostrarInformacion();
		
		//Calculo de área para un cuadrado
		System.out.println();
		System.out.println("Calculo del área de un cuadrado");
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.color = "Rojo";
		cuadrado1.lado = 25;
		cuadrado1.calcularArea();
		cuadrado1.mostrarInformacion();
		
		//Calculo de área de un rectangulo
		System.out.println();
		System.out.println("Calculo del área de un rectangulo");
		Rectangulo rect1 = new Rectangulo();
		rect1.color = "Verde";
		rect1.base = 25;
		rect1.altura = 10;
		rect1.calcularArea();
		rect1.mostrarInformacion();
	}
	
}

