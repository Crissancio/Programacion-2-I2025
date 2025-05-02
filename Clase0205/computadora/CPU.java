package Clase0205.computadora;

public class CPU {
    public float cache;
    public int hilos;
    public float frecuencia;
    public String socket;
    
    public CPU(float cache, int hilos, float frecuencia, String socket) {
        this.cache = cache;
        this.hilos = hilos;
        this.frecuencia = frecuencia;
        this.socket = socket;
    }

    public void mostrar(){
        System.out.println("----------INFO CPU----------");
        System.out.println("Cache: " + cache);
        System.out.println("Hilos: " + hilos);
        System.out.println("Frecuencia: " + frecuencia);
        System.out.println("Socket: " + socket);
        System.out.println("----------------------------");
    }
}
