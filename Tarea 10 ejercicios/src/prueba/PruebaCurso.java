package prueba;

import modelo.Curso;

public class PruebaCurso {

	public static void main(String[] args) {
		Curso cur1=new Curso("Logica de programacion","Raul Salazar","Miercoles - 08:00",15);
		Curso cur2=new Curso("Ingles Tecnico","Rosalin Chavez","Jueves - 08:00",19);
		Curso cur3=new Curso("PHP","Diaz","Martes - 11:30",14);
		System.out.println("\t\t --------Curso 1---------");
		System.out.println("Nombre del curso: "+cur1.getNombreCurso());
		System.out.println("Nombre del profesor: "+cur1.getNombreProfesor());
		System.out.println("Dia y hora de clase: "+cur1.getDiaHora());
		System.out.println("Promedio final: "+cur1.getPromedioFinal());
		System.out.println("\t\t --------Curso 2---------");
		System.out.println("Nombre del curso: "+cur2.getNombreCurso());
		System.out.println("Nombre del profesor: "+cur2.getNombreProfesor());
		System.out.println("Dia y hora de clase: "+cur2.getDiaHora());
		System.out.println("Promedio final: "+cur2.getPromedioFinal());
		System.out.println("\t\t --------Curso 3---------");
		System.out.println("Nombre del curso: "+cur3.getNombreCurso());
		System.out.println("Nombre del profesor: "+cur3.getNombreProfesor());
		System.out.println("Dia y hora de clase: "+cur3.getDiaHora());
		System.out.println("Promedio final: "+cur3.getPromedioFinal());
	
	}

}
