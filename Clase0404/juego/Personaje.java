package Clase0404.juego;

public class Personaje{
    protected int nivel, velocida;
    protected String habilidad, genero, nombre;
    protected float daño, vida;

    public Personaje(int nivel, int velocida, String habilidad, String genero, String nombre, float daño, float vida){
        this.nivel = nivel;
        this.velocida = velocida;
        this.habilidad = habilidad;
        this.genero = genero;
        this.nombre = nombre;
        this.daño = daño;
        this.vida = vida;
    }

    protected void atacar(){
        System.out.println("Atacando con " + this.habilidad);
    }
    protected void curar(){
        System.out.println("Curando con " + this.habilidad);
    }
    protected void aumentarNivel(){
        this.nivel = this.nivel + 1;
        System.out.println("Nivel aumentado a " + this.nivel);
    }
    protected void mover(String mover){
        System.out.println("Moviendo " + mover);
    }

}