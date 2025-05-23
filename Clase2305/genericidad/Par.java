package Clase2305.genericidad;

public class Par<K, V> {
    private K clave;
    private V valor;

    public Par(K clave, V valor){
        this.clave = clave;
        this.valor = valor;
    }

    public String toString(){
        return "clave: "+clave+" valor: "+valor;
    }

    
}
