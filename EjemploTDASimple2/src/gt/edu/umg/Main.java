package gt.edu.umg;

import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		//EJEMPLO 2:
		// Variable para ingreso de datos via consola
		Scanner entrada = new Scanner(System.in);
		
		double[] notas = new double[15];
		
		double sumaNotas = 0;
		
		System.out.println("--- INGRESO DE NOTAS ---");
		for (int index = 0; index < 15; index++) {
			System.out.print("Ingrese la nota del alumno " + (index + 1) + ": ");
			notas[index] = entrada.nextDouble();
			sumaNotas += notas[index];
		}
		
		double promedio = sumaNotas / 15;
		
		System.out.println("\n--- RESULTADOS FINALES ---");
		
		for (int index = 0; index < 15; index++) {
			System.out.println("Alumno #" + (index + 1) + " (índice [" + index + "]): " + notas[index]);
		}
		
		System.out.println("----------------------------");
		System.out.println("El promedio general de los 15 alumnos es: " + promedio);
		entrada.close();
	}
}
