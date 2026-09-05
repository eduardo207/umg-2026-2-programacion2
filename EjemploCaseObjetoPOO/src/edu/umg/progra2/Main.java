package edu.umg.progra2;

public class Main {

	public static void main(String args[]) {
		
		Persona jersonQuinonez = new Persona("Jerson", "Quiñonez", "12121212", "eduardo207@gmail.com");
		Persona mariaPerez = new Persona("Maria", "Perez", "11111111", "maria@gmail.com");
		
		jersonQuinonez.imprimirInformación();
		System.out.println();
		mariaPerez.imprimirInformación();
		
		
	}
}
