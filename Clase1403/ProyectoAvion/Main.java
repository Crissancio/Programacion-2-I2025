package Clase1403.ProyectoAvion;

public class Main {
    public static void main(String[] args) {
        Avion a = new Avion();

        a.cargaDePasajeros(350);
        a.cargaDePasajeros(20);

        System.out.println("Hay combustible disponible para 34 Km de viaje? "+a.verificarCombustibleViaje(34));

        a.retrasoDeVuelo();
        a.retrasoDeVuelo();

        a.mostrar();
    }
}
