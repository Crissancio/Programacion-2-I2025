package Clase1104.banco;

public class Persona {
    private int ci, edad;
    private String nombre, apellido;

    public Persona(int ci, int edad, String nombre, String apellido) {
        this.ci = ci;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getCi(){
        return this.ci;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public boolean esMayorEdad(){
        return this.edad >= 18;
    }
}
