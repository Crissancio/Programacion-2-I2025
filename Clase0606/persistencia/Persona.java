package Clase0606.persistencia;
import java.io.*;

public class Persona {
    int id;
    String nom;
    int edad;
    String archivo;

    public Persona(int id, String nom, int edad) {
        this.id = id;
        this.nom = nom;
        this.edad = edad;
        this.archivo = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaJava/persona" + id + ".txt";
    }

    public Persona(int id) throws IOException {
        this.archivo = "F:/program/aux_121/Programacion-2-I2025/Clase0606/personaJava/persona" + id + ".txt";
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        this.id = Integer.parseInt(br.readLine());
        this.nom = br.readLine();
        this.edad = Integer.parseInt(br.readLine());
        
        br.close();
    }

    public void guardar() throws IOException {
        File dir = new File("F:program/aux_121/Programacion-2-I2025/Clase0606/personaJava");
        if (!dir.exists()) dir.mkdirs();
        


        BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
        bw.write(id + "\n");
        bw.write(nom + "\n");
        bw.write(edad + "\n");
        bw.close();
    }

    public void actualizar(String nuevoNom, int nuevaEdad) throws IOException {
        this.nom = nuevoNom;
        this.edad = nuevaEdad;
        guardar();
    }

    
    public void eliminar() {
        File f = new File(archivo);
        if (f.exists()) f.delete();
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nom + ", Edad: " + edad;
    }

    public static void main(String[] args) throws IOException {
       // Persona p = new Persona(1, "Juan", 20);
        //p.guardar();

        Persona p = new Persona(1);

        //p.actualizar("Jose Mario", 65);

        p.eliminar();
    }
}
