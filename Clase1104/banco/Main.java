package Clase1104.banco;

public class Main {

    public static void main(String[] args) {
        // Your code here
        Banco bancoSol = new Banco("Banco Sol", 50);

        Persona p1 = new Persona(1111, 17, "Jose", "Perez");
        Persona p2 = new Persona(2222, 18, "Maria", "Lopez");
        Persona p3 = new Persona(3333, 19, "Juan", "Gonzalez");
        Persona p4 = new Persona(4444, 20, "Ana", "Martinez");
        Persona p5 = new Persona(5555, 21, "Luis", "Fernandez");
        Persona p6 = new Persona(6666, 22, "Laura", "Garcia");

        bancoSol.agregarUsuario(p1);
        bancoSol.agregarUsuario(p2);
        bancoSol.agregarUsuario(p3);
        bancoSol.agregarUsuario(p5);
        bancoSol.agregarUsuario(p6);
        bancoSol.agregarUsuario(p4);

        bancoSol.eliminarUsuario(p2);

        float retiroP6 = bancoSol.retiro(100, p6);
        if(retiroP6 == 0){
            System.out.println("No se pudo realizar el retiro de 100 de la cuenta de " + p6.getNombre());
        }else{
            System.out.println("Se realizo el retiro de "+retiroP6+" de la cuenta de " + p6.getNombre());
        }

        bancoSol.deposito(180, p3);
        bancoSol.deposito(2280, p1);
        bancoSol.deposito(10, p4);
        bancoSol.deposito(110, p5);
        bancoSol.deposito(1890, p6);

        bancoSol.transaccion(p1, "4444AM", 120);

        bancoSol.verificarDatos(p4);


        // Implementar un metodo para darles a los usuarios un bono del 2% respecto a sus saldo





    }

}