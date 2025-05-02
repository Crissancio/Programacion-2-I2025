package Clase0205.computadora;

public class PC {
    public CPU cpu;
    public RAM ram;
    public Memoria almacenamiento;
    public TarjetaMadre tarjetaMadre;
    public FuenteDePoder fuente;

    public PC(CPU cpu, RAM ram, Memoria almacenamiento, TarjetaMadre tarjetaMadre, FuenteDePoder fuente) {
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaMadre = tarjetaMadre;
        this.fuente = fuente;
    }

    public void mostrar() {
        System.out.println("----------INFO PC----------");
        cpu.mostrar();
        ram.mostrar();
        almacenamiento.mostrar();
        tarjetaMadre.mostrar();
        fuente.mostrar();
        System.out.println("----------------------------");
    }

}
