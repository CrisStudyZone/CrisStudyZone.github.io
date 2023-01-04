
public class Vagon {
	
	private String idVagon;
	private String descripcion;
	private MarcaVagon marca;
	private double pesoMaximosSoportado;
	private double pesoDeCarga;
	
	
	public String getIdVagon() {
		return idVagon;
	}
	public void setIdVagon(String idVagon) {
		this.idVagon = idVagon;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public MarcaVagon getMarca() {
		return marca;
	}
	public void setMarca(MarcaVagon marca) {
		this.marca = marca;
	}
	public double getPesoMaximosSoportado() {
		return pesoMaximosSoportado;
	}
	public void setPesoMaximosSoportado(double pesoMaximosSoportado) {
		this.pesoMaximosSoportado = pesoMaximosSoportado;
	}
	public double getPesoDeCarga() {
		return pesoDeCarga;
	}
	public void setPesoDeCarga(double pesoDeCarga) {
		this.pesoDeCarga = pesoDeCarga;
	}
	
	public String toString() {
		return "Vagon [idVagon=" + idVagon + ", descripcion=" + descripcion + ", marca=" + marca
				+ ", pesoMaximosSoportado=" + pesoMaximosSoportado + ", pesoDeCarga=" + pesoDeCarga + "]";
	}
	
	public static boolean validarIdentificadorDeVagon(){
		//hacer
		return false;
	}

}


