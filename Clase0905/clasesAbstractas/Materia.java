package clasesAbstractas;

public class Materia {
    private String sigla, descripcion;
    private Docente docente;
    private Estudiante estudiantes[];

    public Materia(String sigla, String descripcion, Docente docente) {
        this.sigla = sigla;
        this.descripcion = descripcion;
        this.docente = docente;
        this.estudiantes = new Estudiante[30];
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

}
