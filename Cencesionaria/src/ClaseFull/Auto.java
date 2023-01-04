package ClaseFull;

public class Auto {

	private String marca;
	private String modelo;
	private String patente;
	private int anio;
	private int kilometrosActuales;
	private double precioDeVenta;
	private double precioDeCompra;
	
	public Auto () {
	}

	public Auto(String marca, String modelo, String patente, int anio, int kilometrosActuales, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.anio = anio;
		this.kilometrosActuales = kilometrosActuales;
		this.precioDeVenta = precio;
		
	}
	
	public boolean esCeroKilometro() {
		if(this.kilometrosActuales==0) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", anio=" + anio
				+ ", kilometrosActuales=" + kilometrosActuales + ", precioDeVenta=" + precioDeVenta
				+ ", precioDeCompra=" + precioDeCompra + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getPatente() {
		return patente;
	}

	public int getAnio() {
		return anio;
	}

	public int getKilometrosActuales() {
		return kilometrosActuales;
	}

	public double getPrecioDeVenta() {
		return precioDeVenta;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public void setKilometrosActuales(int kilometrosActuales) {
		this.kilometrosActuales = kilometrosActuales;
	}

	public void setPrecioDeVenta(double precio) {
		this.precioDeVenta = precio;
	}
	public double getPrecioDeCompra() {
		return precioDeCompra;
	}

	public void setPrecioDeCompra(double precioDeCompra) {
		this.precioDeCompra = precioDeCompra;
	}

}
