package Clase0205.computadora;

public class RAM {
    public int capacidad;
    public float frecuencia;
    public int v_ddr;

    public RAM(int capacidad, float frecuencia, int v_ddr) {
        this.capacidad = capacidad;
        this.frecuencia = frecuencia;
        this.v_ddr = v_ddr;
    }

    public void mostrar() {
        System.out.println("----------INFO RAM----------");
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Frecuencia: " + frecuencia);
        System.out.println("DDR: " + v_ddr);
        System.out.println("----------------------------");
    }
}
