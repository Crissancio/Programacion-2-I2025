package Clase0604.univ;

public class Docente extends Persona{
    private int años_trabajo;
    private String[] materias;

    public Docente(long ci, String nombre, String apellido, int edad, int años_trabajo, String[] materias){
        super(ci, nombre, apellido, edad);
        this.años_trabajo = años_trabajo;
        this.materias = materias;
    }

    public void saludo(){
        System.out.println("Hola soy "+this.getNombre()+" " + this.getApellido() + " y tengo " + this.getEdad() + " años. Trabajo desde hace " + this.años_trabajo );
    }
}
