package ar.edu.unlam.pb1;

import java.util.Scanner;

public class Album {

	private static String selecciones[] = { "Qatar", "Ecuador", "Senegal", "Paises Bajos", "Inglaterra", "Ir�n", "EEUU",
			"Gales", "Argentina", "Arabia Saudita", "M�xico", "Polonia", "Francia", "Australia", "Dinamarca", "Tunez",
			"Espa�a", "Costa Rica", "Alemania", "Jap�n", "B�lgica", "Canad�", "Marruecos", "Croacia", "Brasil",
			"Serbia", "Suiza", "Camer�n", "Portugal", "Ghana", "Uruguay", "Corea del Sur" };

	private static Figurita figuritasDisponibles[] = new Figurita[704];
	private Figurita figuritasActuales[];

	public Album() {
		/*
		 * El constructor debe generar las condiciones necesaias para garantizar el
		 * correcto funcionamiento de la app
		 */
		figuritasActuales = new Figurita[2500];
	}

	public static void inicializarCodigosDeFiguritas() {
		/*
		 * Por cada pa�s debe generar 22 c�digos de manera autom�tica por ejemplo QAT1,
		 * URU12, COS10
		 */
		String codigoLetra;
		String codigoFinal;
		int posicionFiguritas = 0;
		for (int i = 0; i < selecciones.length; i++) {
			codigoLetra = selecciones[i].substring(0, 3).toUpperCase();
			for (int j = 1; j < 23; j++) {
				codigoFinal = codigoLetra + j;
				figuritasDisponibles[posicionFiguritas++] = new Figurita(codigoFinal, selecciones[i]);
			}
		}
	}

	public static void actualizarDatosFigurita(String codigo, char grupo, String nombreJugador, double valor) {
		/*
		 * En funci�n del c�digo de figurita, se deben actualizar los datos de la misma
		 * en figuritasDisponibles
		 */
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i].getCodigo().equals(codigo)) {
				figuritasDisponibles[i].setGrupo(grupo);
				figuritasDisponibles[i].setNombreJugador(nombreJugador);
				figuritasDisponibles[i].setValor(valor);
			}
		}
	}

	public static Figurita getFigurita(String codigo) {
		/*
		 * En funci�n del c�digo de figurita, devuelve la figurita de
		 * figuritasDisponibles
		 */
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			if (figuritasDisponibles[i].getCodigo().equals(codigo)) {
				return figuritasDisponibles[i];
			}
		}
		return null;
	}

	public Figurita[] generarSobre() {
		/*
		 * Se debe calcular y devolver 5 c�digos de figurita de manera aleatoria.
		 */
		Figurita sobre[] = new Figurita[5];
		for (int i = 0; i < sobre.length; i++) {
			int posicion = 0;
			posicion = (int) (Math.random() * 704);
			sobre[i] = figuritasDisponibles[posicion];
		}
		return sobre;
	}

	public void agregarFigurita(Figurita nueva) {
		/*
		 * Agrega una nueva figurita al array figuritasActuales
		 */
		for (int i = 0; i < figuritasActuales.length; i++) {
			if (figuritasActuales[i] == null) {
				figuritasActuales[i] = nueva;
				return;// Este return es para que salga
			}
		}
	}

	public void ordenarFiguritasActuales() {
		/*
		 * Debe ordenar el array figuritasActuales
		 */
		for (int i = 01; i < figuritasActuales.length; i++) {
			for (int j = 0; j < figuritasActuales.length - 1; j++) {
				if (figuritasActuales[j] != null && figuritasActuales[j + 1] != null
						&& figuritasActuales[j].getCodigo().compareTo(figuritasActuales[j + 1].getCodigo()) > 0) {
					Figurita temporal = figuritasActuales[j];
					figuritasActuales[j] = figuritasActuales[j + 1];
					figuritasActuales[j + 1] = temporal;
				}
			}
		}
	}

	public boolean elAlbumEstaCompleto() {
		/*
		 * Debe verificar que todas las figuritas disponibles est�n presentes al menos
		 * una vez en las figuritas actuales
		 */
		if (calcularPorcentajeCompletado() == 100) {
			return true;
		} else {
			return false;
		}
	}

	public double calcularPorcentajeCompletado() {
		/*
		 * Debe calcular el porcentaje de figuritas del album que est� completo. Para
		 * esto se debe basar en la informaci�n de las figuritasDisponibles en relaci�n
		 * a las figuritasActuales que se tiene en el album.
		 */
		int figuritasSinRepetir = 0;
		double porcentaje = 0.0;
		for (int i = 0; i < figuritasDisponibles.length; i++) {
			for (int j = 0; j < figuritasActuales.length; j++) {
				if (figuritasActuales[j] != null
						&& figuritasDisponibles[i].getCodigo().equals(figuritasActuales[j].getCodigo())) {
					figuritasSinRepetir++;
					break;// (es igual poner i++)
				}
			}
		}
		porcentaje = figuritasSinRepetir * 100 / figuritasDisponibles.length;
		return porcentaje;
	}

	public String toString() {
		String resultado = "";
		for (int i = 0; i < figuritasActuales.length; i++) {
			if (figuritasActuales[i] != null) {
				resultado += figuritasActuales[i].toString() + "\n";
			}
		}
		return resultado;
	}
}
