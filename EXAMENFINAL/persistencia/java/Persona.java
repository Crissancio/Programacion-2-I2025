package EXAMENFINAL.persistencia.java;
import java.io.Serializable;

public class Persona implements Serializable {
    protected String nom;
    protected String genero;
    protected int edad;

    public Persona(String nom, String genero, int edad) {
        this.nom = nom;
        this.genero = genero;
        this.edad = edad;
    }
}