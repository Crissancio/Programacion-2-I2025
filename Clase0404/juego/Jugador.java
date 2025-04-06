package Clase0404.juego;

public class Jugador extends Personaje{
    private String nameTag, rango;
    private String[] armamento;

    public Jugador( int nivel, int velocida, String habilidad, String genero, String nombre, float daño, float vida, String nameTag, String rango, String[] armamento){
        super(nivel, velocida, habilidad, genero, nombre, daño, vida);
        this.nameTag = nameTag;
        this.rango = rango;
        this.armamento = armamento;

    }
    
    public void atacar(int i){
        System.out.println("atcando con " + this.armamento[i]);
        System.out.println("Se ha hecho " + this.daño + " de daño");    
    }
    
}
