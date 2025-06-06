package Clase0606.persistencia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Medicamento {
    private String rutaBase = "F:/program/aux_121/Programacion-2-I2025/Clase0606/medicamentosJava/";

    private int id;
    private String nombre;
    private String tipo;
    private double precio;
    private int stock;

    private String archivo;

    public Medicamento(int id, String nombre, String tipo, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.stock = stock;

        this.archivo = rutaBase + "medicamento"+ this.id + ".txt";
    }

    public Medicamento(String rutaArchivo) throws IOException{
        this.archivo = rutaArchivo;
        File archivo = new File(rutaArchivo);

        if(! archivo.exists()){
            throw new FileNotFoundException("El archivo no existe: persona" +this.id+".txt" );
        }else{
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            this.id = Integer.parseInt(br.readLine());
            this.nombre = br.readLine();
            this.tipo = br.readLine();
            this.precio = Double.parseDouble(br.readLine());
            this.stock = Integer.parseInt(br.readLine());

            br.close();
        }
    }

    public void guardar() throws IOException{
        File carpeta = new File(rutaBase);

        if (!carpeta.exists()) {
            carpeta.mkdirs(); // Crea la carpeta si no existe
        }

        File archivo = new File(this.archivo);
        if(!archivo.exists()) {
            archivo.createNewFile(); // Crea el archivo si no existe
        }

        BufferedWriter bw = new BufferedWriter(new FileWriter(this.archivo));

        bw.write(this.id + "\n");
        bw.write(this.nombre + "\n");
        bw.write(this.tipo + "\n");
        bw.write(this.precio + "\n");
        bw.write(this.stock + "\n");

        bw.close();

    }

    public void actualizar() throws IOException{
        eliminar();
        guardar();
    }

    public void eliminar(){
        File f = new File(this.archivo);
        if (f.exists()) f.delete();
    }

    public String toString() {
        return "Medicamento{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }

    public void setStock(int stock){
        this.stock = stock;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getStock(){
        return this.stock;
    }
    public double getPrecio(){
        return this.precio;
    }
}
