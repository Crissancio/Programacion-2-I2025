package Clase1104.banco;

public class Banco {
    private String nombreBanco;
    private PilaCB cuentas;

    public Banco(String nombreBanco, int cantUsu){
        this.nombreBanco = nombreBanco;
        this.cuentas = new PilaCB(cantUsu);
    }

    public void agregarUsuario(Persona p){
        // Creacion del Id de la Persona
        String idCuenta = ""+ p.getCi() + p.getNombre().charAt(0) + p.getApellido().charAt(0);

        // Busqueda de la existencia de la cuenta
        PilaCB aux = new PilaCB(100);
        boolean sw = false;

        while(!cuentas.esVacia()){
            CuentaBancaria cb = cuentas.eliminar();
            if(cb.getIdCuenta().equals(idCuenta)){
                sw = true;
            }
            aux.adicionar(cb);
        }
        while(!aux.esVacia()){
            cuentas.adicionar(aux.eliminar());
        }

        if(!sw){
            CuentaBancaria cb = new CuentaBancaria(p.getCi(), p.getNombre(), p.getApellido());
            cuentas.adicionar(cb);
        }else{
            System.out.println("Ya existe una cuenta con el ID: " + idCuenta);
        }

    }

    public void eliminarUsuario(Persona p){
        String idCuenta = ""+p.getCi() + p.getNombre().charAt(0) + p.getApellido().charAt(0);

        boolean seEncontro = false;
        PilaCB aux = new PilaCB(100);
        while(! cuentas.esVacia()){
            CuentaBancaria cb = cuentas.eliminar();

            if(cb.getIdCuenta().equals(idCuenta)){
                seEncontro = true;
            }else{
                aux.adicionar(cb);
            }
        }
        while(! aux.esVacia()){
            cuentas.adicionar(aux.eliminar());
        }

        if(seEncontro){
            System.out.println("Se elimino la cuenta con ID: " + idCuenta);
        }else{
            System.out.println("No se encontro la cuenta con ID: " + idCuenta);
        }
    }

    public float retiro(float monto, Persona p){
        String idCuenta = ""+p.getCi() + p.getNombre().charAt(0)+ p.getApellido().charAt(0);

        float saldo = retiro(monto, idCuenta);
        return saldo;
        
    }

    private float retiro(float monto, String cuenta){
        PilaCB aux = new PilaCB(100);
        float saldo = 0;
        while(! cuentas.esVacia()){
            CuentaBancaria cb = cuentas.eliminar();

            if(cb.getIdCuenta().equals(cuenta))
                saldo = cb.retirar(monto);
        
            aux.adicionar(cb);
        }

        while(! aux.esVacia()){
            cuentas.adicionar(aux.eliminar());
        }

        return saldo;
    }

    public void deposito(float monto, Persona p){
        String idCuenta = ""+p.getCi() + p.getNombre().charAt(0)+ p.getApellido().charAt(0);
        deposito(monto, idCuenta);
    }

    private void deposito(float monto, String cuenta){
        PilaCB aux = new PilaCB(100);

        boolean seDeposito = false;
        while(!cuentas.esVacia()){
            CuentaBancaria cb = cuentas.eliminar();
            if(cb.getIdCuenta().equals(cuenta)){
                cb.depositar(monto);
                seDeposito = true;
            }
            aux.adicionar(cb);
        }

        while(!aux.esVacia()){
            cuentas.adicionar(aux.eliminar());
        }
        if(seDeposito){
            System.out.println("Se deposito: " + monto + " en la cuenta: " + cuenta);
        }else{
            System.out.println("No se encontro la cuenta: " + cuenta);
        }
    }

    public void transaccion(Persona p, String cuenta, float monto){
        String idCuenta = ""+p.getCi() + p.getNombre().charAt(0)+ p.getApellido().charAt(0);

        float montoRetirado = retiro(monto, idCuenta);

        if(montoRetirado != 0){
            deposito(montoRetirado, cuenta);
        }else{
            System.out.println("No se pudo realizar la transaccion, saldo insuficiente");
        }
        
    }

    public void verificarDatos(Persona p){
        String idCuenta =""+ p.getCi() + p.getNombre().charAt(0)+ p.getApellido().charAt(0);
        
        PilaCB aux = new PilaCB(100);
        boolean seEncontro = false;

        while(! cuentas.esVacia()){
            CuentaBancaria cb = cuentas.eliminar();
            if(cb.getIdCuenta().equals(idCuenta)){
                cb.mostrar();
                seEncontro = true;
            }
            aux.adicionar(cb);
        }
        while(! aux.esVacia()){
            cuentas.adicionar(aux.eliminar());
        }

        if(!seEncontro){
            System.out.println("No se encontro la cuenta con ID: " + idCuenta);
        }
    }



}
