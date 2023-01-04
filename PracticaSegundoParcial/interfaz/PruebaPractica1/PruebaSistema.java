package PruebaPractica1;

import java.util.Scanner;

import Practica1.Sistema;
import Practica1.Usuario;

public class PruebaSistema {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Sistema prueba = new Sistema("PB1-SegundoParcial", 3);

		menuPrincipal(teclado, prueba);

	}

	private static void menuPrincipal(Scanner teclado, Sistema prueba) {
		imprimirTitulo("Bienvenido a nuestros sistema");
		System.out.println("Usted podra:" + "\n1 - Registrar nuevos Usuarios" 
						+ "\n2 - Ver las estadisticas del sistema "
						+ "\n3 - Verificar el acceso al sistema de un " + "usuario determinado"
						+ "\n4 - Salir");
		System.out.println("Seleccione la opcion deseada");
		int opcionMenu = teclado.nextInt();
		switch (opcionMenu) {
		case 1:
			registrarUsuarios(teclado, prueba);
			break;
		case 2:
			menuEstadisticas(teclado, prueba);
			break;
		case 3:
			imprimirTitulo ("Verificar el acceso al sistema de un usuario determinado");
			System.out.println("Ingrese el usuario que desea buscar");
			String usuarioABuscar = teclado.next();
			System.out.println(prueba.buscar(usuarioABuscar));
			break;
		case 4:
			System.out.println("Adios");
			break;
		default:
			System.out.println("Ingrese una opcion valida");
		}
	}

	private static void menuEstadisticas(Scanner teclado, Sistema prueba) {
				
		char opcionDeRetorno='S';
		do{
			imprimirTitulo("Que estadistica desea ver?");
			System.out.println("1 - Cantidad de usuarios logueados");
			System.out.println("2 - Cantidad de usuarios bloqueados");
			System.out.println("3 - Porcentaje de usuarios logueados");
			System.out.println("4 - Edad promedio de los usuarios");
			System.out.println("5 - Volver al menu principal");
			int opcionEstadisticas = teclado.nextInt();
			switch (opcionEstadisticas) {
			case 1: 
				imprimirTitulo("Cantidad de usuarios logueados");
				System.out.println(prueba.calcularLaCantidadDeUsuariosLogueados());
				break;
			case 2:
				imprimirTitulo("Cantidad de usuarios bloqueados");
				System.out.println(prueba.cantidadDeUsuariosBloqueados());
				break;
			case 3:
				imprimirTitulo("Porcentaje de usuarios logueados");
				System.out.println(prueba.porcentajeDeUsuariosLogueados());
				break;
			case 4:
				imprimirTitulo("Edad promedio de los usuarios");
				System.out.println(prueba.calcularEdadPromedio());
				break;
			case 5:
				imprimirTitulo("Volver al menu principal");
				menuPrincipal(teclado, prueba);
				break;
			default: System.out.println("La opcion ingresaa es invalida");
			}
			System.out.println("Desea ver otra estadistica \nSi o No");
			opcionDeRetorno = teclado.next().toUpperCase().charAt(0);
			
		}while (opcionDeRetorno != 'N');
	}

	private static void registrarUsuarios(Scanner teclado, Sistema prueba) {
		imprimirTitulo("Ha seleccionado: \nRegistrar nuevo usuario");
		System.out.println("Ingrese el nombre de Usuario que desea registrar");
		String usuario = teclado.next();
		System.out.println("Ingrese una contrasenia valida");
		String contrasenia = teclado.next();
		
		System.out.println("Ingrese su nombre");
		String nombre = teclado.next();
		System.out.println("Ingrese su apellido");
		String apellido = teclado.next();
		System.out.println("Ingrese su edad");
		int edad = teclado.nextInt();
		Usuario nuevoUsuario = new Usuario(usuario, contrasenia, nombre, apellido, edad);
		prueba.ingresarUsuario(nuevoUsuario);
	}
	private static void imprimirTitulo(String titulo) {
		System.out.println("*************");
		System.out.println(titulo);
		System.out.println("*************");
	}

}
