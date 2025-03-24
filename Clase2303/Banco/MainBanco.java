package Clase2303.Banco;

public class MainBanco {
    
    public static void main(String[] args) {
        Banco bancoSol = new Banco();

        bancoSol.agregarUsuario(1000);
        bancoSol.agregarUsuario(2000);
        bancoSol.agregarUsuario(3000);
        bancoSol.agregarUsuario(4000);
        bancoSol.agregarUsuario(50);

        int idUser = 2;
        System.out.println("User "+ idUser+" retiro "+bancoSol.retirar(idUser, 988.12f));

        idUser = 4;
        bancoSol.guardar(idUser, 48.11f);
        System.out.println("\nUser "+ idUser+" guardo "+48.11);

        bancoSol.mostrarUsuarios();

        System.out.println("\nBonificacion");
        bancoSol.bonificacion();
        bancoSol.mostrarUsuarios();

        float total = bancoSol.mostrarDineroBanco();
        System.out.println("\nTotal en el banco: "+total);
    }
}

// Abstraccion de una tienda de productos

// a) agregar 6 productos a la tienda con almenos 5 de stock
// b) actualizar el stock de un producto
// c) vender un producto y mostrar el total de venta
// d) cuantos productos hay en la tienda
