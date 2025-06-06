package Clase0606.persistencia;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static String rutaBase = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaJava/";
    public static void main(String[] args) throws IOException {
        Farmacia farmacia = new Farmacia("Farmacia Central");

        farmacia.cargarPersonas();
        farmacia.cargarMedicamentos();

        System.out.println("------------MEDICAMENTOS------------");
        farmacia.mostrarMedicamentos();
        System.out.println("\n------------PERSONAS---------------");
        farmacia.mostrarPersonas();

        //System.out.println("-------------VENDER MEDICAMENTO----------");
        //farmacia.venderMedicamento("Ibuprofeno", 4);

//        System.out.println("------------MEDICAMENTOS------------");
  //      farmacia.mostrarMedicamentos();
    //    System.out.println("\n------------PERSONAS---------------");
      //  farmacia.mostrarPersonas();
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
