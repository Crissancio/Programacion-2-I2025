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

    public void agregarEstudiante(Estudiante estudiante){
        int i = 0;
        while(i < estudiantes.length){
            if(estudiantes[i] == null){
                break;
            }
        }
        /*
        for(i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] == null){
                break;
            }
        }
        */
        if(i < estudiantes.length){
            estudiantes[i] = estudiante;
        }else{
            System.out.println("No hay espacio para más estudiantes");
        }
    }

    public void mostrarReprobados(){
        for(int i = 0; i < estudiantes.length; i++){
            if(estudiantes[i] != null){
                if(estudiantes[i].calcularNotaTotal() < 51){
                    System.out.println("Estudiante: "+ estudiantes[i].getNombre()+" Nota: "+ estudiantes[i].calcularNotaTotal()+ "");
                }
            }
        }
    }



}
