package edu.umg.progra2;

public class Persona {

	private String nombres = "";
	private String apellidos = "";
	private String telefono = "";
	private String email = "";
	
	// Declaración de constructor de la clase
	public Persona(String nombresParam, String apellidosParam, String telefonoParam, String emailParam) {
		nombres = nombresParam;
		apellidos = apellidosParam;
		telefono = telefonoParam;
		email = emailParam;
	}
	
	public void imprimirInformación() {
		System.out.println("Información de persona");
		System.out.println("Nombres: " + nombres);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("telefono: " + telefono);
		System.out.println("email: " + email);
	}
}
