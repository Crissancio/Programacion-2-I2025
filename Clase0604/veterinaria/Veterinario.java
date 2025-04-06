package Clase0604.veterinaria;

public class Veterinario extends Persona{
    private float sueldo;
    private int horaEntrada, horaSalida;

    public Veterinario(String apellido, String nombre, int ci, float sueldo, int horaEntrada, int horaSalida) {
        super(apellido, nombre, ci);
        this.sueldo = sueldo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }
    
}
