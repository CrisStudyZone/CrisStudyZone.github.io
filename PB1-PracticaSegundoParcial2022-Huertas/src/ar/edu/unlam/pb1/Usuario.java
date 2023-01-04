package ar.edu.unlam.pb1;

public class Usuario {
	private String nombre;
	private int DNI;
	private String usuario;
	private String contrasenia;
	
//	public Usuario (String nombre, int DNI, String usuario, String contrasenia) {
//		this.nombre=nombre;
//		this.DNI=DNI;
//		this.
//		
//	}

	public String getNombre() {
		return nombre;
	}

	public int getDNI() {
		return DNI;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}