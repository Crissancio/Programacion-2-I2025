package Clase0205.computadora;

public class Memoria {
    public double capacidad;
    public String marca;
    public String tipo;

    public Memoria(double capacidad, String marca, String tipo) {
        this.capacidad = capacidad;
        this.marca = marca;
        this.tipo = tipo;
    }
    public void mostrar() {
        System.out.println("----------INFO MEMORIA----------");
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Marca: " + marca);
        System.out.println("Tipo: " + tipo);
        System.out.println("-------------------------------");
    }
}
