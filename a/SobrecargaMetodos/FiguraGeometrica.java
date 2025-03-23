package a.SobrecargaMetodos;

public class FiguraGeometrica {
    // Devuelve el área de un Rectángulo según su base y altura
    public double area(double base_r, double altura_r){
        return base * altura;
    }

    //Devuelve el área de un triangulo según su base y altura
    public double area(double base_t, double altura_t){
        return base * altura / 2;
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
        System.out.println("Área del círculo: " + figura.area(3));
        System.out.println("Área del rectángulo: " + figura.area(5, 10));
        System.out.println("Área del trapecio: " + figura.area(5, 10, 8));
    }
}


