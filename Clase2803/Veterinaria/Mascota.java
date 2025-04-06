package Clase2803.Veterinaria;

public class Mascota{
    private  int cod, año;
    private String nombre, tipo;

    public Mascota(int cod, int año, String nombre, String tipo){
        this.cod = cod;
        this.año = año;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return "Mascota{" +
                "cod=" + cod +
                ", año=" + año +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
    public void mostrar(){
        System.out.println("Mascota{" +
                "cod=" + cod +
                ", año=" + año +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                '}');
    }


}