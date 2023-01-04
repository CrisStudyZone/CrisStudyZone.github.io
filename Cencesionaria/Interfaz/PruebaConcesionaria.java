import java.util.Scanner;

import ClaseFull.Auto;
import ClaseFull.Concesionaria;

public class PruebaConcesionaria {

	public static void main(String[] args) {

		Funcionalidades opcionElegida;
		Scanner teclado = new Scanner(System.in);
		Concesionaria actual = new Concesionaria();
		actual.setNombre("Blue");
		System.out.println("Bienvenido a la concesionaria "+ actual.getNombre());
		
		do {
			menu();
			opcionElegida = ejecutarOpcionDeseada(teclado,actual);
		}while(opcionElegida!= Funcionalidades.SALIR);
	teclado.close();	
	}

	private static Funcionalidades ejecutarOpcionDeseada(Scanner teclado, Concesionaria blue) {
		Funcionalidades opcionElegida = Funcionalidades.SALIR;
		System.out.println("Ingrese la opcion deseada");
		Funcionalidades opcionesDisponibles[] = Funcionalidades.values();
		//.values() devuelve un array con todos los elementos q posee un menu
		int opcionIngresada = teclado.nextInt();
		char siOno;
		opcionElegida = validarIngresoDeTeclado(teclado, opcionesDisponibles, opcionIngresada);
		switch(opcionElegida) {
		case INGRESAR_AUTO:
			//composicion = cuando una clase contiene a otra
			imprimirTitulo("Ingresar auto");
			ingresarAuto(teclado, blue);
			break;
		case VENDER:
			imprimirTitulo("vender");
			System.out.println("¿Que auto ha vendido?");
			//BuscarAuto
			//flota[i]
			System.out.println("El precio final de venta ha sido= "/*+ flota[getPrecioVenta]*/);
			System.out.println("Digite S o N");
			siOno=teclado.next().toUpperCase().charAt(0);
			if(siOno=='N') {
				/*nuevo.setPrecioDeVenta(teclado.nextDouble();*/
			}
			System.out.println("Ingrese los datos del comprador");
		
			break;
		case CONSULTAR_STOCK:
			imprimirTitulo("Consultar Stock");
			break;
		case BUSCAR_AUTO:
			imprimirTitulo("Buscar Auto");
			break;
		case CONSULTA_SUMA_ASEGURADA:
			imprimirTitulo("Consultar la suma asegurada");
			break;
		case SALIR:
			imprimirTitulo("Salir");
			break;
		}return opcionElegida;
	}

	private static Funcionalidades validarIngresoDeTeclado(Scanner teclado, Funcionalidades[] opcionesDisponibles,
			int opcionIngresada) {
		Funcionalidades opcionElegida;
		if(opcionIngresada>opcionesDisponibles.length) {
			System.out.println("Opcion invalida");
		}
		else {
			opcionElegida = opcionesDisponibles[opcionIngresada-1];
		}
		opcionElegida= opcionesDisponibles[ teclado.nextInt()-1];
		return opcionElegida;
	}

	private static void ingresarAuto(Scanner teclado, Concesionaria blue) {
		char siOno;
		do {
		Auto nuevo = new Auto ();
		System.out.println("Ingrese la marca");
		nuevo.setMarca(teclado.next());
		System.out.println("Ingrese el modelo");
		nuevo.setModelo(teclado.next());
		System.out.println("Ingrese los kilometros");
		nuevo.setKilometrosActuales(teclado.nextInt());
		if(!nuevo.esCeroKilometro()) {
			System.out.println("Ingresar la patente");
			nuevo.setPatente(teclado.next());
		}
		System.out.println("Ingrese el anio");
		nuevo.setAnio(teclado.nextInt());
		System.out.println("Ingrese el precio de compra");
		nuevo.setPrecioDeCompra(teclado.nextDouble());
		System.out.println("Ingrese el precio de venta");
		nuevo.setPrecioDeVenta(teclado.nextDouble());
		blue.guardarAuto(nuevo);
		System.out.println("Usted a cargado el Vehiculo: "+ nuevo.toString());
		System.out.println("¿Desea cargar otro Vehiculo?");
		System.out.println("Digite S o N");
		siOno=teclado.next().toUpperCase().charAt(0);
		}while (siOno=='S');
	}

	private static void menu() {
		System.out.println("1 -> Ingresar Auto");
		System.out.println("2 -> Vender");
		System.out.println("3 -> Consultar Stock");
		System.out.println("4 -> Buscar Auto");
		System.out.println("5 -> Consultar la suma asegurada");
		System.out.println("9 -> Salir");
	}

	private static void imprimirTitulo(String titulo) {
		System.out.println("*************");
		System.out.println(titulo);
		System.out.println("*************");
	}

}
