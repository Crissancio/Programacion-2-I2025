public class Producto {
    private String nombre;
    private float precio;

    public Producto(String nombre, float precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void descuento(){
        if(this.precio%2 == 0){
            this.precio = this.precio - (this.precio*0.10F);
        }else{
            this.precio = this.precio - (this.precio*0.15F);
        }
    }

    public float getPrecio(){
        return this.precio;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre+" "+this.precio);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto("Coca-Cola", 10);
        Producto p2 = new Producto("Pepsi", 15);
        Producto p3 = new Producto("Sprite", 20);
        Producto p4 = new Producto("Fanta", 25);

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        p1.descuento();
        p2.descuento();
        p3.descuento();
        p4.descuento();

        p1.mostrar();
        p2.mostrar();
        p3.mostrar();

        float sumaPrecios = p1.getPrecio() + p2.getPrecio()+p3.getPrecio()+p4.getPrecio();
        System.out.println("La suma de los precios es: "+sumaPrecios);
    }

}
