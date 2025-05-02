package Clase0604.univ;

public class Estudiante extends Persona {
    private long ru;
    private int semestre;

    public Estudiante(int ci, String nombre, String apellido, int edad, long ru, int semestre) {
        super(ci, nombre, apellido, edad);
        this.ru = ru;
        this.semestre = semestre;

    }
    // Hola soy {nombre} {apellido}, tengo {edad} y voy en {semestre} semeste
    public void saludo() {
        System.out.println("Hola soy " + this.getNombre() + " " + this.getApellido() + ", tengo " + this.getEdad() + " y voy en " + this.semestre + " semestre.");
    }

}
