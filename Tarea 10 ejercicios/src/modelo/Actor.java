package modelo;
public class Actor {
	protected String Nombres;
	protected String Nacionalidad;
	protected String Identificacion;
	public Actor() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Actor(String nombres, String nacionalidad, String identificacion) {
		super();
		Identificacion = identificacion;
		Nombres = nombres;
		Nacionalidad = nacionalidad;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getNacionalidad() {
		return Nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	public String getIdentificacion() {
		return Identificacion;
	}
	public void setIdentificacion(String identificacion) {
		Identificacion = identificacion;
	}
	
	@Override
	public String toString() {
		return "Actor [Identificacion=" + Identificacion + ", Nombres=" + Nombres + ", Nacionalidad=" + Nacionalidad
				+ "]";
	}
}
