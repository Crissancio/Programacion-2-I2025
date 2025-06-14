package EXAMENFINAL.generesidad.java;

public class Main {
    public static void main(String[] args) {
        VectorPares<String, Integer> v1 = new VectorPares<>(50);
        v1.agregar(new Pares<String,Integer>("ENERO", 5));
        v1.agregar(new Pares<String,Integer>("hola", 100));
        v1.agregar(new Pares<String,Integer>("Marzo", 15));
        v1.agregar(new Pares<String,Integer>("Septiembre", 8));
        v1.agregar(new Pares<String,Integer>("Lunes", 4));


        VectorPares<Double, Character> v2 = new VectorPares<>(50);
        v2.agregar(new Pares<Double,Character>(1.5, 'A'));
        v2.agregar(new Pares<Double,Character>(2.5, 'B'));
        v2.agregar(new Pares<Double,Character>(3.5, 'C'));
        v2.agregar(new Pares<Double,Character>(4.5, 'D'));
        v2.agregar(new Pares<Double,Character>(5.5, 'E'));

        System.out.println("---Vector de Pares String-Integer:---");
        v1.mostrar();
        System.out.println("---Vector de Pares Double-Character:---");
        v2.mostrar();

        System.out.println("---Verificando existencia de pares en v1:---");
        if (v1.existe(new Pares<String, Integer>("E", 5))) {
            System.out.println("El par (ENERO, 5) existe en v1.");
        } else {
            System.out.println("El par (ENERO, 5) no existe en v1.");
        }

        System.out.println("---Verificando existencia de pares en v2:---");
        if (v2.existe(new Pares<Double, Character>(3.1, 'C'))) {
            System.out.println("El par (3.5, C) existe en v2.");
        } else {
            System.out.println("El par (3.5, C) no existe en v2.");
        }
    }    
}
