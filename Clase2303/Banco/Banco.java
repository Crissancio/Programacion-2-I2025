package Clase2303.Banco;

public class Banco {
    private float[] usuarios;
    private int tope;


    public Banco(){
        usuarios = new float[10];
        tope = -1;
    }

    public void agregarUsuario(float saldo){
        if(tope < 10){
            tope++;
            usuarios[tope] = saldo;
        }
    }

    public float retirar(int idUser, float montoRetirar){
        if(idUser<=tope){
            if(usuarios[idUser] >= montoRetirar){
                usuarios[idUser] -= montoRetirar;
                return montoRetirar;
            }else{
                System.out.println("Saldo insuficiente");
                return 0;
            }
        }else{
            System.out.println("Usuario no existe");
            return -1;
        }
    }

    public void guardar(int idUser, float monto){
        if(idUser<=tope){
            usuarios[idUser]+=monto;
            System.out.println("Monto guardado");
        }else{
            System.out.println("Usuario no existe");
        }
    }

    public void bonificacion(){
        for(int i = 0; i<=tope; i++){
            float bono = usuarios[i]*0.02f;
            usuarios[i] = usuarios[i]+bono;
        }
    }

    public float mostrarDineroBanco(){
        float total = 0;
        for(int i = 0; i<=tope; i++){
            total += usuarios[i];
        }
        return total;
    }

    public void mostrarUsuarios(){
        for(int i = 0; i<=tope; i++){
            System.out.println("Usuario "+i+": "+usuarios[i]);
        }
    }
}
