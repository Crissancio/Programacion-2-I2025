package Clase2803.Veterinaria;

public class Main {

    public static void main(String[] args) {
        Dueño dueños[] = new Dueño[3];
        dueños[0] = new Dueño(12345678, 2000, "Juan");
        dueños[1] = new Dueño(87654321, 2001, "Maria");
        dueños[2] = new Dueño(11223344, 2000, "Pedro");

        Mascota mascotas[] = new Mascota[7];
        mascotas[0] = new Mascota(1, 2020, "Firulais", "Perro");
        mascotas[1] = new Mascota(2, 2021, "Miau", "Gato");
        mascotas[2] = new Mascota(3, 2022, "Pajarito", "Ave");
        mascotas[3] = new Mascota(4, 2023, "Tortuga", "Reptil");
        mascotas[4] = new Mascota(5, 2023, "Pececito", "Pez");
        mascotas[5] = new Mascota(6, 2022, "Jorge", "Simio");
        mascotas[6] = new Mascota(7, 2022, "Chucho", "Perro");

        Vacuna vacunas[] = new Vacuna[8];

        vacunas[0] = new Vacuna(12345678, 1, "V1");
        vacunas[1] = new Vacuna(12345678, 2, "V1");
        vacunas[7] = new Vacuna(12345678, 7, "V2");
        vacunas[2] = new Vacuna(87654321, 3, "V2");
        vacunas[3] = new Vacuna(87654321, 4, "V1");
        vacunas[6] = new Vacuna(87654321, 6, "V3");
        vacunas[4] = new Vacuna(11223344, 1, "V3");
        vacunas[5] = new Vacuna(11223344, 5, "V2");

        Veterinaria veterinaria = new Veterinaria(dueños, mascotas, vacunas);
        System.out.println("Mascotas con vacuna V1:");
        veterinaria.mostrarMascotasTipoVacuna("V1");
        System.out.println("");
        System.out.println("");
        veterinaria.mostrarDueñoMasMascotas();
        System.out.println("");
        veterinaria.mostrarDueñoMasMascotas2();

    }
}