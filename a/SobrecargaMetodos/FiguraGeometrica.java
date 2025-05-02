package a.SobrecargaMetodos;

public class FiguraGeometrica {
    // Devuelve el área de un Rectángulo según su base y altura
    public double area(double base_r, double altura_r){
        return base_r * altura_r;
    }

    //Devuelve el área de un triangulo según su base y altura
    public double area(float base_t, float altura_t){
        return base_t * altura_t / 2;
    }

    // Devuelve el área de un Trapecio según sus bases y altura
    public double area(double base_mayor, double base_menor, double altura){
        return (base_mayor + base_menor) * altura / 2;
    }

    // Devuelve el área de un Circulo según su radio
    public double area(double radio){
        return Math.PI * radio*radio;
    }
    public static void main(String[] args) {
        FiguraGeometrica figura = new FiguraGeometrica();
        System.out.println("Área del rectángulo: " + figura.area(5D, 10D));
        System.out.println("Área del triángulo: " +  figura.area(5F, 10F));
    }
}


