package prueba;
import modelo.Pasaje;
public class PruebaPasaje {
	public static void main(String[] args) {
		Pasaje pas1=new Pasaje("Lima","Ica","14/09/2017 - 11:15:00","15/09/2017 - 06:15:00",12,"Enrique Espinoza","10025698");
		Pasaje pas2=new Pasaje("Lima","Ica","17/09/2017 - 09:15:00","18/09/2017 - 12:05:00",23,"Maria Gomez","47658521");
		System.out.println("\t\t --------Pasaje 1---------");
		System.out.println("Ciudad de origen: "+pas1.getCiudadOrigen());
		System.out.println("Ciudad de destino: "+pas1.getCiudadDestino());
		System.out.println("Fecha y hora de partida: "+pas1.getFechaHoraPartida());
		System.out.println("Fecha y hora de llegada: "+pas1.getFechaHoraLlegada());
		System.out.println("Numero de asiento: "+pas1.getNroAsiento());
		System.out.println("Nombre del pasajero 1: "+pas1.getNombrePasajero());
		System.out.println("Dni del pasajero: "+pas1.getDniPasajero());
		System.out.println("\t\t --------Pasaje 2---------");
		System.out.println("Ciudad de origen: "+pas2.getCiudadOrigen());
		System.out.println("Ciudad de destino: "+pas2.getCiudadDestino());
		System.out.println("Fecha y hora de partida: "+pas2.getFechaHoraPartida());
		System.out.println("Fecha y hora de llegada: "+pas2.getFechaHoraLlegada());
		System.out.println("Numero de asiento: "+pas2.getNroAsiento());
		System.out.println("Nombre del pasajero 2: "+pas2.getNombrePasajero());
		System.out.println("Dni del pasajero: "+pas2.getDniPasajero());
		
	}

}
