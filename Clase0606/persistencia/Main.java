package Clase0606.persistencia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static String rutaBase = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaJava/";
    public static void main(String[] args) throws IOException {
        /*
        Persona p1 = new Persona(1, "Juan", 25);
        Persona p2 = new Persona(2, "Ana", 30);
        Persona p3 = new Persona(3, "Luis", 22);
        Persona p4 = new Persona(4, "Maria", 28);
        Persona p5 = new Persona(5, "Carlos", 35);

        p1.guardar();
        p2.guardar();
        p3.guardar();
        p4.guardar();
        p5.guardar();
        */
        ArrayList<Persona> datos = new ArrayList<>();
        cargarDatos(datos);
        for (Persona p : datos) {
            System.out.println(p);
        }
        
    }

    public static void cargarDatos(ArrayList<Persona> datos) throws IOException{
        File carpeta = new File(rutaBase);
        File[] archivos = carpeta.listFiles();

        if(archivos!=null){
            for (File archivo : archivos) {
                if(archivo.isFile()){
                    datos.add(new Persona(archivo.getAbsolutePath()));
                }
            }
        } else {
            System.out.println("No se encontraron archivos en la carpeta: " + rutaBase);
        }
    }
}
