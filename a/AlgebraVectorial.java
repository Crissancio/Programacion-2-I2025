class Vector2D {
    protected double x, y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double dotProduct(Vector2D b) {
        return this.x * b.x + this.y * b.y;
    }

    public double crossProduct(Vector2D b) {
        return this.x * b.y - this.y * b.x;
    }

    public Vector2D projectionOn(Vector2D b) {
        double factor = this.dotProduct(b) / Math.pow(b.magnitude(), 2);
        return new Vector2D(b.x * factor, b.y * factor);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Vector3D extends Vector2D {
    private double z;

    public Vector3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double dotProduct(Vector3D b) {
        return super.dotProduct(b) + this.z * b.z;
    }

    public Vector3D crossProduct(Vector3D b) {
        return new Vector3D(
            this.y * b.z - this.z * b.y,
            this.z * b.x - this.x * b.z,
            this.x * b.y - this.y * b.x
        );
    }

    public Vector3D projectionOn(Vector3D b) {
        double factor = this.dotProduct(b) / Math.pow(b.magnitude(), 2);
        return new Vector3D(b.x * factor, b.y * factor, b.z * factor);
    }

    public double magnitude() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}

public class AlgebraVectorial {

    
    public static void main(String[] args) {
        // Caso de prueba en 3D
        Vector3D a3D = new Vector3D(1, 2, 3);
        Vector3D b3D = new Vector3D(-2, 1, 0);
        System.out.println("Producto escalar 3D: " + a3D.dotProduct(b3D));
        System.out.println("Producto vectorial 3D: " + a3D.crossProduct(b3D));
        System.out.println("Proyección de a sobre b (3D): " + a3D.projectionOn(b3D));

        // Caso de prueba en 2D
        Vector2D a2D = new Vector2D(2, 5);
        Vector2D b2D = new Vector2D(4, 10);
        System.out.println("Producto escalar 2D: " + a2D.dotProduct(b2D));
        System.out.println("Producto cruzado 2D: " + a2D.crossProduct(b2D));
        System.out.println("Proyección de a sobre b (2D): " + a2D.projectionOn(b2D));
    }
}
