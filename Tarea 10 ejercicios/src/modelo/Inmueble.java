package modelo;
public class Inmueble {
	protected float AreaTechada;
	protected float AreaSinTeclar;
	protected String Direccion;
	protected int NroBa�os;
	public Inmueble() {
		super();
		// TODO Ap�ndice de constructor generado autom�ticamente
	}
	public Inmueble(float areaTechada, float areaSinTeclar, String direccion, int nroBa�os) {
		super();
		AreaTechada = areaTechada;
		AreaSinTeclar = areaSinTeclar;
		Direccion = direccion;
		NroBa�os = nroBa�os;
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
	public int getNroBa�os() {
		return NroBa�os;
	}
	public void setNroBa�os(int nroBa�os) {
		NroBa�os = nroBa�os;
	}
	@Override
	public String toString() {
		return "Inmueble [AreaTechada=" + AreaTechada + ", AreaSinTeclar=" + AreaSinTeclar + ", Direccion=" + Direccion
				+ ", NroBa�os=" + NroBa�os + "]";
	}
	
}
