package Clase1206.ejercicio;

public class Docente extends Persona {
    private float sueldo;
    private int antiguedad;

    public Docente(String nom, String ape, int ci, float sueldo, int antiguedad) {
        super(nom, ape, ci);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
    }

    public String toString(){
        return "\nDocente: " + nom +" "+ ape + ", Sueldo: " + sueldo + ", Antiguedad: " + antiguedad;
    }

}
