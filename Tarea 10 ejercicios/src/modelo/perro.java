package modelo;
public class perro {
	protected String nombre;
	protected String raza;
	protected int edad;
	protected String dueño;
	public perro() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public perro(String raza, String nombre, int edad, String dueño) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.edad = edad;
		this.dueño = dueño;
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
	public String getDueño() {
		return dueño;
	}
	public void setDueño(String dueño) {
		this.dueño = dueño;
	}
	/* (sin Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", dueño=" + dueño + "]";
	}
	
	
}
