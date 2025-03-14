package Clase1403.Herencia;

 public class EspadaHielo extends Espada{
    private String efecto;

    EspadaHielo(){
        super();
        efecto = "Hielo";
        this.daño = 25;
    }

    public void atacar(){
        System.out.println("Atacando con espada de hielo");
        duracion= duracion - 3;
    }

    public void mostrar(){
        System.out.println("Espada de Hielo");
        System.out.println("Efecto: " + efecto);
        System.out.println("Daño: " + daño);
        System.out.println("Duración: " + duracion);
    }
    
}
