package Clase2305.genericidad;

public class Main{
    public static void main(String[] args){
        /*
        Caja<String> caja1 = new Caja<>("Hola");
        Caja<Integer> caja2 = new Caja<>(123);
        
        System.out.println("Elemento en caja1: " + caja1.getElemento());
        System.out.println("Elemento en caja2: " + caja2.getElemento());*/

        Par<Integer, String> par1 = new Par<>(1, "JOSE");

        System.out.println("Par1: " + par1);

        Par<String, Float> par2 = new Par<>("3ABG", 5.50F);

        System.out.println("Par2: " + par2);
    }
}