package Clase0203;

public class MainPila {
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila pila = new Pila(20);
        pila.push(5);
        pila.push(3.2F);
        pila.push(2.10F);
        pila.push(4.3F);
        pila.push(7F);
        
        //Pila aux = new Pila(20);
        
        System.out.println("primera");
        mostrarPila(pila);
        
        pila.push(9);
        
        System.out.println("segunda");
        mostrarPila(pila);
        System.out.println("tercera");
        mostrarPila(pila);
    }
    
    public static void mostrarPila(Pila pila){
        Pila aux = new Pila(30);
        
        while(! pila.isEmpty()){
            float dato = pila.pop();
            System.out.println(dato);
            aux.push(dato);
        }
        
        while(! aux.isEmpty()){
            float dato = aux.pop();
            pila.push(dato);
        }
    }
}
