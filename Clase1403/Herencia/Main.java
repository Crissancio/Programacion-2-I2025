package Clase1403.Herencia;

public class Main {
    public static void main(String[] args) {
        Espada espada = new Espada();
        espada.mostrar();
        System.out.println("----------------------");
        Espada espadaFuego = new EspadaFuego();
        espadaFuego.mostrar();

        System.out.println("----------------------");
        Espada espadaHielo = new EspadaHielo();
        espadaHielo.mostrar();

        System.out.println("--ATAQUE CON ESPADAS--");
        espada.atacar();
        espadaFuego.atacar();
        espadaHielo.atacar();

        espada.mostrar();
        System.out.println("----------------------");
        espadaFuego.mostrar();
        System.out.println("----------------------");
        espadaHielo.mostrar();
    }
    
}
