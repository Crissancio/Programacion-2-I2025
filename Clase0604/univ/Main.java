package Clase0604.univ;

public class Main {
    
    public static void main(String[] args) {

        String[] materias = {"Matematica", "Fisica", "Quimica"};
        Docente d1 = new Docente(23123,"Raul","Flores",45,10, materias);

        // d1.saludo();

        Estudiante e1 = new Estudiante(35165, "Elmer", "Gutierrez", 18, 1212121, 2);

        e1.saludo();
    }
}
