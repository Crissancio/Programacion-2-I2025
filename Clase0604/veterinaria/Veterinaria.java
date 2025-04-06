package Clase0604.veterinaria;

public class Veterinaria {
    private Mascota[] mascotas;
    private Persona[] dueños;
    private Veterinario[] veterinarios;

    public Veterinaria(Mascota[] mascotas, Persona[] dueños, Veterinario[] veterinarios) {
        this.mascotas = mascotas;
        this.dueños = dueños;
        this.veterinarios = veterinarios;
    }


    public static void main(String[] args) {
        // mascotas
        Mascota m1 = new Mascota("Firulais", "Perro", "Macho", 1111);
        Mascota m2 = new Mascota("Lulu", "Gato", "Hembra", 1113);
        Mascota m3 = new Mascota("Panchito", "Perro", "Macho", 1113);
        Mascota m4 = new Mascota("Mimi", "Gato", "Hembra", 1111);
        Mascota m5 = new Mascota("Lola", "Perro", "Hembra", 1115);
        Mascota m6 = new Mascota("Rocco", "Gato", "Macho", 1116);

        Mascota mascotas[] = {m1, m2, m3, m4, m5, m6};

        //duesños

        Persona d1 = new Persona("Gonzalez", "Juan", 1111);
        Persona d2 = new Persona("Lopez", "Maria", 1112);
        Persona d3 = new Persona("Martinez", "Pedro", 1113);
        Persona d4 = new Persona("Fernandez", "Ana", 1115);
        Persona d5 = new Persona("Garcia", "Luis", 1116);

        Persona dueños[] = {d1, d2, d3, d4, d5};

        //veterinarios
        Veterinario v1 = new Veterinario("Pérez", "Carlos", 1112, 500, 8, 16);
        Veterinario v2 = new Veterinario("Gómez", "Ana", 1114, 600, 9, 17);
        Veterinario v3 = new Veterinario("Fernandez", "Ana", 1115, 700, 10, 18);
        Veterinario v4 = new Veterinario("Garcia", "Luis", 1116, 800, 11, 19);
        
        Veterinario veterinarios[] = {v1, v2, v3, v4};

        Veterinaria veterinaria = new Veterinaria(mascotas, dueños, veterinarios);
        //mostrar a las mascotas de el dueño con ci X
    
        //mostrar al dueño de la mascota con nombre X

        // mostrar los veterinarios que tengan mascotas


    }

}
