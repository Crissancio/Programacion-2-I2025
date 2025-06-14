package EXAMENFINAL.generesidad.java;

public class VectorPares<C, V> {
    public Pares<C, V>[] pares;
    private int n;
    private int top;

    public VectorPares(int n) {
        this.n = n;
        this.top = 0;
        this.pares = new Pares[n];
    }
    public void agregar(Pares<C, V> par) {
        pares[top] = par;
        top++;
    }

    public void mostrar() {
        for (int i = 0; i < n; i++) {
            System.out.println(pares[i]);
            if(pares[i] == null) {
                break; 
            }
        }
    }

    public boolean existe(Pares<C, V> par) {
        for (int i = 0; i < n; i++) {
            if(pares[i] == null) {
                break;
            }
            if (pares[i].equals(par)) {
                return true;
            }
        }
        return false;
    }
}
