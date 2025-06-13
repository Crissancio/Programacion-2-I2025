package Clase1206.ejercicio;

public class Main {
    public static void main(String[] args) {
        String nom = "jose";
        int edad = 20;
        String format = String.format("%s tiene %d", nom, edad);
        System.out.println("\n\n\n\n\n"+format+"\n\n\n\n\n");

        Docente d1 = new Docente("Jose", "Zeballos", 11111, 2000, 10);
        Docente d2 = new Docente("Jhonny", "Felipez", 2222, 2300, 12);
        Docente d3 = new Docente("Tatiana", "Delgadillo", 3333, 1900, 5);
        Docente d4 = new Docente("Marcos", "Gonzales", 4444, 2500, 15);
        Docente d5 = new Docente("Ana", "Lopez", 5555, 1800, 3);


        Almacen<Materia> me1 = new Almacen<Materia>(5);
        me1.agregar(new Materia("MAT101", "Matematica I", 80, 90, d1));
        me1.agregar(new Materia("FIS102", "Fisica I", 85, 95, d2));
        me1.agregar(new Materia("QUI103", "Quimica I", 75, 85, d3));
        
        Almacen<Materia> me2 = new Almacen<Materia>(5);
        me2.agregar(new Materia("BIO201", "Biologia I", 88, 92, d4));
        me2.agregar(new Materia("HIS202", "Historia I", 82, 78, d5));
        me2.agregar(new Materia("QUI103", "Quimica I", 75, 85, d3));

        Almacen<Materia> me3 = new Almacen<Materia>(5);
        me3.agregar(new Materia("FIS102", "Fisica I", 55, 45, d2));
        me3.agregar(new Materia("QUI103", "Quimica I", 75, 85, d3));
        me3.agregar(new Materia("MAT101", "Matematica I", 65, 90, d1));

        Almacen<Materia> me4 = new Almacen<Materia>(5);
        me4.agregar(new Materia("MAT101", "Matematica I", 80, 90, d1));
        me4.agregar(new Materia("FIS102", "Fisica I", 85, 95, d2));
        me4.agregar(new Materia("BIO201", "Biologia I", 88, 92, d4));

        Almacen<Materia> me5 = new Almacen<Materia>(5);
        me5.agregar(new Materia("HIS202", "Historia I", 82, 78, d5));
        me5.agregar(new Materia("BIO201", "Biologia I", 88, 92, d4));
        me5.agregar(new Materia("FIS102", "Fisica I", 35, 45, d2));

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

        System.out.println("-------PROMEDIO GENERAL DE ESTUDIANTES-------");
        u.mostrarPromedioGeneral();

        System.out.println("-------ESTUDIANTES CON DOCENTE DOCENTE X-------");
        u.mostrarEstudiantesConDocenteX("Jose", "Zeballos");
    }
}
