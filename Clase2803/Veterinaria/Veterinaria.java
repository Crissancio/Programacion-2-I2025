package Clase2803.Veterinaria;

public class Veterinaria{
    private Dueño dueños[];
    private Mascota mascotas[];
    private Vacuna vacunas[];

    public Veterinaria(Dueño[] dueños, Mascota[] mascotas, Vacuna[] vacunas){
        this.dueños = dueños;
        this.mascotas = mascotas;
        this.vacunas = vacunas;
    }

    public void mostrarMascotasTipoVacuna(String tipoV){
        for (int i = 0; i<vacunas.length; i++){
            if(vacunas[i].getTipoVacuna().equals(tipoV)){
                int ciM = vacunas[i].getCiMascota();
                for(int j = 0; j<mascotas.length;j++){
                    if(mascotas[j].getCod() == ciM){
                        mascotas[j].mostrar();
                    }
                }
            }
        }
    }

    public void mostrarDueñoMasMascotas(){
        int max = 0;
        // int ciDueño = 0;
        Dueño dueñoMax = null;
        for(int i = 0; i<dueños.length; i++){
            int cont = 0;

            for(int j = 0; j < vacunas.length; j++){
                if(dueños[i].getCi() == vacunas[j].getCiDueño()){
                    cont++;
                }
            }
            if(cont > max){
                max = cont;
                // ciDueño = dueños[i].getCi();
                dueñoMax = dueños[i];
            }

        }

        System.out.println("El dueño con más mascotas es: " + dueñoMax.getNomd() + " con " + max + " mascotas.");
        /* 
        for(int i = 0; i<dueños.length; i++){
            if(dueños[i].getCi() == ciDueño){
                System.out.println("El dueño con más mascotas es: " + dueños[i].getNomd());
            }
        }
        */
    }


    
}