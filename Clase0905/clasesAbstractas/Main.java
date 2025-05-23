package clasesAbstractas;


public class Main{
    public static void main(String[] args){
        //Persona p = new Persona("Juan", 25);

        Materia m1 = new Materia("INF-121", "Programacion II", new Docente(4500F, 5));

        m1.agregarEstudiante(new Estudiante("Alan", 21, 4154242, 2, 1));
        m1.agregarEstudiante(new Estudiante("EidaN", 18, 4159082, 71, 51));
        m1.agregarEstudiante(new Estudiante("Gabriel", 20, 8323289, 77, 67));
        m1.agregarEstudiante(new Estudiante("Crisver", 22, 7894242, 82, 91));
        m1.agregarEstudiante(new Estudiante("Jorge", 19, 4154242, 31, 21));

        m1.mostrarReprobados();

    }
}
