package Clase2303;

public class Calculadora {
    
    public double sumar(double a, double b){
        return a + b;
    }
    public double restar(double a, double b){
        return a - b;
    }
    public double multiplicar(double a, double b){
        return a * b;
    }
    public double dividir(double a, double b){
        if(b == 0){
            System.out.println("No se puede dividir entre 0");
            return -1;
        }else{
            return a / b;
        }
    }

    public double promedio(double a, double b, double c){
        return (a+b+c)/3;
    }

    public double[] raices(double a, double b, double c){
        double dis = b*b - 4 *a*c;
        if(dis<0){
            System.out.println("No hay raices reales");
            return null;
        }else if(dis == 0){
            double[] raices = new double[1];
            raices[0] = -b/2*a;
            return raices;
        }else{
            double[] raices = new double[2];
            raices[0] = (-b + Math.sqrt(dis))/2*a;
            raices[1] = (-b - Math.sqrt(dis))/2*a;
            return raices;
        }
    }
}
