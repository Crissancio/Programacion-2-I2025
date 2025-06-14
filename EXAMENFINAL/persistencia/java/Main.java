package EXAMENFINAL.persistencia.java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Fraternidad> lista = new ArrayList<>();

        Fraternidad f1 = new Fraternidad("Los Andinos", "Caporales", 2);
        f1.agregarDanzarin(new Danzarin("Juan", "M", 21, 5), 0);
        f1.agregarDanzarin(new Danzarin("Ana", "F", 19, 3), 1);
        f1.agregarDanzarin(new Danzarin("Pedro", "M", 23, 6), 2);
        f1.agregarDanzarin(new Danzarin("Lucia", "F", 18, 2), 3);
        f1.agregarDanzarin(new Danzarin("Carlos", "M", 25, 8), 4);
        f1.setNroDanzarines(4);
        lista.add(f1);

        Fraternidad f2 = new Fraternidad("Urus", "Morenada", 2);
        f2.agregarDanzarin(new Danzarin("Luis", "M", 22, 7), 0);
        f2.agregarDanzarin(new Danzarin("Carla", "F", 20, 4), 1);
        f2.agregarDanzarin(new Danzarin("Miguel", "M", 24, 9), 2);
        f2.agregarDanzarin(new Danzarin("Sofia", "F", 17, 1), 3);
        f2.agregarDanzarin(new Danzarin("Andres", "M", 26, 10), 4);
        f2.setNroDanzarines(4);
        lista.add(f2);

        ArchivoFraternidad archivoW = new ArchivoFraternidad("fraternidades.txt");
        archivoW.guardarFraternidades(lista);

        System.out.println("Datos guardados.");

        ArchivoFraternidad archivo = new ArchivoFraternidad("fraternidades.txt");

        ArrayList<Fraternidad> fraternidad = archivo.leerFraternidades();
        System.out.println("Fraternidad leída del archivo:");
        System.out.println(fraternidad);

        for (Fraternidad f : fraternidad) {
            if(f.geNombre().equalsIgnoreCase("Urus")) {
                double promedio = f.promedioEdadGenero("F");
                System.out.println("Promedio de edad de danzarines del género F: " + promedio); 
            }
        }
        

        for (Fraternidad f : fraternidad) {
            if(f.geNombre().equalsIgnoreCase("Los Andinos")) {
                f.mostrarDanzarinesConMasParticipaciones();
            }
        }
    }
}
