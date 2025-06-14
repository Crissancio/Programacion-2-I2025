package EXAMENFINAL.persistencia.java;

import java.util.ArrayList;

public class MainCreacion {
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

        ArchivoFraternidad archivo = new ArchivoFraternidad("fraternidades.txt");
        archivo.guardarFraternidades(lista);

        System.out.println("Datos guardados.");

        ArrayList<Fraternidad> leidas = archivo.leerFraternidades();
        System.out.println("Fraternidades leídas desde archivo:");
        for (Fraternidad f : leidas) {
            System.out.println(f);
        }
    }
}
