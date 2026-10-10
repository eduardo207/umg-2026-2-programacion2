package gt.edu.umg;

import java.util.Scanner;

public class Main {

	public static void main(String []args) {
		
		//EJEMPLO 1
		// Variable para ingreso de datos via consola
		Scanner entrada = new Scanner(System.in);
		
		//Variable para almacenar tareas tipo TDA simple
		String[] tareas = new String[10]; 
		
		for(int index = 0; index < 10; index++) {
			System.out.println("Ingrese la tarea " + (index+1) +  " a realizar:");
			tareas[index] = entrada.nextLine();
		}
		
		System.out.println("------ LISTADO DE TAREAS A REALIZAR ------");
		for(int index = 0; index < 10; index++) {
			System.out.println("TAREA #" + (index + 1) + " indice[" + index + "]: " + tareas[index]);
		}
		entrada.close();
	}
}
