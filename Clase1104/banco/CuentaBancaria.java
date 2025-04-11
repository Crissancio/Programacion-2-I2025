package Clase1104.banco;

public class CuentaBancaria {
    private String idCuenta;
    private float saldo;

    public CuentaBancaria(int ci, String nombre, String apellido){
        this.idCuenta = ""+ ci + nombre.charAt(0) + apellido.charAt(0);
        this.saldo = 0;
    }
     
    public float retirar(float monto){
        if(this.saldo >= monto){
            this.saldo -= monto;
            return monto;
        }else{
            return 0;
        }
    }

    public void depositar(float monto){
        this.saldo += monto;
    }

    public String getIdCuenta(){
        return this.idCuenta;
    }

    public float getSaldo(){
        return this.saldo;
    }

    public void mostrar(){
        System.out.println("ID Cuenta: " + this.idCuenta + " Saldo: " + this.saldo);
    }
}
