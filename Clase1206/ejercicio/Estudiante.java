package Clase1206.ejercicio;


public class Estudiante extends Persona {
    private int ru;
    private Almacen<Materia> materiasCursa;

    public Estudiante(String nom, String ape, int ci, int ru, Almacen<Materia> materias){
        super(nom, ape, ci);
        this.ru = ru;
        this.materiasCursa = materias;
    }

    public String toString(){
        materiasCursa.mostrar();
        return "Estudiante: " + nom + " " + ape + ", CI: " + ci + ", RU: " + ru + ", Materias Cursadas:\n";
    }

}
