package Clase1104.banco;

public class PilaCB {
    private int tope, max;
    private CuentaBancaria[] v;

    public PilaCB(int max){
        this.max = max;
        this.tope = 0;
        this.v = new CuentaBancaria[max+1];
    }

    public boolean esVacia(){
        return this.tope == 0;
    }

    public boolean esLlena(){
        return this.tope == this.max;
    }

    public void adicionar(CuentaBancaria cb){
        if(esLlena()){
            System.out.println("Pila llena, no se puede adicionar");
        }else{
            this.tope++;
            this.v[this.tope] = cb;
        }
    }

    public CuentaBancaria eliminar(){
        CuentaBancaria cb = null;

        if(esVacia()){
            System.out.println("Pila vacia, no se puede eliminar");
        }else{
            cb = this.v[this.tope];
            this.tope--;
        }

        return cb;
    }
}
