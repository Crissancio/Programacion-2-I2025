package Clase2305.recursividad;

public class Main{
    public static void main(String[] args){
        
    }

    public static int sumaVector(int i, int n, int[] v){
        if(i == n){
            return 0;
        }else{
            return v[i] + sumaVector(i+1, n, v);
        }
    }
}