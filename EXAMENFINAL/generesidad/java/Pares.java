package EXAMENFINAL.generesidad.java;

public class Pares <C, V> {
    private C valor1;
    private V valor2;

    public Pares(C valor1, V valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public C getValor1() {
        return valor1;
    }
    public void setValor1(C valor1) {
        this.valor1 = valor1;
    }
    public V getValor2() {
        return valor2;
    }
    public void setValor2(V valor2) {
        this.valor2 = valor2;
    }

    public String toString() {
        return "Pares{" +
                "valor1=" + valor1 +
                ", valor2=" + valor2 +
                '}';
    }

    public boolean equals(Pares<C, V> otro){
        if(this.valor1.equals(otro.valor1) && this.valor2.equals(otro.valor2)){
            return true;
        } else {
            return false;
        }
    }
}
