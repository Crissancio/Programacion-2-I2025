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
        return "Estudiante: " + this.nom + " " + this.ape + ", CI: " + this.ci + ", RU: " + this.ru + ", Materias Cursadas:\n";
    }

    public float promedio(){
        float total = 0;
        int c = 0;

        Almacen<Materia> aux = new Almacen<>(10);
        while(!materiasCursa.esVacia()){
            Materia m = materiasCursa.eliminar();
            c++;
            total += m.notaTotal();
            aux.agregar(m);
        }
        while(!aux.esVacia()){
            Materia m = aux.eliminar();
            materiasCursa.agregar(m);
        }
        return total / c;
    }

    public boolean tieneAlDocenteX(String nombre, String apellido){
        boolean tiene = false;

        Almacen<Materia> aux = new Almacen<>(10);
        while (! materiasCursa.esVacia()) {
            Materia m = materiasCursa.eliminar();
            if(m.tieneDoncente(nombre, apellido)){
                tiene = true;
            }
            aux.agregar(m);
        }

        while (!aux.esVacia()) {
            Materia m = aux.eliminar();
            materiasCursa.agregar(m);
        }

        return tiene;
    }

    public void mostrarEstudiante() {
        System.out.println(this.nom+" "+this.ape+" - CI: "+this.ci+" - RU: "+this.ru);
    }

}
