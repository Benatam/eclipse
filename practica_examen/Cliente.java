package practica_examen;

public class Cliente {
	
	private String DNI;
	private String nombre;
	private String direccion;

	public Cliente() {
	DNI="";
	nombre="";
	direccion="";
	}

	public Cliente(String dNI, String nombre, String direccion) {
		DNI = dNI;
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
