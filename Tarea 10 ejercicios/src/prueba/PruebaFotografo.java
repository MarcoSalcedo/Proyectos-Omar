package prueba;

import modelo.Fotografo;

public class PruebaFotografo {

	public static void main(String[] args) {
		Fotografo ente1=new Fotografo("Carlos Chavez","26547123","12/01/1987","www.photoGrapher.com");
		Fotografo ente2=new Fotografo("Felix Ortega","45982351","02/07/1992","www.graphickPick.com");
		System.out.println("\t\t------------Fotografo 1------------");
		System.out.println("Nombre del fotografo: "+ente1.getNombres());
		System.out.println("Dni: "+ente1.getDni());
		System.out.println("Fecha de Nacimiento: "+ente1.getFechaNacimiento());
		System.out.println("Pagina web: "+ente1.getPaginaWeb());
		System.out.println("\t\t------------Fotografo 2------------");
		System.out.println("Nombre del fotografo: "+ente2.getNombres());
		System.out.println("Dni: "+ente2.getDni());
		System.out.println("Fecha de Nacimiento: "+ente2.getFechaNacimiento());
		System.out.println("Pagina web: "+ente2.getPaginaWeb());
	}

}
