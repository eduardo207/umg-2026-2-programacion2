package edu.umg.progra2;

public class Main {

	public static void main(String args[]) {
		System.out.println("PROGRAMACIÓN 2 - EJEMPLO DE HERENCIA");
		
		// Crear un perro
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";

        miPerro.comer("croquetas"); // Método heredado
        miPerro.ladrar(); 			// Método propio

        System.out.println();

        // Crear un gato
        Aguila miGato = new Aguila();
        miGato.nombre = "Ave Fenix";

        miGato.comer("ratones");   	// Método heredado
        miGato.volar(); 			// Método propio
		
	}
}
