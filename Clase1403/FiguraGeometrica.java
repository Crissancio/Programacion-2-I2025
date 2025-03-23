package Clase1403;


public class FiguraGeometrica {
    //void, int, double, String, boolean
    
    public double area(double radio){ // area de un circulo
        return Math.PI * radio*radio;
    }

    public double area(double base, Float altura){ // area de un rectangulo
        return base*altura;
    }

    public float area(float base, float altura){
        return (base*altura)/2;
    }

    public double area(double base, double BASE, double altura){
        return ((base+BASE)*altura)/2;
    }

    public static void main(String[] args) {
        FiguraGeometrica f1 = new FiguraGeometrica();

        System.out.println(f1.area(5,7));
        System.out.println(f1.area(5,7));

        
    }
}