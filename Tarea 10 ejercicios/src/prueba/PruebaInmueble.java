package prueba;
import modelo.Inmueble;
public class PruebaInmueble {
	public static void main(String[] args) {
		Inmueble inm1=new Inmueble(30,12,"Jr.Huanuco 1423",2);
		Inmueble inm2=new Inmueble(45,9,"Jr.Ucayali 778",3);
		System.out.println("\t\t------Inmueble 1------");
		System.out.println("Area techada: "+inm1.getAreaTechada()+" metros cuadrados");
		System.out.println("Area sin techar: "+inm1.getAreaSinTeclar()+" metros cuadrados");
		System.out.println("Direccion: "+inm1.getDireccion());
		System.out.println("Numero de baños: "+inm1.getNroBaños());
		System.out.println("\t\t------Inmueble 2------");
		System.out.println("Area techada: "+inm2.getAreaTechada()+" metros cuadrados");
		System.out.println("Area sin techar: "+inm2.getAreaSinTeclar()+" metros cuadrados");
		System.out.println("Direccion: "+inm2.getDireccion());
		System.out.println("Numero de baños: "+inm2.getNroBaños());
		
		
		
		
		
	}

}
