package Practica1;

public class Usuario {

	private String usuario;
	private String contrasenia;
	private String nombre;
	private String apellido;
	private int edad;
	private boolean logueado;
	private int conteoLogeados=0;
	private boolean bloqueado;

	private String tempContrasenias[] = new String[5];
	
	public Usuario (String usuario, String contrasenia, String nombre, String apellido, int edad) {
		this.usuario=usuario;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		if(laContraseniaEsValida(contrasenia)==true) {
			logueado=true;
			conteoLogeados++;
		}
		
	}

	public boolean laContraseniaEsValida(String contrasenia) {
		this.contrasenia = contrasenia;
		int contadorCaracteres = 0;
		int contadorNumeros = 0;
		int contadorMayusculas = 0;
		int contadorMinusculas = 0;
		int contadorEspeciales = 0;
		final int MINIMO_DE_CARACTERES = 8;
		final int MINIMO_DE_CARACTERES_ESPECIALES = 1;
		char c;
		for (int i = 0; i < contrasenia.length(); i++) {
			c = contrasenia.charAt(i);
			if (Character.isUpperCase(c)) {
				contadorMayusculas++;
				contadorCaracteres++;
			}
			if (Character.isLowerCase(c)) {
				contadorMinusculas++;
				contadorCaracteres++;
			}
			if (Character.isDigit(c)) {
				contadorNumeros++;
				contadorCaracteres++;
			}
			if (c >= 33 && c <= 46 || c == 64) {
				contadorEspeciales++;
				contadorCaracteres++;
			}
			if ((contadorCaracteres <= MINIMO_DE_CARACTERES) && (contadorEspeciales <= MINIMO_DE_CARACTERES_ESPECIALES)
					&& (contadorMayusculas <= MINIMO_DE_CARACTERES_ESPECIALES)
					&& (contadorMinusculas <= MINIMO_DE_CARACTERES_ESPECIALES)
					&& (contadorNumeros <= MINIMO_DE_CARACTERES_ESPECIALES)) {
				return false;
			}
		}
		for (int i = 0; i <= tempContrasenias.length; i++) {
			tempContrasenias[i] = null;
			tempContrasenias[i] = contrasenia;
			break;
		}
		setContrasenia(contrasenia);
		return true;
	}

	public boolean cambiarContrasenia(String nuevaContrasenia) {
		if (laContraseniaEsValida(nuevaContrasenia) == true) {
			for (int i = 0; i <= tempContrasenias.length; i++) {
				if (tempContrasenias[i].equals(nuevaContrasenia)) {
					return false;
				}
			}
		}
		return true;
	}
	public int calcularLaCantidadDeUsuariosLogueados() {
		return conteoLogeados;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public int getEdad() {
		return edad;
	}

	

}
