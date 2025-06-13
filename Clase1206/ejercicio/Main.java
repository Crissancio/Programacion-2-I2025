package Clase1206.ejercicio;

public class Main {
    public static void main(String[] args) {
        Docente d1 = new Docente("Jose", "Zeballos", 11111, 2000, 10);
        Docente d2 = new Docente("Jhonny", "Felipez", 2222, 2300, 12);
        Docente d3 = new Docente("Tatiana", "Delgadillo", 3333, 1900, 5);
        Docente d4 = new Docente("Marcos", "Gonzales", 4444, 2500, 15);
        Docente d5 = new Docente("Ana", "Lopez", 5555, 1800, 3);

        Materia m1 = new Materia("INF-132", "BASE DE DATOS", 45, 100, d1);
        Materia m2 = new Materia("INF-133", "PROGRAMACION", 50, 90, d2);
        Materia m3 = new Materia("INF-134", "SISTEMAS OPERATIVOS", 60, 80, d3);
        Materia m4 = new Materia("INF-135", "REDES", 70, 85, d4);
        Materia m5 = new Materia("INF-136", "ALGORITMOS", 55, 95, d5);
        Materia m6 = new Materia("INF-137", "ESTRUCTURAS DE DATOS", 65, 75, d3);

        Almacen<Materia> me1 = new Almacen<Materia>(5);
        me1.agregar(m1);
        me1.agregar(m2);
        me1.agregar(m4);
        
        Almacen<Materia> me2 = new Almacen<Materia>(5);
        me2.agregar(m3);
        me2.agregar(m5);
        me2.agregar(m1);

        Almacen<Materia> me3 = new Almacen<Materia>(5);
        me3.agregar(m2);
        me3.agregar(m5);
        me3.agregar(m6);

        Almacen<Materia> me4 = new Almacen<Materia>(5);
        me4.agregar(m1);
        me4.agregar(m3);
        me4.agregar(m5);

        Almacen<Materia> me5 = new Almacen<Materia>(5);
        me5.agregar(m2);
        me5.agregar(m1);
        me5.agregar(m6);

        Estudiante e1 = new Estudiante("Juan", "Perez", 123456, 1001, me1);
        Estudiante e2 = new Estudiante("Maria", "Gomez", 654321, 1002, me2);
        Estudiante e3 = new Estudiante("Carlos", "Lopez", 789012, 1003, me3);
        Estudiante e4 = new Estudiante("Ana", "Martinez", 345678, 1004, me4);
        Estudiante e5 = new Estudiante("Luis", "Fernandez", 901234, 1005, me5);

        Almacen<Estudiante> estudiantes = new Almacen<Estudiante>(5);
        estudiantes.agregar(e1);
        estudiantes.agregar(e2);
        estudiantes.agregar(e3);
        estudiantes.agregar(e4);
        estudiantes.agregar(e5);

        Universidad u = new Universidad("HARVARD", estudiantes);

        System.out.println(u);
    }
}
