package a.encapsulamiento;

public class CajaAhorros {
    public String nombre;
    protected int nroCuenta;
    private double saldo;
    public static void main(String[] args) {
        CajaAhorros caja = new CajaAhorros("Juan Perez", 123456, 1000);
        
        System.out.println("\t----ACCESO AL ATRIBUTO Protegidos---");
        System.out.println("Saldo: " + caja.saldo);
        caja.saldo = 100000;
        System.out.println("\t---ACCESO A LOS METODOS Protegidos---");
        caja.transferencia(300);
        System.out.println("Saldo: " + caja.saldo);
    }

    
    public CajaAhorros(String nombre, int nroCuenta, double saldo) {
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nro. Cuenta: " + nroCuenta);
        System.out.println("Saldo: " + saldo);
    }
    protected double getSaldo(){
        return this.saldo;
    }

    private void transferencia(double monto) {
        this.saldo += monto;
    }

    
    
}