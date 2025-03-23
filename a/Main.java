package a;

import a.encapsulamiento.CajaAhorros;

public class Main {
    public static void main(String[] args) {
        CajaAhorros caja = new CajaAhorros("Juan Perez", 123456, 1000);
        
        System.out.println("\t----ACCESO AL ATRIBUTO Protegidos---");
        System.out.println("Nombre: " + caja.saldo);
        caja.saldo = 100000000;
        System.out.println("\t---ACCESO A LOS METODOS Protegidos---");
        caja.transferencia(300);
    }
}
