package Clase1206.ejercicio;

public class Universidad {
    private String nombre;
    private Almacen<Estudiante> estudiantes;

    public Universidad(String nombre, Almacen<Estudiante> estudiantes) {
        this.nombre = nombre;
        this.estudiantes = estudiantes;
    }

    public String toString() {
        System.out.println("Lista de estudiantes en la universidad " + nombre + ":\n");
        estudiantes.mostrar();
        return "";
    }

    public void mostrarPromedioGeneral(){
        Almacen<Estudiante> aux = new Almacen<>(20);
        float total = 0;
        int c = 0;
        while(!estudiantes.esVacia()){
            Estudiante e = estudiantes.eliminar();
            total += e.promedio();
            c++;
            aux.agregar(e);
        }

        while(!aux.esVacia()){
            Estudiante e = aux.eliminar();
            estudiantes.agregar(e);
        }

        System.out.println("Promedio general de estudiantes: " + (total / c));
    }

    public void mostrarEstudiantesConDocenteX(String nombre, String apellido){
        Almacen<Estudiante> aux = new Almacen<>(30);

        while(!estudiantes.esVacia()){
            Estudiante e = estudiantes.eliminar();
            if(e.tieneAlDocenteX(nombre, apellido)){
                e.mostrarEstudiante();
            }
            aux.agregar(e);
        }

        while (!aux.esVacia()) {
            Estudiante e = aux.eliminar();
            estudiantes.agregar(e);
        }
    }
}
