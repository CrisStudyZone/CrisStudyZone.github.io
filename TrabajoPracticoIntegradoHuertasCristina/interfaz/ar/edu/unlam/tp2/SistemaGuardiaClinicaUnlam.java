package ar.edu.unlam.tp2;

import java.util.Date;
import java.util.Scanner;

public class SistemaGuardiaClinicaUnlam {

	public static void main(String[] args) {

		OpcionesDeMenu opcionDeMenuPrincipal;
		Scanner teclado = new Scanner(System.in);
		Guardia actual = new Guardia();
		Date fecha = new Date();
		actual.inicializoLasCamasDisponibles();
		
		do {
			menu();
			opcionDeMenuPrincipal = ejecutarOpcionDeseada(teclado, actual, fecha);
		} while (opcionDeMenuPrincipal != OpcionesDeMenu.SALIR);
	}

	private static OpcionesDeMenu ejecutarOpcionDeseada(Scanner teclado, Guardia actual, Date fecha) {
		OpcionesDeMenu opcionDeMenuPrincipal = OpcionesDeMenu.SALIR;
		System.out.println("Ingrese la opcion deseada");
		OpcionesDeMenu opcionesDisponibles[] = OpcionesDeMenu.values();
		int opcionIngresada = teclado.nextInt();
		opcionDeMenuPrincipal = validarIngresoDeTeclado(teclado, opcionesDisponibles, opcionIngresada);
		switch (opcionDeMenuPrincipal) {
		case INGRESAR_PACIENTE:
			ingresarPaciente(teclado, actual);
			break;
		case BUSCAR_PACIENTE_POR_DNI:
			System.out.println("Ingrese el DNI del paciente que desea buscar");
			long pacienteBuscado = teclado.nextLong();
			System.out.println(actual.buscarPaciente(pacienteBuscado));
			break;
		case LISTAR_PACIENTES_INGRESADOS:
			System.out.println("Lista de paciente ingresados");
			System.out.println(actual.listaDePacientesIngresados());
			break;
		case DAR_ALTA_PACIENTE:
				
			System.out.println("Ingrese el DNI del paciente que quiere dar de alta");
			
			if (actual.darAltaPaciente(teclado.nextLong(), fecha) == true) {
				System.out.println("El paciente se ha dado de alta correctamente");
			} else {
				System.out.println("El paciente no esta ingresado en el sistema");
			}
			break;
		case CONSULTAR_REGISTRO_DE_PACIENTES_DADOS_DE_ALTA:
			System.out.println("Los pacientes Dados de alta son: \n" + actual.listaDePacientesDadosDeAlta());
			break;
		case TOTAL_DE_PACIENTES_INGRESADOS:
			System.out.println("El total de pacientes ingresados es: " + actual.cantidadDePacientesIngresados());
			break;
		case CONSULTAR_CAMAS_DISPONIBLES:
			System.out.println("La cantidad de camas disponibles es: " + actual.cantidadDeCamasDisponibles());
			break;
		case SALIR:
			System.out.println("Adios");
			break;
		case INGRESE_UNA_OPCION_VALIDA:
			System.out.println("Usted a ingresado una opcion invalida.\n");
		}return opcionDeMenuPrincipal;
	}

	private static void menu() {
		System.out.println("********************************************");
		System.out.println("Bienvenido a los consultorios externos UNLAM");
		System.out.println("********************************************");
		System.out.println("Menu principal");
		System.out.println("1 - Ingresar paciente");
		System.out.println("2 - Buscar paciente por DNI");
		System.out.println("3 - Listar pacientes ingresados");
		System.out.println("4 - Dar de alta paciente por DNI");
		System.out.println("5 - Consultar registro de pacientes dados de alta");
		System.out.println("6 - Total de pacientes ingresados");
		System.out.println("7 - Consultar camas disponibles");
		System.out.println("8 - Salir");
		System.out.println("********************************************");
	}
	private static OpcionesDeMenu validarIngresoDeTeclado(Scanner teclado, OpcionesDeMenu[] opcionesDisponibles,
			int opcionIngresada) {
		OpcionesDeMenu opcionDeMenuPrincipal;
		if(opcionIngresada<opcionesDisponibles.length) {
			opcionDeMenuPrincipal = opcionesDisponibles[opcionIngresada-1];
			return opcionDeMenuPrincipal;
		}
		else {
			return OpcionesDeMenu.INGRESE_UNA_OPCION_VALIDA;
		}		
	}
	private static void ingresarPaciente(Scanner teclado, Guardia actual) {
		Paciente nuevo = new Paciente();
		System.out.println("Ingrese el nombre");
		nuevo.setNombre(teclado.next());
		System.out.println("Ingrese el apellido");
		nuevo.setApellido(teclado.next());
		System.out.println("Ingrese el DNI");
		nuevo.setDNI(teclado.nextLong());
		System.out.println("Ingrese la localidad");
		mostrarLocalidades();
		int localidadIngresada = teclado.nextInt();
		Localidad localidad = Localidad.values()[localidadIngresada - 1];
		nuevo.setLocalidad(localidad);
		System.out.println("Ingrese la edad");
		nuevo.setEdad(teclado.nextInt());
		System.out.println("Ingrese el telefono");
		nuevo.setTelefono(teclado.nextLong());
		System.out.println("A que cama lo desea asignar");
		System.out.println(actual.listarCamasDisponibles());
		int numeroDeCama = teclado.nextInt();
		if(actual.agregarPaciente(nuevo,numeroDeCama)==true) {
			System.out.println("El paciente se ha ingresado correctamente");
			System.out.println("Asignado a la cama numero: " + actual.getNumeroDeCamaAsignadoAlPaciente(nuevo));
		}
		
	}

	private static void mostrarLocalidades() {
		System.out.println("1 SAN_JUSTO");
		System.out.println("2 RAMOS_MEJIA");
		System.out.println("3 ISIDRO_CASANOVA");
		System.out.println("4 LAFERRERE");
		System.out.println("5 GONZALEZ_CATAN");
		System.out.println("6 LA_TABLADA");
		System.out.println("7 LOMAS_DEL_MIRADOR");
		System.out.println("8 VILLA_LUZURIAGA");
		System.out.println("9 VILLA_MADERO");
		System.out.println("10 RAFAEL_CASTILLO");
		System.out.println("11 OTRAS");
	}

}
