package gt.com.bodega;

import java.util.Scanner;

public class Main {

	static Scanner entrada = new Scanner(System.in);
	static int cantidadProductos = 0;
	static Producto[] listaProductos = new Producto[1000];
	
	public static void main(String[] args) {
		
		int opcionMenuIngresada = 0;
		
		do {
			limpiarConsolaEclipse();
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("++++++++++++++++ BIENVENIDO A LA BODEGUITA S.A. ++++++++++++++++");
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("| PRODUCTOS EN BODEGA: " + cantidadProductos);
			System.out.println("----------------------------------------------------------------");
			System.out.println("Seleccione una opción del menú:");
			System.out.println("1 - Registrar producto");
			System.out.println("2 - Imprimir inventario");
			System.out.println("3 - Salir");
			opcionMenuIngresada = entrada.nextInt();
			
			switch(opcionMenuIngresada) {
				case 1:
					registrarProducto();
					break;
				case 2:
					imprimirInventario();
					break;
			}
		}while(opcionMenuIngresada != 3);
		
		System.out.println("-------- GRACIAS POR UTILIZAR EL SISTEMA --------");
		System.out.println("------------------- ADIOS -----------------------");
		
		entrada.close();
	}
	
	public static void limpiarConsolaEclipse() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }
	
	public static void registrarProducto() {
		int opcionIngreso = 0;
		do {
			limpiarConsolaEclipse();
			System.out.println("-------- REGISTRAR PRODUCTO --------");
			System.out.print("Titulo: ");
			entrada.nextLine();
			String titulo = entrada.nextLine();
			
			System.out.print("Precio: ");
			double precio = entrada.nextDouble();
			
			System.out.print("Peso: ");
			int peso = entrada.nextInt();
			
			System.out.print("Stock: ");
			int stock = entrada.nextInt();
			
			Producto productoIngresado = new Producto(titulo, precio, peso, stock);
			listaProductos[cantidadProductos] = productoIngresado;
			cantidadProductos++;
			
			System.out.println("");
			System.out.println("Desea ingresar otro producto?");
			System.out.println("1 - SI");
			System.out.println("2 - NO - regresar a menú principal");
			opcionIngreso = entrada.nextInt();
		}while(opcionIngreso !=2 );
	}
	
	public static void imprimirInventario() {
		limpiarConsolaEclipse();
		System.out.println("-------- INVENTARIO DE ACTIVOS --------");
		for(int a=0; a < cantidadProductos; a++) {
			
			System.out.printf("%s | Q. %.2f | %d Libra(s) | %d Unidad(es)", 
				listaProductos[a].getTitulo(),
				listaProductos[a].getPrecio(),
				listaProductos[a].getPeso(),
				listaProductos[a].getStock()
			);
			System.out.println();
		}
		entrada.nextInt();
	}
	
}
