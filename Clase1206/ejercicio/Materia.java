package Clase1206.ejercicio;

public class Materia {
    private String sigla, desc;
    private float nota1, nota2;
    private Docente docente;

    public Materia(String sigla, String desc, float nota1, float nota2, Docente docente){
        this.sigla = sigla;
        this.desc = desc;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.docente = docente;
    }

    public String toString(){
        return "\nMateria: " + sigla + ", Descripcion: " + desc + ", Nota 1: " + nota1 + ", Nota 2: " + nota2 + ", Docente: " + docente;
    }

    public float notaTotal(){
        return (nota1+nota2)/2;
    }

    public boolean tieneDoncente(String nom, String ape){
         return docente.getNom().equals(nom) && docente.getApe().equals(ape);
    }
}
