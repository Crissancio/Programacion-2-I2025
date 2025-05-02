package Clase0205.computadora;

public class Main{
    public static void main(String[] args) {
        
        CPU cpu = new CPU(2.5F, 4, 2.4F, "LGA");
        RAM ram = new RAM(16, 2, 4);
        Memoria almacenamiento = new Memoria(512, 
        "Kingtone", "SSD");
        TarjetaMadre tarjetaMadre = new TarjetaMadre(8, "LGA", 5, 4, 128);
        FuenteDePoder fuenteDePoder = new FuenteDePoder("Corsair", 550, "80 Plus");

        PC computadora = new PC(cpu, ram, almacenamiento, tarjetaMadre, fuenteDePoder);
        computadora.mostrar();


    }
}