package EXAMENFINAL.persistencia.java;

public class Danzarin extends Persona {
    private int nroParticipaciones;

    public Danzarin(String nom, String genero, int edad, int nroParticipaciones) {
        super(nom, genero, edad);
        this.nroParticipaciones = nroParticipaciones;
    }

    public String toString() {
        return nom + "," + genero + "," + edad + "," + nroParticipaciones;
    }
    public int getNroParticipaciones() {
        return nroParticipaciones;
    }
}