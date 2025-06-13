package Clase2504.examenFilaA;

public class Main {
    public static void main(String[] args) {

        String e1[][] = new String[3][100];
        e1[0][0] = "Pedro";
        e1[1][0] = "Rojas";
        e1[2][0] = "Luna";

        e1[0][1] = "Lucy";
        e1[1][1] = "Sosa";
        e1[2][1] = "Rios";

        e1[0][2] = "Ana";
        e1[1][2] = "Perez";
        e1[2][2] = "Rojas";

        int ed1[] = new int[100];
        ed1[0] = 35;
        ed1[1] = 43;
        ed1[2] = 26;

        long s1[] = new long[100];
        s1[0] = 2500;
        s1[1] = 3250;
        s1[2] = 2700;


        String e2[][] = new String[3][100];
        e2[0][0] = "Jorge";
        e2[1][0] = "Callejas";
        e2[2][0] = "Linares";

        e2[0][1] = "Rosario";
        e2[1][1] = "Trevi";
        e2[2][1] = "Solares";

        e2[0][2] = "Gloria";
        e2[1][2] = "Alcon";
        e2[2][2] = "Trevi";

        int ed2[] = new int[100];
        ed2[0] = 18;
        ed2[1] = 66;
        ed2[2] = 29;

        long s2[] = new long[100];
        s2[0] = 2500;
        s2[1] = 3250;
        s2[2] = 2500;

        

        LineaTeleferico t1 = new LineaTeleferico("Rojo", "Cota-Cota", 36, 3, e1, ed1, s1);
        LineaTeleferico t2 = new LineaTeleferico("Verde", "Mallasa", 28, 3, e2, ed2, s2);

        t1.mostrar();
        t2.mostrar();
    }   
}
