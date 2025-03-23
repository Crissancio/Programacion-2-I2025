package Clase2103.a;

import java.util.Scanner;

public class Calculadora {
    
    public float sumar(float a, float b){
        return a+b;
    }

    public float restar(float a, float b){
        return a-b;
    }

    public float multiplicar(float a, float b){
        return a*b;
    }

    public float dividir(float a, float b){
        return a/b;
    }

    public float promedio(float a, float b, float c){
        return (a+b+c)/3;
    }

    public float[] raices(float a, float b, float c){
        float raices[] = new float[2];
        float d = (b*b)-(4*a*c);
        if(d > 0 && a != 0){
            raices[0] = (-b + (float)Math.sqrt(d))/(2*a);
            raices[1] = (-b - (float)Math.sqrt(d))/(2*a);
        }

        return raices;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        float a, b;
        Scanner sc = new Scanner(System.in);
        a = Float.parseFloat(sc.nextLine());
        b = Float.parseFloat(sc.nextLine());
        System.out.println("Suma: "+c.sumar(a, b));
        System.out.println("Resta: "+c.restar(a, b));
        System.out.println("Multiplicación: "+c.multiplicar(5, 3));
        System.out.println("División: "+c.dividir(5, 3));

        System.out.println("Promedio: "+c.promedio(5, 3, 7));

        float raices[] = c.raices(1, 5, 6);
        System.out.println("Raíces: "+raices[0]+" y "+raices[1]);
    }
}
