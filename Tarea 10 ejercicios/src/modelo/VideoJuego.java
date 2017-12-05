package modelo;

public class VideoJuego {
	protected String NombreJuego;
	protected String Empresa;
	protected String Direccion;
	protected String A�oFundacion;
	protected int A�o;
	protected String Caracteristica;
	public VideoJuego() {
		super();
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	public VideoJuego(String nombreJuego, String empresa, String direccion, String a�oFundacion, int a�o,
			String caracteristica) {
		super();
		NombreJuego = nombreJuego;
		Empresa = empresa;
		Direccion = direccion;
		A�oFundacion = a�oFundacion;
		A�o = a�o;
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
	public String getA�oFundacion() {
		return A�oFundacion;
	}
	public void setA�oFundacion(String a�oFundacion) {
		A�oFundacion = a�oFundacion;
	}
	public int getA�o() {
		return A�o;
	}
	public void setA�o(int a�o) {
		A�o = a�o;
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
				+ ", A�oFundacion=" + A�oFundacion + ", A�o=" + A�o + ", Caracteristica=" + Caracteristica + "]";
	}
	
}
