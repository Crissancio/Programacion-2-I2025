package Clase0205.computadora;

public class FuenteDePoder {
    public String marca;
    public float potencia;
    public String certificacion;

    public FuenteDePoder(String marca, float potencia, String certificacion) {
        this.marca = marca;
        this.potencia = potencia;
        this.certificacion = certificacion;
    }

    public void mostrar() {
        System.out.println("----------INFO FUENTE DE PODER----------");
        System.out.println("Marca: " + marca);
        System.out.println("Potencia: " + potencia);
        System.out.println("Certificacion: " + certificacion);
        System.out.println("----------------------------------------");
    }
}
