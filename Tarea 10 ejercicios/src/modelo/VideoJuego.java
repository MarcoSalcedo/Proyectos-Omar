package modelo;

public class VideoJuego {
	protected String NombreJuego;
	protected String Empresa;
	protected String Direccion;
	protected String AñoFundacion;
	protected int Año;
	protected String Caracteristica;
	public VideoJuego() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public VideoJuego(String nombreJuego, String empresa, String direccion, String añoFundacion, int año,
			String caracteristica) {
		super();
		NombreJuego = nombreJuego;
		Empresa = empresa;
		Direccion = direccion;
		AñoFundacion = añoFundacion;
		Año = año;
		Caracteristica = caracteristica;
	}
	public String getNombreJuego() {
		return NombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		NombreJuego = nombreJuego;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getAñoFundacion() {
		return AñoFundacion;
	}
	public void setAñoFundacion(String añoFundacion) {
		AñoFundacion = añoFundacion;
	}
	public int getAño() {
		return Año;
	}
	public void setAño(int año) {
		Año = año;
	}
	public String getCaracteristica() {
		return Caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		Caracteristica = caracteristica;
	}
	@Override
	public String toString() {
		return "VideoJuego [NombreJuego=" + NombreJuego + ", Empresa=" + Empresa + ", Direccion=" + Direccion
				+ ", AñoFundacion=" + AñoFundacion + ", Año=" + Año + ", Caracteristica=" + Caracteristica + "]";
	}
	
}
