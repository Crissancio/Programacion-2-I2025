package Clase0606.persistencia;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Farmacia {

    private String rutaMed = "F:/program/aux_121/Programacion-2-I2025/Clase0606/medicamentosJava/";
    private String rutaPer = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaJava/";

    private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private String nombre;

    public Farmacia(String nombre) {
        this.nombre = nombre;
    }

    public void cargarMedicamentos() throws IOException{
        File carpeta = new File(rutaMed);
        File[] archivos = carpeta.listFiles();
        if(archivos != null) {
            for(File archivo: archivos){
                if(archivo.isFile()){
                    medicamentos.add(new Medicamento(archivo.getAbsolutePath()));
                }
            }
        }else{
            System.out.println("Capeta sin archivos/Carpeta Vacia");
        }
            
    }

    public void cargarPersonas() throws IOException{
        File carpeta = new File(rutaPer);
        File[] archivos = carpeta.listFiles();

        if(archivos != null){
            for(File archivo: archivos){
                if(archivo.isFile()){
                    personas.add(new Persona(archivo.getAbsolutePath()));
                }
            }
        }
        else{
            System.out.println("Capeta sin archivos/Carpeta Vacia");
        }
    }

    public void agregarPersona(Persona p) throws IOException{
        this.personas.add(p);
        p.guardar();
    }

    public void agregarMedicamento(Medicamento m) throws IOException{
        this.medicamentos.add(m);
        m.guardar();
    }

    public void mostrarMedicamentos() {
        for (Medicamento m : medicamentos) {
            System.out.println(m);
        }
    }

    public void mostrarPersonas() {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    // vender a la primera persona un medicamento de nombre X en cantidad Y
    // Cliente: JOSE TOTAL: 56.99
    public void venderMedicamento(String nombre, int cantidad) throws IOException{
        Persona pe = this.personas.get(0);
        this.personas.remove(0);
        pe.eliminar();

        for(int i = 0; i < this.medicamentos.size(); i++){
            Medicamento med = medicamentos.get(i);
            if(med.getNombre().equals(nombre)){
                double total = med.getPrecio()*cantidad;
                int newStock = med.getStock()-cantidad;
                med.setStock(newStock);
                System.out.println("CLIENTE: "+pe.getNom()+"\nTOTAL: "+total);
                med.actualizar();
                break;
            }
        }
        
    }


}
