package modelo;

public class Entrada {
	protected String NombreObra;
	protected String NombreDirector;
	protected String FechaInicio;
	protected String FechaFin;
	protected int NroActores;
	protected int NroActrices;
	public Entrada() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Entrada(String nombreObra, String nombreDirector, String fechaInicio, String fechaFin, int nroActores,
			int nroActrices) {
		super();
		NombreObra = nombreObra;
		NombreDirector = nombreDirector;
		FechaInicio = fechaInicio;
		FechaFin = fechaFin;
		NroActores = nroActores;
		NroActrices = nroActrices;
	}
	public String getNombreObra() {
		return NombreObra;
	}
	public void setNombreObra(String nombreObra) {
		NombreObra = nombreObra;
	}
	public String getNombreDirector() {
		return NombreDirector;
	}
	public void setNombreDirector(String nombreDirector) {
		NombreDirector = nombreDirector;
	}
	public String getFechaInicio() {
		return FechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		FechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return FechaFin;
	}
	public void setFechaFin(String fechaFin) {
		FechaFin = fechaFin;
	}
	public int getNroActores() {
		return NroActores;
	}
	public void setNroActores(int nroActores) {
		NroActores = nroActores;
	}
	public int getNroActrices() {
		return NroActrices;
	}
	public void setNroActrices(int nroActrices) {
		NroActrices = nroActrices;
	}
	@Override
	public String toString() {
		return "Entrada [NombreObra=" + NombreObra + ", NombreDirector=" + NombreDirector + ", FechaInicio="
				+ FechaInicio + ", FechaFin=" + FechaFin + ", NroActores=" + NroActores + ", NroActrices=" + NroActrices
				+ "]";
	}
	
	
}
