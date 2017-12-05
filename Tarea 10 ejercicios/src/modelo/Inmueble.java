package modelo;
public class Inmueble {
	protected float AreaTechada;
	protected float AreaSinTeclar;
	protected String Direccion;
	protected int NroBaños;
	public Inmueble() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Inmueble(float areaTechada, float areaSinTeclar, String direccion, int nroBaños) {
		super();
		AreaTechada = areaTechada;
		AreaSinTeclar = areaSinTeclar;
		Direccion = direccion;
		NroBaños = nroBaños;
	}
	public float getAreaTechada() {
		return AreaTechada;
	}
	public void setAreaTechada(float areaTechada) {
		AreaTechada = areaTechada;
	}
	public float getAreaSinTeclar() {
		return AreaSinTeclar;
	}
	public void setAreaSinTeclar(float areaSinTeclar) {
		AreaSinTeclar = areaSinTeclar;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getNroBaños() {
		return NroBaños;
	}
	public void setNroBaños(int nroBaños) {
		NroBaños = nroBaños;
	}
	@Override
	public String toString() {
		return "Inmueble [AreaTechada=" + AreaTechada + ", AreaSinTeclar=" + AreaSinTeclar + ", Direccion=" + Direccion
				+ ", NroBaños=" + NroBaños + "]";
	}
	
}
