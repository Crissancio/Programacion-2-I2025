package Clase1206.ejercicio;

public class Almacen <Tipo> {
    private int n, tope;
    private Object[] vector;

    public Almacen(int n){
        this.tope = 0;
        this.n = n;
        this.vector = new Object[n];
    }

    public boolean esVacia(){
        if (tope == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena(){
        if(tope == n){
            return true;
        }else{
            return false;
        }
    }

    public void agregar(Tipo dato){
        if(!esLlena()){
            vector[tope] = dato;
            tope++;
        }else{
            System.out.println("Almacen lleno, no se puede agregar el dato: " + dato);
        }
    }

    public Tipo eliminar(){
        Tipo dato = null;
        if(!esVacia()){
            tope--;
            dato = (Tipo) vector[tope];
            return dato;
        }
        System.out.println("Almacen vacio, no se puede eliminar un dato");
        return dato;

    }

    public void mostrar(){
        Almacen<Tipo> aux = new Almacen<>(n);
        while(!esVacia()){
            Tipo dato = this.eliminar();
            System.out.println(dato);
            aux.agregar(dato);
        }
        while(!aux.esVacia()){
            Tipo dato = aux.eliminar();
            this.agregar(dato);
        }
    }
}