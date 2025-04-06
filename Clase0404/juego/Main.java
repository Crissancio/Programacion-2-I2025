package Clase0404.juego;

public class Main {
    

    public static void main(String[] args) {
        // Crear un objeto de la clase Personaje

        String [] armamento = {"Espada", "Gancho", "Arco"};

        Jugador jugador1 = new Jugador(1, 10, 
        "Salto Alto", "Masculino", "Connor Kanwey", 30F, 50F, "CrickoSaurio", "Asesino Novato", armamento );

        jugador1.atacar(1);
    }
}
