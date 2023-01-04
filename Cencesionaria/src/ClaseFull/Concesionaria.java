package ClaseFull;

public class Concesionaria {
	
	private String nombre;
	private Auto flota[];
	private final int CANTIDAD_MAXIMA = 100;
	//Siempre que tenemos composicion es muy probable que en el contructor tengamos la instanciacion
	
	public Concesionaria() {
	}

	public boolean guardarAuto(Auto nuevo) {
	for(int i=0;i<flota.length;i++) {
		flota=null;
		flota[i]=nuevo;
		return true;
	}return false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
