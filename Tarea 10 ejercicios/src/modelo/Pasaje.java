package modelo;
public class Pasaje {
	protected String CiudadOrigen;
	protected String CiudadDestino;
	protected String FechaHoraPartida;
	protected String FechaHoraLlegada;
	protected int NroAsiento;
	protected String NombrePasajero;
	protected String DniPasajero;
	public Pasaje() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Pasaje(String ciudadOrigen, String ciudadDestino, String fechaHoraPartida, String fechaHoraLlegada,
			int nroAsiento, String nombrePasajero, String dniPasajero) {
		super();
		CiudadOrigen = ciudadOrigen;
		CiudadDestino = ciudadDestino;
		FechaHoraPartida = fechaHoraPartida;
		FechaHoraLlegada = fechaHoraLlegada;
		NroAsiento = nroAsiento;
		NombrePasajero = nombrePasajero;
		DniPasajero = dniPasajero;
	}
	public String getCiudadOrigen() {
		return CiudadOrigen;
	}
	public void setCiudadOrigen(String ciudadOrigen) {
		CiudadOrigen = ciudadOrigen;
	}
	public String getCiudadDestino() {
		return CiudadDestino;
	}
	public void setCiudadDestino(String ciudadDestino) {
		CiudadDestino = ciudadDestino;
	}
	public String getFechaHoraPartida() {
		return FechaHoraPartida;
	}
	public void setFechaHoraPartida(String fechaHoraPartida) {
		FechaHoraPartida = fechaHoraPartida;
	}
	public String getFechaHoraLlegada() {
		return FechaHoraLlegada;
	}
	public void setFechaHoraLlegada(String fechaHoraLlegada) {
		FechaHoraLlegada = fechaHoraLlegada;
	}
	public int getNroAsiento() {
		return NroAsiento;
	}
	public void setNroAsiento(int nroAsiento) {
		NroAsiento = nroAsiento;
	}
	public String getNombrePasajero() {
		return NombrePasajero;
	}
	public void setNombrePasajero(String nombrePasajero) {
		NombrePasajero = nombrePasajero;
	}
	public String getDniPasajero() {
		return DniPasajero;
	}
	public void setDniPasajero(String dniPasajero) {
		DniPasajero = dniPasajero;
	}
	@Override
	public String toString() {
		return "Pasaje [CiudadOrigen=" + CiudadOrigen + ", CiudadDestino=" + CiudadDestino + ", FechaHoraPartida="
				+ FechaHoraPartida + ", FechaHoraLlegada=" + FechaHoraLlegada + ", NroAsiento=" + NroAsiento
				+ ", NombrePasajero=" + NombrePasajero + ", DniPasajero=" + DniPasajero + "]";
	}
	
	
	
}
