package ar.edu.unlam.tp2;

import java.util.Date;

public class Guardia {

	private int camasDisponibles[];
	private final int CAMAS = 10;
	private Paciente pacientes[];
	private final int MAXIMO_DE_REGISTROS_GUARDADOS = 15;
	private Paciente pacientesDadosDeAlta[];
	private int numeroDeCama = 500;

	public Guardia() {
		pacientes = new Paciente[CAMAS];
		pacientesDadosDeAlta = new Paciente[MAXIMO_DE_REGISTROS_GUARDADOS];
		camasDisponibles = new int[CAMAS];
	}

	public boolean agregarPaciente(Paciente nuevo, int numeroDeCamaAsignado) {
		for (int i = 0; i < camasDisponibles.length; i++) {
			if (camasDisponibles[i] != 0 && camasDisponibles[i] == numeroDeCamaAsignado) {
				camasDisponibles[i] = 0;
			}
		}
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i] == null) {
				pacientes[i] = nuevo;
				nuevo.setNumeroDeCamaAsignado(numeroDeCamaAsignado);
				return true;
			}
		}
		return false;
	}

	public String listaDePacientesIngresados() {
		String pacienteEncontrado = "";
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i] != null) {
				pacienteEncontrado += "[" + (i + 1) + "]" + pacientes[i].toString() + ",\n";
			}
		}
		return pacienteEncontrado;
	}

	public String buscarPaciente(long DNIBuscado) {
		String pacienteEncontrado = "";
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i] != null && pacientes[i].getDNI() == DNIBuscado) {
				pacienteEncontrado = pacientes[i].toString();
				return pacienteEncontrado;
			}
		}
		return "El paciente no ha sido encontrado";
	}

	public boolean darAltaPaciente(long DNIAlta, Date fechaActual) {
		int posicion = 0;
		Paciente tempPacienteARegistro;
		int camaLiberada;
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i].getDNI() == DNIAlta) {
				pacientes[i].setFechaDeAlta(fechaActual);
				camaLiberada = pacientes[i].getNumeroDeCamaAsignado();
				liberarCama(camaLiberada);
				tempPacienteARegistro = pacientes[i];
				pacientes[i] = null;
				guardarRegistroDePacientesDadosDeAlta(posicion, tempPacienteARegistro);
				return true;
			}
		}
		return false;
	}

	private void liberarCama(int camaLiberada) {
		for(int i=0;i<camasDisponibles.length;i++) {
			if(camasDisponibles[i]==0) {
				camasDisponibles[i]=camaLiberada;
			}
		}
	}

	private void guardarRegistroDePacientesDadosDeAlta(int posicion, Paciente tempPacienteARegistro) {
		do {
			for (int j = 0; j < pacientesDadosDeAlta.length; j++) {
				if (pacientesDadosDeAlta[j] == null) {
					posicion = j;
					pacientesDadosDeAlta[j] = tempPacienteARegistro;
					break;
				} else {
					ordenarRegistrosGuardadosPorFecha();
					borrarRegistrosDeAltasAntiguas();
				}
			}
		} while (pacientesDadosDeAlta[posicion].getDNI() != tempPacienteARegistro.getDNI());
	}

	public void ordenarRegistrosGuardadosPorFecha() {
		Paciente auxiliar;
		for (int i = 0; i < pacientesDadosDeAlta.length; i++) {
			for (int j = 0; j < pacientesDadosDeAlta.length - 1; j++) {
				if (pacientesDadosDeAlta[j] != null && pacientesDadosDeAlta[j+1] != null && pacientesDadosDeAlta[j].getFechaDeAlta().after(pacientesDadosDeAlta[j + 1].getFechaDeAlta())) {// Aca
																													// tira
																													// error??
					auxiliar = pacientesDadosDeAlta[j];
					pacientesDadosDeAlta[j] = pacientesDadosDeAlta[j + 1];
					pacientesDadosDeAlta[j + 1] = auxiliar;
				}
			}
		}
	}

	private void borrarRegistrosDeAltasAntiguas() {
		for (int k = 0; k < pacientesDadosDeAlta.length; k++) {
			if (pacientesDadosDeAlta[k] != null) {
				pacientesDadosDeAlta[k] = null;
			}
		}
	}

	public String listaDePacientesDadosDeAlta() {
		String pacienteEncontrado = "";
		for (int i = 0; i < pacientesDadosDeAlta.length; i++) {
			if (pacientesDadosDeAlta[i] != null) {
				pacienteEncontrado += "[" + (i + 1) + "]" + pacientesDadosDeAlta[i].toString() + ",\n";
			}
		}
		return pacienteEncontrado;
	}

	public int cantidadDePacientesIngresados() {
		int cantidadDePacientesIngresados = 0;
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i] != null) {
				cantidadDePacientesIngresados++;
			}
		}
		return cantidadDePacientesIngresados;
	}

	public int getNumeroDeCamaAsignadoAlPaciente(Paciente nuevo) {
		int numeroDeCamaDelPacienteIngresado = 0;
		for (int i = 0; i < pacientes.length; i++) {
			if (pacientes[i] == nuevo) {
				numeroDeCamaDelPacienteIngresado = pacientes[i].getNumeroDeCamaAsignado();
			}
		}
		return numeroDeCamaDelPacienteIngresado;
	}

	public void inicializoLasCamasDisponibles() {
		for (int i = 0; i < camasDisponibles.length; i++) {
			camasDisponibles[i]= numeroDeCama++;
		}
	}

	public int cantidadDeCamasDisponibles() {
		int cantidadDeCamasDisponibles = 0;
		// inicializo las camas disponibles
		// al ingresar un paciente borro el numero de la cama ocupada del array de
		// camasDisponibles
		// luego sumo solo las camas que son distinas de null

		for (int i = 0; i < camasDisponibles.length; i++) {
			if (camasDisponibles[i] != 0) {
				cantidadDeCamasDisponibles++;
			}
		}
		return cantidadDeCamasDisponibles;
	}

	public String listarCamasDisponibles() {
		String listaDeCamasDisponibles="";
		for(int i=0;i<camasDisponibles.length;i++) {
			if(camasDisponibles[i]!=0) {
				listaDeCamasDisponibles+= "\n" + camasDisponibles[i];
			}
		}
		return listaDeCamasDisponibles;
	}

}
