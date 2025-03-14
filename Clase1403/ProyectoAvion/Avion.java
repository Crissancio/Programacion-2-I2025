package Clase1403.ProyectoAvion;

public class Avion {
    private int cantidadPasajeros;
    private float cantidadCombustible;
    private int horaSalida;

    public Avion(){
        this.cantidadPasajeros = 0;
        this.cantidadCombustible = 1000000;
        this.horaSalida = 72;
    }

    public void cargaDePasajeros(int c){
        this.cantidadPasajeros = this.cantidadPasajeros + c;
    }

    public boolean verificarCombustibleViaje(float kilometrosViaje){
        float combustibleNecesario =  kilometrosViaje*12;
        if(this.cantidadCombustible >= combustibleNecesario){
            return true;
        }else{
            return false;
        }
    }

    public void retrasoDeVuelo(){
        this.horaSalida = this.horaSalida + 3;
    }

    public void mostrar(){
        System.out.println("Cantidad de Pasajeros: " + this.cantidadPasajeros);
        System.out.println("Cantidad de Combustible: " + this.cantidadCombustible);
        System.out.println("Hora de Salida: " + this.horaSalida);
    }


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