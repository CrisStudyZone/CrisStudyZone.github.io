package ar.edu.unlam.pb1;

import java.util.Scanner;

public class FixtureMundial {

	private static final Usuario Usuario = null;

	// Cuenta regresiva mundial
	// Segumiento de los partidos
	// consultar fechas y horarios de partidos
	// visualizar resultados
	// realizar apuestas
	// resultado
	// goleadores
	// goles atajados
	// minutos totales de partido
	// minutos de goles
	// Consultar apuestas
	// ganadas
	// perdidas
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Usuario nuevo = new Usuario();
		System.out.println("Bienvenido al mundial de Qatar 2022");
		ingresoDeUsuario(teclado, nuevo);

		teclado.close();
	}

	private static void ingresoDeUsuario(Scanner teclado, Usuario nuevo) {
		System.out.println("De no ser un usuario registrado ingrese 1");
		System.out.println("Si ya esta registrado ingrese 2");
		int opcion = teclado.nextInt();
		switch (opcion) {
		case 1:
			registroDeUsuario(teclado, nuevo);

		case 2:
			System.out.println("Ingrese su usuario");
			String tempUsuario = teclado.next();
			if (tempUsuario.equals(nuevo.getUsuario())) {
				System.out.println("Ingrese su contrasenia");
				String tempContrasenia = teclado.next();
				if (tempContrasenia.equals(nuevo.getContrasenia())) {
					System.out.println("Ingreso Correcto");
					menuPrincipal(teclado);
				}else {
					System.out.println("Contrasenia Incorrectos");
					break; 
				}
				}else {
					System.out.println("Usuario Incorrectos");
					break;
			}
		}
	}

	private static void registroDeUsuario(Scanner teclado, Usuario nuevo) {
		System.out.println("Ingrese su nombre");
		nuevo.setNombre(teclado.next());
		System.out.println("Ingrese su DNI");
		nuevo.setDNI(teclado.nextInt());
		System.out.println("Ingrese un usuario");
		nuevo.setUsuario(teclado.next());
		System.out.println(
				"Ingrese una contraseña que contenga de 4 a 8 caracteres y debe tener números, letras minúsculas y mayúsculas.");
		String tempContrasenia = teclado.next();
		validacionDeContrasenia(tempContrasenia, Usuario);
	}

	private static void validacionDeContrasenia(String tempContrasenia, Usuario nuevo) {
		String contrasenia = tempContrasenia;
		;
		final int MAX = 8;
		final int MIN_Uppercase = 2;
		final int MIN_Lowercase = 2;
		final int NUM_Digitos = 2;
		final int Especial = 2;
		int uppercaseContador = 0;
		int lowercaseContador = 0;
		int digitoContador = 0;
		int especialContador = 0;

		for (int i = 0; i < contrasenia.length(); i++) {
			char c = contrasenia.charAt(i);
			if (Character.isUpperCase(c)) {
				uppercaseContador++;
			} else {
				if (Character.isLowerCase(c)) {
					lowercaseContador++;
				} else {
					if (Character.isDigit(c)) {
						digitoContador++;
					}
					if (c >= 33 && c <= 46 || c == 64) {
						especialContador++;
					}
				}
			}
		}
		if (contrasenia.length() >= MAX && uppercaseContador >= MIN_Uppercase && lowercaseContador >= MIN_Lowercase
				&& digitoContador >= NUM_Digitos && especialContador >= Especial) {
			nuevo.setContrasenia(contrasenia);
			System.out.println("Contraseña Valida");
		} else {
			System.out.println("Su contraseña no contiene los siguiente:");
			if (contrasenia.length() < MAX)
				System.out.println(" Al menos 8 caracteres");
			if (lowercaseContador < MIN_Lowercase)
				System.out.println("Minimo de letras minusculas 2");
			if (uppercaseContador < MIN_Uppercase)
				System.out.println("Minimo de letras mayusculas 2");
			if (digitoContador < NUM_Digitos)
				System.out.println("Minimo de numeros 2");
			if (especialContador < Especial)
				System.out.println("La contraseña debe contener al menos 2 caracteres especiales");

		}
	}

	private static void menuPrincipal(Scanner teclado) {
		int opcionMenu = 0;
		System.out.println("Ingrese la opcion deseada");
		System.out.println("1-Consultar Fechas y horas de partidos");
		System.out.println("2-Visualizar resultados");
		System.out.println("3-Realizar apuestas");
		System.out.println("4-Consultar apuestas realizadas");
		opcionMenu = teclado.nextInt();
		switch (opcionMenu) {
		case 1:
			System.out.println("Consultar Fechas y horas de partidos");
			System.out.println("¿Que ronda desea consultar?");
			System.out.println("0 - Face de grupos");
			System.out.println("1 - Octavos de final");
			System.out.println("2 - Cuartos de final");
			System.out.println("3 - Semifinal");
			System.out.println("4 - Final");

			int ronda = 0;
			switch (ronda) {
			case 0:// getFaceDeGrupos;
			case 1:// getOctavosDeFinal;
			case 2:// getCuartosDeFinal;
			case 3:// getSemifinal;
			case 4:// getFinal;

			}
		case 2:
			System.out.println("2-Visualizar resultados");
		case 3:
			System.out.println("3-Realizar apuestas");
		case 4:
			System.out.println("4-Consultar apuestas realizadas");
		}
	}

}
