package modelo;
public class Curso {
	protected String NombreCurso;
	protected String NombreProfesor;
	protected String DiaHora;
	protected float PromedioFinal;
	public Curso() {
		super();
		// TODO Apéndice de constructor generado automáticamente
	}
	public Curso(String nombreCurso, String nombreProfesor, String diaHora, float promedioFinal) {
		super();
		NombreCurso = nombreCurso;
		NombreProfesor = nombreProfesor;
		DiaHora = diaHora;
		PromedioFinal = promedioFinal;
	}
	public String getNombreCurso() {
		return NombreCurso;
	}
	public void setNombreCurso(String nombreCurso) {
		NombreCurso = nombreCurso;
	}
	public String getNombreProfesor() {
		return NombreProfesor;
	}
	public void setNombreProfesor(String nombreProfesor) {
		NombreProfesor = nombreProfesor;
	}
	public String getDiaHora() {
		return DiaHora;
	}
	public void setDiaHora(String diaHora) {
		DiaHora = diaHora;
	}
	public float getPromedioFinal() {
		return PromedioFinal;
	}
	public void setPromedioFinal(float promedioFinal) {
		PromedioFinal = promedioFinal;
	}
	@Override
	public String toString() {
		return "Curso [NombreCurso=" + NombreCurso + ", NombreProfesor=" + NombreProfesor + ", DiaHora=" + DiaHora
				+ ", PromedioFinal=" + PromedioFinal + "]";
	}
	
}
