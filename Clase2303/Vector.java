package Clase2303;

public class Vector {
    private int x, y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public Vector sumar(Vector v){
        return new Vector(this.x + v.x, this.y + v.y);
    }

    public Vector restar(Vector v){
        return new Vector(this.x-v.x,this.y-v.y);
    }

    public Vector multiplicar(Vector v){
        return new Vector(this.x*v.x,this.y*v.y);
    }

    public static void main(String[] args){
        Vector v1 = new Vector(4,6);
        Vector v2 = new Vector(2,3);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v1.sumar(v2));
        System.out.println(v1.restar(v2));
        System.out.println(v1.multiplicar(v2));

    }
}

