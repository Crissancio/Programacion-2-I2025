package Clase1206.ejercicio;

public abstract class Persona {
    protected String nom, ape;
    protected int ci;
    
    public Persona(String nom, String ape, int ci) {
        this.nom = nom;
        this.ape = ape;
        this.ci = ci;
    }

    abstract public String toString();
    
    public String getNom() {
        return nom;
    }

    public String getApe() {
        return ape;
    }
}
