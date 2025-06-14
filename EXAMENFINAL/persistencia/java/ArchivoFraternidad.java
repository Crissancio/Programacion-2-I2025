package EXAMENFINAL.persistencia.java;

import java.io.*;
import java.util.ArrayList;

public class ArchivoFraternidad {
    private String nombre;

    public ArchivoFraternidad(String nombre) {
        this.nombre = nombre;
    }

    public void guardarFraternidades(ArrayList<Fraternidad> lista) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            for (Fraternidad f : lista) {
                bw.write("---\n");  // Separador entre fraternidades
                bw.write(f.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Fraternidad> leerFraternidades() {
        ArrayList<Fraternidad> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombre))) {
            String linea;
            Fraternidad fraternidad = null;
            int index = 0;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.equals("---")) {
                    // Nuevo grupo
                    if (fraternidad != null) {
                        lista.add(fraternidad);
                    }
                    fraternidad = null;
                    index = 0;
                } else if (linea.startsWith("Fraternidad:")) {
                    String[] partes = linea.split(" - ");
                    String nombreF = partes[0].replace("Fraternidad: ", "").trim();
                    String danza = partes[1].replace("Danza: ", "").trim();
                    fraternidad = new Fraternidad(nombreF, danza, 0);
                } else if (linea.startsWith("-")) {
                    String[] datos = linea.substring(2).split(",");
                    String nom = datos[0];
                    String genero = datos[1];
                    int edad = Integer.parseInt(datos[2]);
                    int nroParticipaciones = Integer.parseInt(datos[3]);

                    Danzarin d = new Danzarin(nom, genero, edad, nroParticipaciones);
                    fraternidad.agregarDanzarin(d, index++);
                    fraternidad.setNroDanzarines(index);
                }
            }
            if (fraternidad != null) {
                lista.add(fraternidad);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
