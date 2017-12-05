package prueba;
import modelo.Entrada;
public class PruebaEntrada {
	public static void main(String[] args) {
		Entrada obra1=new Entrada("El mago de Oz","Óscar Olmeda","14 de setiembre","23 de octubre",12,7);
		Entrada obra2=new Entrada("Guardianes rojos estelares","Victoria Ruso","2 de enero","4 de abril",20,12);
		System.out.println("\t\t----------Obra 1---------");
		System.out.println("Nombre de la obra: "+obra1.getNombreObra());
		System.out.println("Nombre del Director: "+obra1.getNombreDirector());
		System.out.println("Fecha de inicio: "+obra1.getFechaInicio());
		System.out.println("Fecha fin: "+obra1.getFechaFin());
		System.out.println("Numero de Actores: "+obra1.getNroActores());
		System.out.println("Numero de Actrices: "+obra1.getNroActrices());
		System.out.println("\t\t----------Obra 2---------");
		System.out.println("Nombre de la obra: "+obra2.getNombreObra());
		System.out.println("Nombre del Director: "+obra2.getNombreDirector());
		System.out.println("Fecha de inicio: "+obra2.getFechaInicio());
		System.out.println("Fecha fin: "+obra2.getFechaFin());
		System.out.println("Numero de Actores: "+obra2.getNroActores());
		System.out.println("Numero de Actrices: "+obra2.getNroActrices());
	}

}
