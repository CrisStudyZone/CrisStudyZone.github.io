package Practica1;

public class Sistema {

	private String nombreDelSistema;
	private Usuario usuarios[];
	int usuariosBloqueados = 0;
	int sumatoriaEdades = 0;
	int usuarioLogueado=0;

	public Sistema(String nombreDelSistema, int cantidadMaximaDeUsuarios) {
		this.nombreDelSistema = nombreDelSistema;
		usuarios = new Usuario[cantidadMaximaDeUsuarios];;
	}

	public boolean ingresarUsuario(Usuario nuevoUsuario) {
		for (int i = 0; i <= usuarios.length; i++) {
			if (nuevoUsuario != usuarios[i]) {
				usuarios [i]=nuevoUsuario;
				return true;
			}
		}
		return false;
	}

	public boolean loguearUsuario(String usuario, String contrasenia) {
		for (int i = 0; i <= usuarios.length; i++) {
			if (usuarios[i].getUsuario() != usuario || usuarios[i].getContrasenia() != contrasenia) {
				usuarios[i].setBloqueado(true);
				usuariosBloqueados++;
				return false;
			}
		}
		usuarioLogueado++;
		return true;
	}

	public int calcularLaCantidadDeUsuariosLogueados() {
		return usuarioLogueado;
	}

	public int cantidadDeUsuariosBloqueados() {
		return usuariosBloqueados;
	}

	public double calcularEdadPromedio() {
		double promedioEdad = 0;
		for (int i = 0; i <= usuarios.length; i++) {
			sumatoriaEdades += usuarios[i].getEdad();
			promedioEdad = sumatoriaEdades / i;
		}
		return promedioEdad;
	}

	public Usuario buscar(String usuario) {
		int usuarioEncontrado = 0;
		for (int i = 0; i <= usuarios.length; i++) {
			if (usuarios[i].getUsuario() == usuario) {
				usuarioEncontrado = i;
			}
		}
		return usuarios[usuarioEncontrado];
	}

	public double porcentajeDeUsuariosLogueados() {
		double porcentajeDeLogueos = 0;
		int bloqueados = cantidadDeUsuariosBloqueados();
		int logueados = calcularLaCantidadDeUsuariosLogueados();
		porcentajeDeLogueos = (bloqueados + logueados) / 2;
		return porcentajeDeLogueos;
	}

}
