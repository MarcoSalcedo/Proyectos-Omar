package prueba;

import modelo.VideoJuego;

public class PruebaVideoJuego {

	public static void main(String[] args) {
		VideoJuego v=new VideoJuego("Grand Fantasia","Aeria Games","Washington CA 124","2010",2017,"MMORPG");
		VideoJuego k=new VideoJuego("HeroesMu","Heroes Networks","Mexico city 201","2003",2017,"MOBA");
		System.out.println("\t\t----------Video Juego 1---------");
		System.out.println("Nombre del juego: "+v.getNombreJuego());
		System.out.println("Empresa Fabricante: "+v.getEmpresa());
		System.out.println("Direccion: "+v.getDireccion());
		System.out.println("A�o de fundacion: "+v.getA�oFundacion());
		System.out.println("A�o: "+v.getA�o());
		System.out.println("Caracteristicas: "+v.getCaracteristica());
		System.out.println("\t\t----------Video Juego 2---------");
		System.out.println("Nombre del juego: "+k.getNombreJuego());
		System.out.println("Empresa Fabricante: "+k.getEmpresa());
		System.out.println("Direccion: "+k.getDireccion());
		System.out.println("A�o de fundacion: "+k.getA�oFundacion());
		System.out.println("A�o: "+k.getA�o());
		System.out.println("Caracteristicas: "+k.getCaracteristica());
	}

}
