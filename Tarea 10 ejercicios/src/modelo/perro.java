package modelo;
public class perro {
	protected String nombre;
	protected String raza;
	protected int edad;
	protected String due�o;
	public perro() {
		super();
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	public perro(String raza, String nombre, int edad, String due�o) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.due�o = due�o;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDue�o() {
		return due�o;
	}
	public void setDue�o(String due�o) {
		this.due�o = due�o;
	}
	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", due�o=" + due�o + "]";
	}
	
	
}
