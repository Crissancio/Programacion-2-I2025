package Clase2504.examenFilaA;

public class LineaTeleferico {
    String color;
    String tramo;
    int nroCabinas;
    int nroEmpleados;
    String[][] empleados;
    int[] edades;
    long[] sueldos;

    public LineaTeleferico(String color, String tramo, int nroCabinas, int nroEmpleados, String[][] empleados, int[] edades, long[] sueldos) {
        this.color = color;
        this.tramo = tramo;
        this.nroCabinas = nroCabinas;
        this.nroEmpleados = nroEmpleados;
        this.empleados = empleados;
        this.edades = edades;
        this.sueldos = sueldos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTramo() {
        return tramo;
    }

    public void setTramo(String tramo) {
        this.tramo = tramo;
    }

    public int getNroCabinas() {
        return nroCabinas;
    }

    public void setNroCabinas(int nroCabinas) {
        this.nroCabinas = nroCabinas;
    }

    public int getNroEmpleados() {
        return nroEmpleados;
    }

    public void setNroEmpleados(int nroEmpleados) {
        this.nroEmpleados = nroEmpleados;
    }

    public String[][] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(String[][] empleados) {
        this.empleados = empleados;
    }

    public int[] getEdades() {
        return edades;
    }

    public void setEdades(int[] edades) {
        this.edades = edades;
    }

    public long[] getSueldos() {
        return sueldos;
    }

    public void setSueldos(long[] sueldos) {
        this.sueldos = sueldos;
    }
    
    public void eliminarPorApellido(String apellido){
        String nEmpleados[][] = new String[100][3];
        int nEdades[] = new int[100];
        long nSueldos[] = new long[100];
        int j = 0;
        
        for(int i = 0; i< nroEmpleados; i++){
            if(!empleados[1][i].equals(apellido) && !empleados[2][i].equals(apellido)){
                nEmpleados[0][j] = empleados[0][i];
                nEmpleados[1][j] = empleados[1][i];
                nEmpleados[2][j] = empleados[2][i];

                nEdades[j] = edades[i];
                nSueldos[j] = sueldos[i];
                j++;
            }
        }

        nroEmpleados = j;
        empleados = nEmpleados;
        edades = nEdades;
        sueldos = nSueldos;
    }

    public void adicionarEmpleado(String nom, String pat, String mat, int edad, long sueldo){
        if(nroEmpleados < 100){
            empleados[0][nroEmpleados-1] = nom;
            empleados[1][nroEmpleados-1] = pat;
            empleados[2][nroEmpleados-1] = mat;
            edades[nroEmpleados-1] = edad;
            sueldos[nroEmpleados-1] = sueldo;
            nroEmpleados++;
        }else{
            System.out.println("NO HAY ESPACIO PARA MAS EMPLEADOS");
        }
    }

    public void transferirEmpleadoX(String nom, String pat, String mat, LineaTeleferico linea){
        String nEmpleados[][] = new String[100][3];
        int nEdades[] = new int[100];
        long nSueldos[] = new long[100];
        int j = 0;

        int edadN = 0;
        long sueldoN = 0;

        for(int i = 0; i < nroEmpleados; i++){
            if(empleados[0][i].equals(nom) && empleados[1][i].equals(pat) && empleados[2][i].equals(mat)){
                edadN = edades[i];
                sueldoN = sueldos[i];
            }else{
                nEmpleados[0][j] = empleados[0][i];
                nEmpleados[1][j] = empleados[1][i];
                nEmpleados[2][j] = empleados[2][i];

                nEdades[j] = edades[i];
                nSueldos[j] = sueldos[i];
                j++;
            }
        }

        nroEmpleados = j;
        empleados = nEmpleados;
        edades = nEdades;
        sueldos = nSueldos;

        linea.adicionarEmpleado(nom, pat, mat, edadN, sueldoN);
    }

    public void mayorEdad(){
        int max = 0;
        for(int i = 0; i < nroEmpleados; i++){
            if(edades[i]>max){
                max = edades[i];
            }
        }

        for(int i = 0; i < nroEmpleados; i++){
            if(edades[i] == max){
                System.out.println(empleados[0][i]+" "+empleados[1][i]+" "+empleados[2][i]);
            }
        }
    }

    public void mayorSueldo(){
        long max = 0;
        for(int i = 0; i < nroEmpleados; i++){
            if(sueldos[i]>max){
                max = sueldos[i];
            }
        }

        for(int i = 0; i < nroEmpleados; i++){
            if(sueldos[i] == max){
                System.out.println(empleados[0][i]+" "+empleados[1][i]+" "+empleados[2][i]);
            }
        }
    }

    public void mostrar(){
        System.out.println(color+" "+tramo);
        for(int i = 0; i < nroEmpleados; i++){
            System.out.println("\t"+empleados[0][i]+" "+empleados[1][i]+" "+empleados[2][i]);
        }
        System.out.println("");
    }
}