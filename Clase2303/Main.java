package Clase2303;

public class Main {
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sumar(5,3));
        System.out.println(calculadora.restar(6,8));
        System.out.println(calculadora.multiplicar(4,7));
        System.out.println(calculadora.dividir(9,3));
        System.out.println(calculadora.promedio(5,6,7));

        double[] raices = calculadora.raices(1, 5, 6);
        if(raices != null){
            for(double raiz: raices){
                System.out.println(raiz);
            }
        }
    }
}
