package Clase1403.Herencia;

public class EspadaFuego extends Espada{
    private String efecto;

    EspadaFuego(){
        super();
        efecto = "Fuego";
        this.daño = 15;
        this.duracion = 50;
    }

    public void atacar(){
        System.out.println("Atacando con espada de fuego");
        duracion= duracion - 2;
    }

    public void mostrar(){
        System.out.println("Espada de Fuego");
        System.out.println("Efecto: " + efecto);
        System.out.println("Daño: " + daño);
        System.out.println("Duración: " + duracion);
    }
}
