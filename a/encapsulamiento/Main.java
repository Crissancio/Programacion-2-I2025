package a.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        CajaAhorros caja = new CajaAhorros("Juan Perez", 123456, 1000);
        
        System.out.println("\t----ACCESO AL ATRIBUTO PUBLICOS---");
        System.out.println("Nombre: " + caja.nombre);
        caja.nombre = "Juan Perez Lopez";
        System.out.println("\t---ACCESO A LOS METODOS PUBLICOS---");
        caja.mostrarDatos();
    }
}
