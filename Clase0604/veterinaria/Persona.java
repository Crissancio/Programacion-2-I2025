package Clase0604.veterinaria;

public class Persona{
    private String apellido, nombre;
    private int ci;

    public Persona(String apellido, String nombre, int ci) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.ci = ci;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCi() {
        return ci;
    }
}