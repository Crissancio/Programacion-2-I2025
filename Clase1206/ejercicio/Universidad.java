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
}
