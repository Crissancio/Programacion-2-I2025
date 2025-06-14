package EXAMENFINAL.persistencia.java;

public class Fraternidad {
    private String nombre;
    private String danza;
    private int nroDanzarines;
    private Danzarin[] d;

    public Fraternidad(String nombre, String danza, int nroDanzarines) {
        this.nombre = nombre;
        this.danza = danza;
        this.nroDanzarines = nroDanzarines;
        this.d = new Danzarin[100]; // según el diagrama
    }

    public void agregarDanzarin(Danzarin danzarin, int index) {
        if(index < 100) {
            d[index] = danzarin;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fraternidad: ").append(nombre).append(" - Danza: ").append(danza).append("\n");
        for (int i = 0; i < nroDanzarines; i++) {
            if (d[i] != null)
                sb.append(" - ").append(d[i].toString()).append("\n");
        }
        return sb.toString();
    }
    /*
     * public string toString() {
     *      String res = "Fraternidad: " + nombre + " - Danza: " + "danza" +"\n";
            for (int i = 0; i < nroDanzarines; i++) {
                if (d[i] != null)
                    res += " - " + d[i].toString() + "\n"; 
            }
            return res;
     * }
     */

    public void setNroDanzarines(int index) {
        if (index < 100) {
            this.nroDanzarines = index;
        } else {
            System.out.println("No se pueden agregar más danzarines, el límite es 100.");
        }
    }

    public double promedioEdadGenero(String genero) {
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < nroDanzarines; i++) {
            if (d[i] != null && d[i].genero.equalsIgnoreCase(genero)) {
                suma += d[i].edad;
                contador++;
            }
        }
        return (contador > 0) ? (double) suma / contador : 0;
    }

    public void mostrarDanzarinesConMasParticipaciones() {
        int max = -1;
        for (int i = 0; i < nroDanzarines; i++) {
            if (d[i] != null && d[i].getNroParticipaciones() > max) {
                max = d[i].getNroParticipaciones();
            }
        }

        System.out.println("Danzarines con más participaciones (" + max + "):");

        for (int i = 0; i < nroDanzarines; i++) {
            if (d[i] != null && d[i].getNroParticipaciones() == max) {
                System.out.println(" - " + d[i].toString());
            }
        }
    }

    public String geNombre() {
        return nombre;
    }
}
