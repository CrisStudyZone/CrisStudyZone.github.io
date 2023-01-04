import java.util.Arrays;

public class Locomotora {
	
	private int idLocomotora;
	private String nombre;
	private int cantidadMaximaDeVagones;
	private Vagon [] formacion;
	
	
	
	public Locomotora(int idLocomotora, String nombre, int cantidadMaximaDeVagones) {
		
		this.idLocomotora = idLocomotora;
		this.nombre = nombre;
		Vagon[] formacion = new Vagon [cantidadMaximaDeVagones];
		
	}

	public boolean agregarVagon(Vagon vagon) {
		for(int i=0; i<formacion.length;i++) {
			if(formacion[i]==null) {
				formacion[i]=vagon;
				return true;
			}
		}
		return false;
	}
	
	public Vagon obtenerVagonDeMenorPeso(){
		Vagon tempMenorpeso=null;
		for(int i =0; i<formacion.length; i++) {
			for(int j = 0; j<formacion.length-1; j++) {
				if(formacion[j]!=null && formacion[j+1]!= null && formacion[j].getPesoMaximosSoportado()< formacion[j+1].getPesoMaximosSoportado()) {
					tempMenorpeso=formacion[j];
					formacion[j]=formacion[j+1];
					formacion[j+1]= tempMenorpeso;
				}return tempMenorpeso;
			}
		}return null;
	}
	
	public double obtenerPesoPromedioDeVagonesParaLaMarca(MarcaVagon marca) {
		double sumatoria =0;
		double promedio=0;
		int contadorDeVagonesDeLaMismaMarca=0;
		for(int i=0;i<formacion.length;i++) {
			if(formacion[i]!=null && formacion[i].getMarca().equals(marca)) {
				sumatoria+=formacion[i].getPesoMaximosSoportado();
				contadorDeVagonesDeLaMismaMarca++;
			}
		}promedio=sumatoria/contadorDeVagonesDeLaMismaMarca;
		return promedio;
	}
	
	public int getIdLocomotora() {
		return idLocomotora;
	}
	public void setIdLocomotora(int idLocomotora) {
		this.idLocomotora = idLocomotora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidadMaximaDeVagones() {
		return cantidadMaximaDeVagones;
	}
	public void setCantidadMaximaDeVagones(int cantidadMaximaDeVagones) {
		this.cantidadMaximaDeVagones = cantidadMaximaDeVagones;
	}
	public Vagon[] getFormacion() {
		return formacion;
	}
	public void setFormacion(Vagon[] formacion) {
		this.formacion = formacion;
	}
	
	public String toString() {
		return "Locomotora [idLocomotora=" + idLocomotora + ", nombre=" + nombre + ", cantidadMaximaDeVagones="
				+ cantidadMaximaDeVagones + ", formacion=" + Arrays.toString(formacion) + "]";
	}
	
	
	
	

}
