package Clase1403.Herencia;

public class Espada {
    protected float daño = 10;
    protected int duracion = 30;

    public Espada() {
        System.out.println("Espada creada");
    }

    public void atacar(){
        System.out.println("Atacando con espada");
        duracion--;
    }

    public void mostrar(){
        System.out.println("Espada Base");
        System.out.println("Daño: " + daño);
        System.out.println("Duración: " + duracion);
    }

}
