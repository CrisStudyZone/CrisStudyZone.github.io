package ar.edu.unlam.tp2;

import java.util.Date;

public class Paciente {
	
	private String nombre;
	private String apellido;
	private Localidad localidad;
	private long DNI;
	private int edad;
	private long telefono;
	private Date fechaDeIngreso;
	private Date fechaDeAlta;
	private int numeroDeCamaAsignado=500;

	

	public Paciente() {
		fechaDeIngreso=new Date();
	}
	
	public Date getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(Date fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long dNI) {
		DNI = dNI;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public int getNumeroDeCamaAsignado() {
		return numeroDeCamaAsignado;
	}
	
	public void setNumeroDeCamaAsignado(int numeroDeCama) {
		this.numeroDeCamaAsignado=numeroDeCama;
	}
	public String toString () {
		return "Nombre y Apellido:\n" + this.nombre + " " + this.apellido + "\nDNI: "  + this.DNI + "\nFecha de ingreso " + this.fechaDeIngreso + "Cama asignada: " + this.numeroDeCamaAsignado;
	}
	


}
