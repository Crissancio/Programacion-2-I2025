package Clase0604.univ;

public class Persona {
    private long ci;
    private String nombre, apellido;
    private int edad;

    public Persona(long ci, String nombre, String apellido, int edad){
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    

    public void saludo(){
        System.out.println("Hola soy "+this.nombre+" " + this.apellido + " y tengo " + this.edad + " años.");
    }

    public long getCi(){
        return this.ci;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public int getEdad(){
        return this.edad;
    }
}
