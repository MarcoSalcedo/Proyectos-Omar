package modelo;

public class Fotografo {
	protected String Nombres;
	protected String Dni;
	protected String FechaNacimiento;
	protected String PaginaWeb;
	public Fotografo() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Fotografo(String nombres, String dni, String fechaNacimiento, String paginaWeb) {
		super();
		Nombres = nombres;
		Dni = dni;
		FechaNacimiento = fechaNacimiento;
		PaginaWeb = paginaWeb;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dni) {
		Dni = dni;
	}
	public String getFechaNacimiento() {
		return FechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		FechaNacimiento = fechaNacimiento;
	}
	public String getPaginaWeb() {
		return PaginaWeb;
	}
	public void setPaginaWeb(String paginaWeb) {
		PaginaWeb = paginaWeb;
	}
	@Override
	public String toString() {
		return "Fotografo [Nombres=" + Nombres + ", Dni=" + Dni + ", FechaNacimiento=" + FechaNacimiento
				+ ", PaginaWeb=" + PaginaWeb + "]";
	}
	
}
